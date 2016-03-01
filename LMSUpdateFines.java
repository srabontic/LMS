package librarymanagementsys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LMSUpdateFines {
    private static DbConnection db;
    private static Connection con;
    private static PreparedStatement stat;
    private static ResultSet rs;
    private static ResultSet rs_fine;
    
    
    
    
    
    public static void refreshFineTable(){
        int loan_id;
        float fine_amount;
        int paid_fines_sw = 0;
        try {
            db = new DbConnection();
            con = db.getConnection();
            //case 1: insert/update fine when book has been returned
            String query = "SELECT loan_id , DATEDIFF(date_in,due_date)*0.25 as amount FROM BOOK_LOANS WHERE date_in IS NOT NULL AND DATEDIFF(date_in,due_date)>0 and DATEDIFF(curdate(),due_date) > 0;";
            stat = con.prepareStatement(query);
            rs = stat.executeQuery();
            while(rs.next()){
            loan_id = rs.getInt("loan_id");
            fine_amount = rs.getFloat("amount"); 
				
            query = "SELECT loan_id, fine_amt, paid FROM FINES WHERE loan_id = "+loan_id+"";
            stat = con.prepareStatement(query);
            rs_fine = stat.executeQuery();
            if(!rs_fine.isBeforeFirst()){
                    // insert new fine record for particular loan id if it does not exist in fines table
                    query = "INSERT INTO FINES(loan_id,fine_amt,paid) values("+loan_id+","+fine_amount+","+0+")";
                    stat = con.prepareStatement(query);
                    stat.executeUpdate();
            }
            else{
                        query = "UPDATE FINES set fine_amt = "+fine_amount+" WHERE loan_id = "+loan_id+"";
                        stat = con.prepareStatement(query);				
                        stat.executeUpdate();   
		}
            }
            //Case 2: insert/update fine when book has fine and still not returned
            String query1 = "SELECT loan_id , DATEDIFF(curdate(),due_date)*0.25 as amount FROM BOOK_LOANS WHERE date_in IS NULL AND DATEDIFF(curdate(),due_date) > 0;";
            stat = con.prepareStatement(query1);
            rs = stat.executeQuery();
            while(rs.next()){	
                loan_id = rs.getInt("loan_id");
                fine_amount = rs.getFloat("amount");
		query = "SELECT * FROM FINES WHERE loan_id = "+loan_id+"";
                stat = con.prepareStatement(query);
		rs_fine = stat.executeQuery();
		if(!rs_fine.isBeforeFirst()){
                    // insert new fine record for particular loan id 
                    query = "INSERT INTO FINES(loan_id,fine_amt,paid) values("+loan_id+","+fine_amount+","+0+")";
                    stat = con.prepareStatement(query);
                    stat.executeUpdate();
		}
		else{
                    query = "UPDATE FINES set fine_amt = "+fine_amount+" WHERE loan_id = "+loan_id+"";
                    stat = con.prepareStatement(query);				
                    stat.executeUpdate();
		}
		}
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LMSUpdateFines.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LMSUpdateFines.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

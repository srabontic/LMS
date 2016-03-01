package librarymanagementsys;

import com.mysql.jdbc.StringUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LMSCheckOutBooks extends javax.swing.JFrame {
    private String book_id_in = "";
    private String branch_id_in = "";
    private String cardno_in ="";
    private int valid_book_id = 0;
    private int valid_branch_id = 0;
    private int valid_card_no = 0;
    private int no_of_loans = 0;
    private int fines_count = 0;
    private int total_no_of_copies = 0;
    private int loan_copies = 0;
    private int insert_book_id = 0;
    private String insert_book_id1 = "";
    
    JFrame frame = new JFrame();
    private DbConnection db;
    private Connection con;
    private PreparedStatement stat;
    private ResultSet rs;
    /**
     * Creates new form LMSCheckOutBooks
     */
    public LMSCheckOutBooks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Check Out Books");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Book ID*");

        jLabel3.setText("Branch ID*");

        jLabel4.setText("Card No*");

        jTextField1.setText(" ");

        jTextField2.setText(" ");

        jTextField3.setText(" ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jTextField3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Home button
        dispose();
        new LMSHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // check out button 
        book_id_in = jTextField1.getText().trim();
	branch_id_in = jTextField2.getText().trim();		
	cardno_in = jTextField3.getText().trim();
        if(book_id_in.isEmpty() || branch_id_in.isEmpty() || cardno_in.isEmpty()){
			JOptionPane.showMessageDialog(frame, "Please fill all the fields");
		}
        else{
            try {
                db = new DbConnection();
                con = db.getConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
            //check if book_id is valid
            if (book_id_in.isEmpty()){
                } else{
                try {
                    String query="SELECT book_id as book_id from BOOK WHERE book_id LIKE '%"+book_id_in+"%';";
                    stat = con.prepareStatement(query);
                    rs=stat.executeQuery();
                    if (rs.next()) {
                        valid_book_id  = 1;
                        //insert_book_id = Integer.toString(rs.getInt("book_id"));
                        insert_book_id = rs.getInt("book_id");
                        insert_book_id1 = String.format("%010d",insert_book_id);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Book ID does not exist");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            //check if branch id is valid
            if (branch_id_in.isEmpty()){
            }
            else{
                try {
                    String query="SELECT branch_id from LIBRARY_BRANCH WHERE branch_id = '"+branch_id_in+"';";
                    stat = con.prepareStatement(query);
                    rs=stat.executeQuery( );
                    if (rs.next()) {
                        valid_branch_id = 1;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Branch Id does not exist");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //check if crad no is valid
            if (cardno_in.isEmpty()){
            }
            else{
                try {
                    String query="SELECT card_no from BORROWER WHERE card_no = '"+cardno_in+"';";
                    stat = con.prepareStatement(query);
                    rs=stat.executeQuery();
                    if (rs.next()) {
                        valid_card_no  = 1;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Card Number does not exist");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (valid_book_id != 0 && valid_book_id != 0 && valid_book_id != 0){
                try {
                    //check if borrower has < 3 books
                        String query="SELECT count(*) as no_of_loans from BOOK_LOANS WHERE card_no = '"+cardno_in+"' and date_in IS NULL";
                        stat = con.prepareStatement(query);
                        rs=stat.executeQuery();
                        if (rs.next()) {
                            no_of_loans = rs.getInt("no_of_loans");
                        }
                    //check if any unpaid fines are there for the borrower
                        query = "SELECT count(*) as fine_count from book_loans b, fines f WHERE b.loan_id = f.loan_id AND b.card_no = '"+cardno_in+"' AND date_in IS NOT NULL AND paid = 0;";
                        stat = con.prepareStatement(query);
                        rs=stat.executeQuery();
                        if(rs.next()){
                            fines_count = rs.getInt("fine_count");
                        }
                    //get the number of copies of a book at the given branch
                        query = "SELECT no_of_copies from BOOK_COPIES WHERE branch_id ='"+branch_id_in+"' and book_id ='"+book_id_in+"';";
			stat = con.prepareStatement(query);
			rs=stat.executeQuery();
			if(rs.next()){
				total_no_of_copies = rs.getInt("no_of_copies");
			}
                    //get the number of copies of the book checked out from the branch 
                        query = "SELECT count(*) as count from BOOK_LOANS WHERE branch_id ='"+branch_id_in+"' and book_id ='"+book_id_in+"' and date_in IS NULL;";
			stat = con.prepareStatement(query);
			rs=stat.executeQuery();
			if(rs.next()){
                            loan_copies = rs.getInt("count");
			}
                    //check out book
                        //book_id_in = "0195153448";
                        if(no_of_loans<3 && ((loan_copies < total_no_of_copies) || (loan_copies ==0 && total_no_of_copies == 0 )) && fines_count==0){
                            query = "INSERT INTO BOOK_LOANS(book_id,branch_id,card_no,date_out,due_date) "
				    + "VALUES('"+insert_book_id1+"','"+branch_id_in+"','"+cardno_in+"',curdate(),adddate(curdate(),14));" ; 
                            stat.executeUpdate(query);
                            JOptionPane.showMessageDialog(frame, "Check Out Successful");
                            resetFields();
                        }
                        else{
                            //throw error for invalid cases
                            if(no_of_loans >= 3){
                                    JOptionPane.showMessageDialog(frame, "Borrower has already checked out 3 books");
                            }
                            else if(loan_copies != 0 && total_no_of_copies!= 0 && loan_copies >= total_no_of_copies){
                                    JOptionPane.showMessageDialog(frame, "Book Copies not available");
                            }
                            else if(fines_count > 0){
                                    JOptionPane.showMessageDialog(frame, "Please settle outstanding fines before checking out a book");
                            }
                        }
                } catch (SQLException ex) {
                    Logger.getLogger(LMSCheckOutBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LMSCheckOutBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LMSCheckOutBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LMSCheckOutBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LMSCheckOutBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LMSCheckOutBooks().setVisible(true);
            }
        });
    }
    private void resetFields() {
	jTextField1.setText("");
	jTextField2.setText("");
	jTextField3.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

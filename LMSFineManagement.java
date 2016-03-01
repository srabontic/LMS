package librarymanagementsys;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarymanagementsys.DbConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LMSFineManagement extends javax.swing.JFrame {

    /**
     * Creates new form LMSFineManagement
     */
    private String cardno_in = "";
    private String selected_cardno = "";
    private int valid_card_no = 0;
    private int card_has_fine = 0;
    private int  cardno = 0;
    private String borrName  = "";
    private String fine_amount = "";
    private String fine_balance = "";
    private String selected_fine_balance = "";
    private int return_count = 0;
    private int loan_count = 0;
    
    
    JFrame frame = new JFrame();
    private DbConnection db;
    private Connection con;
    private PreparedStatement stat;
    private ResultSet rs;
    
    public LMSFineManagement() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Library Fines");

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText(" ");
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("View Individual Fine");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fine Menu");

        jCheckBox3.setText("View unpaid Fines");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("View paid Fines");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Card No", "Borrower Name", "Total Fine ($)", "Fine Balance ($)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Search");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Card No");
        jLabel3.setEnabled(false);

        jButton5.setText("Refresh All Fines");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addGap(102, 138, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox4)
                                                    .addComponent(jCheckBox3))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(1, 1, 1)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pay Fine");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton2)
                        .addGap(83, 83, 83)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jCheckBox1.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // search button
        db = new DbConnection();
        try {
            con = db.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        //view individual fine
        if (jCheckBox1.isSelected() == true){
            try {
                cardno_in=jTextField2.getText().trim();
                
                if (cardno_in.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please enter card number");
                    return;
                }else{
                    //check if a valid card no
                    String query="SELECT card_no FROM BORROWER WHERE card_no = '"+cardno_in+"';";
                    stat = con.prepareStatement(query);
                    rs=stat.executeQuery();
                    if (rs.next()) {
                        valid_card_no = 1;
                    }else{
			JOptionPane.showMessageDialog(this, "Card No does not exist");
                        jTextField2.setText("");
                    }
                    if (valid_card_no != 0){
                        //check if the card has any fine
                        query="SELECT f.loan_id from FINES f,BOOK_LOANS l WHERE f.loan_id=l.loan_id and l.card_no = '"+cardno_in+"';";
			stat = con.prepareStatement(query);
			rs=stat.executeQuery();
			if (rs.next()) { card_has_fine =1;}
                        else{
                            JOptionPane.showMessageDialog(this, "Card No has no fine");
			}
                        if (card_has_fine != 0){
                            //get the fine
                            query = "select l.card_no, CONCAT(B.fname ,' ', B.lname) as borrower_name, Sum(fine_amt) as fine_amt,"
                                    + "(select Sum(fine_amt) from borrower B,book_loans,fines where fines.loan_id= book_loans.loan_id AND book_loans.card_no = B.card_no AND paid="+0+" and book_loans.card_no = '"+cardno_in+"') as fineBalance,"
                                    + " paid from borrower B,book_loans l,fines where fines.loan_id= l.loan_id AND l.card_no = B.card_no and l.card_no = '"+cardno_in+"';";				
                            stat = con.prepareStatement(query);
                            rs = stat.executeQuery();
                            if(!rs.isBeforeFirst()){
                                JOptionPane.showMessageDialog(this, "No Record Found");
                            }
                            clearTable();
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                            while (rs.next()) {				 
                            cardno = rs.getInt("card_no");
                            borrName = rs.getString("borrower_name");
                            fine_amount=rs.getString("fine_amt");
                            fine_balance=rs.getString("fineBalance");
                            if(fine_balance==null){
                                fine_balance="0.00";
                            }
                            model.insertRow(jTable1.getRowCount(), new Object[] {cardno, borrName, fine_amount, fine_balance});
                        }
                            
                    }
                }
              }               
            } catch (SQLException ex) {
                Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
            //reset fields and disable
            //jButton4.setEnabled(false);
            //jLabel3.setEnabled(false);
            //jTextField2.setEnabled(false);
            
        }
        //view Unpaid fines
        if (jCheckBox4.isSelected() == true || jCheckBox3.isSelected()){
            try {
                String query =  "SELECT a.card_no as card_no, a.borrower_name as borrower_name, a.fine_amt as fine_amt, b.fine_balance as fineBalance FROM "
                        +"(SELECT l.card_no as card_no, CONCAT(B.fname ,' ', B.lname) as borrower_name, Sum(f.fine_amt) as fine_amt "
                        +	  "FROM BORROWER B,BOOK_LOANS l,FINES f WHERE f.loan_id= l.loan_id AND l.card_no = B.card_no GROUP BY l.card_no ) AS a "
                        +	"LEFT JOIN "
                        +	  "(SELECT BL.card_no as card_no, Sum(F.fine_amt) as fine_balance FROM BORROWER B,BOOK_LOANS BL,FINES F WHERE F.loan_id= BL.loan_id "
                        +	"AND BL.card_no = B.card_no AND F.paid="+0+" GROUP BY BL.card_no) AS b "
                        +	"ON a.card_no = b.card_no;";
                
                stat = con.prepareStatement(query);
                rs = stat.executeQuery();
                if(!rs.isBeforeFirst()){
                    JOptionPane.showMessageDialog(this, "No Record Found");
                }
                clearTable();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (rs.next()) {
                    try {
                        cardno = rs.getInt("card_no");
                        borrName = rs.getString("borrower_name");
                        fine_amount=rs.getString("fine_amt");
                        fine_balance=rs.getString("fineBalance");
                        if(fine_balance==null){
                            fine_balance="0.00";
                        }
                        if (jCheckBox3.isSelected() == true){
                            //display unpaid fines
                            if (!fine_balance.equals("0.00")){
                            model.insertRow(jTable1.getRowCount(), new Object[] {cardno, borrName, fine_amount, fine_balance});
                            }
                        }
                        else if (jCheckBox4.isSelected() == true){
                            //display paid fines
                            if (fine_balance.equals("0.00")){
                            model.insertRow(jTable1.getRowCount(), new Object[] {cardno, borrName, fine_amount, fine_balance});
                            }   
                        }    
                    } catch (SQLException ex) {
                        Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(jTable1.getRowCount()==0){
	        	 if(jCheckBox3.isSelected() == true){
	        		 JOptionPane.showMessageDialog(frame, "All fines are paid");	 
	        	 }
	        	 else if(jCheckBox4.isSelected() == true){
	        		 JOptionPane.showMessageDialog(frame, "No Paid Fines");	 
	        	 }
	        }
            } catch (SQLException ex) {
                Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //view paid fines
        if (jCheckBox3.isSelected() == true){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // Pay fine
            //int[] selected_row = jTable1.getSelectedRows();
            int selected_row = jTable1.getSelectedRow();
            selected_cardno = jTable1.getValueAt(selected_row, 0).toString();
            selected_fine_balance=jTable1.getValueAt(selected_row, 3).toString();

            db = new DbConnection();
            con = db.getConnection();
            if (selected_fine_balance.equals("0.00"))
		{
                    JOptionPane.showMessageDialog(frame, "No outstanding fine for Card No: "+selected_cardno);
		}
            else{
                // get the number of books checked in for given borrower
                String query1 = "SELECT count(f.loan_id) as return_count FROM FINES f, BOOK_LOANS l  WHERE f.loan_id=l.loan_id and l.card_no="+selected_cardno+" and l.date_in is not NULL;";
                stat = con.prepareStatement(query1);
                rs=stat.executeQuery();
                while (rs.next()) {	
                         return_count = rs.getInt("return_count");
                }
					
                // get the number of books checked out for given borrower
                String query2 = "SELECT count(f.loan_id) as loan_count FROM FINES f, BOOK_LOANS l  WHERE f.loan_id=l.loan_id and l.card_no="+selected_cardno+";";
                stat = con.prepareStatement(query2);
                rs=stat.executeQuery();
                while (rs.next()) {	
                   loan_count = rs.getInt("loan_count");
                }
                //full payment possible when all checked out books are checked in
                if (loan_count!=0 && return_count == 0){
                   JOptionPane.showMessageDialog(frame, "You have not returned the book(s)!"); 
                   return;
                }
                if (return_count!=0 && loan_count!=0 && return_count==loan_count)
		{
                    String query3 = "UPDATE FINES set paid=1 where loan_id in (SELECT f.loan_id FROM (SELECT * from FINES) f, BOOK_LOANS l  WHERE f.loan_id=l.loan_id and l.card_no="+selected_cardno+" and l.date_in is not NULL);";
                    stat = con.prepareStatement(query3);
                    stat.executeUpdate();	
                    JOptionPane.showMessageDialog(frame, "Fine Payment successful");
                    clearTable();
		}
		else
		{
                    JOptionPane.showMessageDialog(frame, "No partial payment allowed, please select all fines for card no:" + selected_cardno );
		}
                
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Home button
        dispose();
        new LMSHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Reset button
        resetFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        //view individual fines
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jButton4.setEnabled(true);
        jLabel3.setEnabled(true);
        jTextField2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            //Refresh and view all fines in databse
            clearTable();
            db = new DbConnection();
            con = db.getConnection();
            //refresh fines table
            LMSUpdateFines.refreshFineTable();
            //display fines table all data
            String query = "SELECT a.card_no as card_no, a.borrower_name as borrower_name, a.fine_amt as fine_amt, b.fine_balance as fineBalance FROM "
				  +"(SELECT l.card_no as card_no, CONCAT(B.fname ,' ', B.lname) as borrower_name, Sum(f.fine_amt) as fine_amt "
					+	  "FROM BORROWER B,BOOK_LOANS l,FINES f WHERE f.loan_id= l.loan_id AND l.card_no = B.card_no GROUP BY l.card_no ) AS a "
					+	"LEFT JOIN "
					+	  "(SELECT BL.card_no as card_no, Sum(F.fine_amt) as fine_balance FROM borrower B,BOOK_LOANS BL,FINES F WHERE F.loan_id= BL.loan_id " 
					+	"AND BL.card_no = B.card_no AND F.paid="+0+" GROUP BY BL.card_no) AS b "
					+	"ON a.card_no = b.card_no;";
            stat = con.prepareStatement(query);
            rs = stat.executeQuery();
            if(!rs.isBeforeFirst()){
                   JOptionPane.showMessageDialog(frame, "No Record Found");
		}
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {				 
            cardno = rs.getInt("card_no");
            borrName = rs.getString("borrower_name");
            fine_amount=rs.getString("fine_amt");
            fine_balance=rs.getString("fineBalance");
                if(fine_balance==null){
                    fine_balance="0.00";
                   }
            model.insertRow(jTable1.getRowCount(), new Object[] {cardno, borrName, fine_amount, fine_balance});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LMSFineManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(LMSFineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LMSFineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LMSFineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LMSFineManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LMSFineManagement().setVisible(true);
            }
        });
    }
    private void resetFields() {

	jTextField2.setText("");
        jCheckBox1.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox1.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jButton4.setEnabled(false);
        jLabel3.setEnabled(false);
        jTextField2.setEnabled(false);
        
        //initialize table (pending)
        clearTable();
    }
    private void clearTable(){
       DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int rows = dtm.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            dtm.removeRow(i); 
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package barangay.information.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author ASUS ROG STRIX
 */
public class FamilyHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form FamilyHome
     */
    public FamilyHome() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        FamilyHome();
    }
     Connection Con = null;
        Statement St = null;
        ResultSet Rs= null;
public void FamilyHome(){
    try{
        Con= DriverManager.getConnection("jdbc:mysql://localhost:3307/brgydata","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("select Head_ID,Home_ID,Family_Name,Family_Address,House_number from familyhead inner join familyhome on familyhead.Head_ID=familyhome.headID_fk");
        Familyhomeinfo.setModel(DbUtils.resultSetToTableModel(Rs));
        
    }catch(SQLException e){
        e.printStackTrace();
        
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Familyhomeinfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Familyheadid = new javax.swing.JTextField();
        familyname = new javax.swing.JTextField();
        familyaddress = new javax.swing.JTextField();
        housenumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        panel1.setBackground(new java.awt.Color(0, 153, 51));

        panel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS ROG STRIX\\Downloads\\icons8-defend-family-100.png")); // NOI18N
        jLabel10.setText("FAMILY HOME");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(24, 24, 24))
        );

        Familyhomeinfo.setAutoCreateRowSorter(true);
        Familyhomeinfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Familyhomeinfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Familyhomeinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Family Name", "Family Address Name", "Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Familyhomeinfo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Familyhomeinfo.setFocusable(false);
        Familyhomeinfo.setOpaque(false);
        Familyhomeinfo.setSelectionBackground(new java.awt.Color(0, 153, 51));
        Familyhomeinfo.setShowGrid(true);
        Familyhomeinfo.getTableHeader().setReorderingAllowed(false);
        Familyhomeinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FamilyhomeinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Familyhomeinfo);
        if (Familyhomeinfo.getColumnModel().getColumnCount() > 0) {
            Familyhomeinfo.getColumnModel().getColumn(0).setResizable(false);
            Familyhomeinfo.getColumnModel().getColumn(1).setResizable(false);
            Familyhomeinfo.getColumnModel().getColumn(1).setPreferredWidth(100);
            Familyhomeinfo.getColumnModel().getColumn(2).setResizable(false);
            Familyhomeinfo.getColumnModel().getColumn(2).setPreferredWidth(150);
            Familyhomeinfo.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("HEAD ID");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel2.setText("Family  Name");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setText("House Number");

        Familyheadid.setEditable(false);
        Familyheadid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS ROG STRIX\\Downloads\\icons8-update-user-skin-type-7-30.png")); // NOI18N
        jLabel7.setText("UPDATE");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS ROG STRIX\\Downloads\\icons8-remove-user-female-30.png")); // NOI18N
        jLabel8.setText("DELETE");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS ROG STRIX\\Downloads\\icons8-erase-30.png")); // NOI18N
        jLabel9.setText("CLEAR\n");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Familyheadid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addComponent(familyname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(housenumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(familyaddress, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Familyheadid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(familyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(familyaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(housenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FamilyhomeinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FamilyhomeinfoMouseClicked
        DefaultTableModel model = (DefaultTableModel)Familyhomeinfo.getModel();
        int Myindex = Familyhomeinfo.getSelectedRow();
        Familyheadid.setText(model.getValueAt(Myindex, 0).toString());
        familyname.setText(model.getValueAt(Myindex, 1).toString());
        familyaddress.setText(model.getValueAt(Myindex,2).toString());
        housenumber.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_FamilyhomeinfoMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(familyname.getText().isEmpty()||familyaddress.getText().isEmpty()||housenumber.getText().isEmpty()){

            JOptionPane.showMessageDialog(this, "Missing Information");

        }else{
            try{
                Con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/brgydata","root","");
                String UpdateQuery = "update brgydata.familyhome set Family_Name='"+familyname.getText()+"'"+",Family_Address='"+familyaddress.getText()+"'"+",House_number='"+housenumber.getText()+"'"+"where Home_ID="+Familyheadid.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "Family Home Updated Successfully");
                FamilyHome();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Do you want to delete the information?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

if (result == JOptionPane.YES_OPTION) {
        
        if(Familyheadid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the Product to be Deleted");
        }else{
            try{
                Con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/brgydata","root","");
                String Id = Familyheadid.getText();
                String Query = "Delete from brgydata.familyhome where Home_ID="+ Id;
                String Id2 = housenumber.getText();
                String Querys = "Delete from brgydata.familyhead where family="+ Id2;
               
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                Add.executeUpdate(Querys);
                FamilyHome();
                JOptionPane.showMessageDialog(this, "Family Home Deleted Successfully");
                Familyheadid.setText("");
                familyaddress.setText("");
                familyname.setText("");
                housenumber.setText("");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }}
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       Familyheadid.setText("");
                familyaddress.setText("");
                familyname.setText("");
                housenumber.setText("");
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Familyheadid;
    private javax.swing.JTable Familyhomeinfo;
    private javax.swing.JTextField familyaddress;
    private javax.swing.JTextField familyname;
    private javax.swing.JTextField housenumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
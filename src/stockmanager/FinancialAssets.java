/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static stockmanager.details.mypass;
import static stockmanager.details.myurl;
import static stockmanager.details.myuser;

/**
 *
 * @author sanam
 */
public class FinancialAssets extends javax.swing.JInternalFrame {

    /**
     * Creates new form FinancialAssets
     */
    public FinancialAssets() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Financial Assets");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Name");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asset Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int ans = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete ? ");
        if(ans == JOptionPane.YES_OPTION)
            try
            {
                
                Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
                try
                {
                    String qry="delete from assets where Aname =?";
                    PreparedStatement st = myconn.prepareStatement(qry);
                    st.setString(1,jTextField1.getText());

                    int rowcount = st.executeUpdate();
                    if(rowcount>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"User Record Deleted Successfully");
                        clearpage();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"Check username");
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error in Deletion Query : "+e.getMessage());
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In database connection : "+e.getMessage());
            }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        ///text

        //name	phone	gender	address	dob	username	password	usertype
        try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="insert into assets values(?)";
                PreparedStatement st = myconn.prepareStatement(qry);
                st.setString(1,jTextField1.getText());

                int rowcount = st.executeUpdate();
                if(rowcount>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"User Record Added Successfully");
                    clearpage();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Check all fields carefully");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In Insertion Query : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error In database connection : "+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
void clearpage()
{
    jTextField1.setText(null);
    search_record();
}
void search_record()
{
    try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="select * from assets where Aname like ?";
                PreparedStatement st = myconn.prepareStatement(qry);
                st.setString(1,jTextField1.getText()+"%");
                ResultSet rst = st.executeQuery();

                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                mymodel.setRowCount(0);

                if(rst.next())
                {
                    do
                    {
                        String c1 = rst.getString("Aname");
                        Object rowData[] = {c1};
                        mymodel.addRow(rowData);
                    }while(rst.next());

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"No Record for this name");
                    clearpage1();
                    clearpage();
                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In Insertion Query : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error In database connection : "+e.getMessage());
        }
}
void clearpage1()
{
    jTextField1.setText(null);
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        search_record();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="select * from assets";
                PreparedStatement st = myconn.prepareStatement(qry);
                
                ResultSet rst = st.executeQuery();

                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                mymodel.setRowCount(0);

                if(rst.next())
                {
                    do
                    {
                        String c1 = rst.getString("Aname");
                        Object rowData[] = {c1};
                        mymodel.addRow(rowData);
                    }while(rst.next());

                }
                

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In collecting table data Query : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"error in db coonection: "+e.getMessage());}
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        String value = jTable1.getValueAt(row, 0).toString();
        jTextField1.setText(value);
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

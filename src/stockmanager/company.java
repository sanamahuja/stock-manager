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
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static stockmanager.details.mypass;
import static stockmanager.details.myurl;
import static stockmanager.details.myuser;

/**
 *
 * @author sanam
 */
public class company extends javax.swing.JInternalFrame {

    /**
     * Creates new form company
     */
    Hashtable catinfo=new Hashtable();
    String scatid;
    public company() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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
        jLabel1.setText("Companies");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Category");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "category ID", "Company ID", "Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox1, 0, 208, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row, 0).toString();
        String comboitem = catinfo.get(id).toString();
        jComboBox1.setSelectedItem(comboitem);

        scatid = jTable1.getValueAt(row, 1).toString();
        String name = jTable1.getValueAt(row, 2).toString();
        jTextField1.setText(name);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        ///text
        try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="update company set catid =? , CompanyName=?  where CompID =?";
                PreparedStatement st = myconn.prepareStatement(qry);

                String c1=jComboBox1.getSelectedItem().toString();
                int index1 = c1.indexOf(',');
                String value = c1.substring(0, index1);
                st.setString(1,value);

                st.setString(2,jTextField1.getText());
                st.setString(3,scatid);

                int rowcount = st.executeUpdate();
                if(rowcount>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"CompanyID Updated Successfully");
                    clearpage();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane,"Check id");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In Updation Query : "+e.getMessage());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,"Error In database connection : "+e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="insert into company(catid,CompanyName) values(?,?)";
                PreparedStatement st = myconn.prepareStatement(qry);
                String c1=jComboBox1.getSelectedItem().toString();
                int index1 = c1.indexOf(',');
                String value = c1.substring(0, index1);

                st.setString(1,value);
                st.setString(2,jTextField1.getText());

                int rowcount = st.executeUpdate();
                if(rowcount>0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Company Added Successfully");
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//catid	CompID	CompanyName	

        int ans = JOptionPane.showConfirmDialog(rootPane,"Are you sure to delete ? ");
        if(ans == JOptionPane.YES_OPTION)
        {
            try
            {

                Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
                try
                {
                    String qry="delete from company where CompID=?";
                    PreparedStatement st = myconn.prepareStatement(qry);
                    st.setString(1,scatid);

                    int rowcount = st.executeUpdate();
                    if(rowcount>0)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Company Deleted Successfully");
                        clearpage();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"Check id");
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Error In Updation Query : "+e.getMessage());
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error In database connection : "+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        search_record();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       get_catgories();
    }//GEN-LAST:event_formInternalFrameOpened
void clearpage()
{
    jComboBox1.setSelectedIndex(0);
    jTextField1.setText("");  
    search_record();
}
    void search_record()
{
    try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="select * from company where CompanyName like ?";
                PreparedStatement st = myconn.prepareStatement(qry);
                st.setString(1,jTextField1.getText()+"%");
                ResultSet rst = st.executeQuery();

                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                mymodel.setRowCount(0);

                if(rst.next())
                {
                    do
                    {
                        String c1 = rst.getString("catid");
                        String c2 = rst.getString("CompID"); 
                        String c3 = rst.getString("CompanyName"); 

                        Object rowData[] = {c1,c2,c3 };
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
        jComboBox1.setSelectedIndex(0);
        
    }
    void get_catgories()
{
     try
        {
            Connection myconn = DriverManager.getConnection(myurl,myuser,mypass);
            try
            {
                String qry="select * from category ";
                PreparedStatement st = myconn.prepareStatement(qry);
                ResultSet rst = st.executeQuery();
                
                
                if(rst.next())
                {
                    jComboBox1.addItem("Choose Category");
                    do
                    {
                        String c1 = rst.getString("catid");
                        String c2 = rst.getString("cname"); 
                        String c3=c1+","+c2;
                        jComboBox1.addItem(c3);
                        
                        catinfo.put(c1,c3);

                        
                    }while(rst.next());

                }
                else
                {
                    jComboBox1.addItem("No Category");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

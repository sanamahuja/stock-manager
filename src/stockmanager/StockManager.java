/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static stockmanager.details.mypass;
import static stockmanager.details.myurl;
import static stockmanager.details.myuser;

/**
 *
 * @author sanam
 */
public class StockManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (Exception ex) 
        {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        
         
        
        
        try
         {
             Connection myconn = java.sql.DriverManager.getConnection(myurl,myuser,mypass);
             try
             {
             String qry="select * from myusertable";
             PreparedStatement st = myconn.prepareStatement(qry);  
             ResultSet rst = st.executeQuery(); 
             if(rst.next())
             {
                Loginpage obj=new Loginpage();
                obj.setVisible(true);
                  
             }
             else
             {
                 ManageAdmin obj=new ManageAdmin();
                 obj.setVisible(true);
             }
             
              
             }
             catch(Exception e)
            {
                
            }
         }
         catch(Exception e)
         {
           
         }
    }
        
    
    
}

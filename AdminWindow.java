import combat_corona.FirstVaccine;
import database.connection.info.DBConnection;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import hib.dto.Admin;
public class AdminWindow extends javax.swing.JFrame {
    public AdminWindow() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField5 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admincv.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jButton3.setText("Vaccine");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Operator Account");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(309, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Insert", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jButton7.setText("Filter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Record");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Vaccine");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(334, 334, 334))
        );

        jTabbedPane2.addTab("View", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password Setting");

        jTextField2.setBackground(new java.awt.Color(102, 102, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/passchange.png"))); // NOI18N

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(102, 102, 255));
        jTextField3.setForeground(new java.awt.Color(255, 51, 51));
        jTextField3.setToolTipText("");
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField4, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(jPasswordField3))
                                    .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(73, 73, 73)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Setting", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
static String userId="";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userId = jTextField2.getText();
        char ch[]=jPasswordField5.getPassword();
        String oldPass = new String(ch);
        char ch1[]=jPasswordField4.getPassword();
        String newPass = new String(ch1);
        char ch2[]=jPasswordField3.getPassword();
        String cNewPass=new String(ch2);
        SessionFactory sf=DBConnection.getDBInfo();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Criteria crit=session.createCriteria(Admin.class);
        crit.add(Restrictions.and(Restrictions.eq("id",userId),Restrictions.eq("password",oldPass)));
        List<hib.dto.Admin> data=crit.list();
        if(data.isEmpty())
        {
            jTextField2.setText("invalid id/pass");
        }
        else{
            if(newPass.equals(cNewPass)){
                Admin ref=(Admin)session.get(Admin.class,userId);
                ref.setPass(newPass);
                session.update(ref);
                tx.commit();
                JOptionPane.showMessageDialog(this,"password changed");
                new AdminWindow().setVisible(true);
                dispose();
            }
            else{
                jTextField3.setText("New password and Confirm Password Doesn't Match..... Please try Again....");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new FirstVaccine().setVisible(true);
        dispose();        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                new AdminWindow().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

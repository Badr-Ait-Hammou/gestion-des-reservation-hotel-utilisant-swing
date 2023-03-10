/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package front;

import entities.Users;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import service.UsersService;

/**
 *
 * @author Badr
 */
public class Usersf extends javax.swing.JInternalFrame {
 private static final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
	 private static final String regexT= "^[0-9]*$" ;
	  private static final String regexN= "^[a-zA-Z]*$" ;
          private DefaultTableModel model;
private  static int id;
    /**
     * Creates new form Usersf
     */
    public Usersf() {
        initComponents();
        model=( DefaultTableModel) userstable.getModel();
        load();
    }
    UsersService us= new UsersService();
public boolean fieldvalide(String field) {
		Pattern p = Pattern.compile(regexN);
		Matcher matcher = p.matcher(field);
		return matcher.matches();
	}
 public boolean emailvalide(String email) {
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(email);
		return matcher.matches();
	}
    
    public boolean phonevalide(String phone) {
		Pattern p = Pattern.compile(regexT);
		Matcher matcher = p.matcher(phone);
		return matcher.matches();
	}
    public void clear(){
    firstname.setText("");
    lastname.setText("");
    email.setText("");
    phone.setText("");
    username.setText("");
    password.setText("");
    confirmpassword.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow3 = new raven.panel.PanelShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        panelShadow4 = new raven.panel.PanelShadow();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        confirmpassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1050, 630));

        panelShadow3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des utilisateurs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "first_name", "last_name", "email", "telephone", "username", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        userstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userstable);

        javax.swing.GroupLayout panelShadow3Layout = new javax.swing.GroupLayout(panelShadow3);
        panelShadow3.setLayout(panelShadow3Layout);
        panelShadow3Layout.setHorizontalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelShadow3Layout.setVerticalGroup(
            panelShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        panelShadow4.setBackground(new java.awt.Color(0, 153, 153));
        panelShadow4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion des utilisateurs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstnameKeyReleased(evt);
            }
        });

        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameKeyReleased(evt);
            }
        });

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });

        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First_name");

        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/add-button.png"))); // NOI18N
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/delete.png"))); // NOI18N
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/edit.png"))); // NOI18N
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("last_name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("phone");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("confirmation");

        javax.swing.GroupLayout panelShadow4Layout = new javax.swing.GroupLayout(panelShadow4);
        panelShadow4.setLayout(panelShadow4Layout);
        panelShadow4Layout.setHorizontalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(username)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelShadow4Layout.createSequentialGroup()
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(phone)))
                    .addGroup(panelShadow4Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updatebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        panelShadow4Layout.setVerticalGroup(
            panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addbtn)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelShadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShadow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userstableMouseClicked
          id = Integer.parseInt(model.getValueAt(userstable.getSelectedRow(), 0).toString());
         
          firstname.setText(model.getValueAt(userstable.getSelectedRow(), 1).toString());
        lastname.setText(model.getValueAt(userstable.getSelectedRow(), 2).toString());
         email.setText(model.getValueAt(userstable.getSelectedRow(), 3).toString());
        phone.setText(model.getValueAt(userstable.getSelectedRow(), 4).toString());
       
         username.setText(model.getValueAt(userstable.getSelectedRow(), 5).toString());
        password.setText(model.getValueAt(userstable.getSelectedRow(),6).toString());
    }//GEN-LAST:event_userstableMouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
         String usern=username.getText();
       String first_n=firstname.getText();
       String last_n=lastname.getText();
       String addr=email.getText();
       String teleph=phone.getText();
       String pwd=password.getText();
       String pwdconf=confirmpassword.getText();
       
         if(usern.equals("") || first_n.equals("") || last_n.equals("")){
                 JOptionPane.showMessageDialog(this, " please fill all the fields ");
                 }
                 else if(pwd.equals("") ? pwdconf !=null : !pwd.equals(pwdconf)){
                     JOptionPane.showMessageDialog(this, "please confirm password");
                     }
                 else if(us.create(new Users(usern, first_n, last_n,addr, teleph, pwd))){
                     
                     JOptionPane.showMessageDialog(this, "user has been added successfully");
                     clear();
                     load();
                 }else{
                 JOptionPane.showMessageDialog(this, "oops something went wrong");
                 }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       if(us.findById(id).getId()==id){
            us.delete(us.findById(id));
            JOptionPane.showConfirmDialog(this, "do you rally want to delete this user?");

            JOptionPane.showMessageDialog(this,"user has been deleted");
            clear();
        }else{
            JOptionPane.showMessageDialog(this,"something is wrong");
        }
        load();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
         String usern=username.getText();
       String first_n=firstname.getText();
       String last_n=lastname.getText();
       String addr=email.getText();
       String teleph=phone.getText();
       String pwd=password.getText();
     //  String pwdconf=confirmpassword.getText();
        
        int answer=JOptionPane.showConfirmDialog(this,"do you really want to update this client");
        if(answer==0){
            
            if(us.update(new Users(id,usern, first_n, last_n,addr, teleph, pwd))){
                JOptionPane.showMessageDialog(this, "updated");
                clear();
            }
        }
        else{
            // JOptionPane.showMessageDialog(this, "error");
        }
        load();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void firstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstnameKeyReleased
         if(!fieldvalide(firstname.getText())) {
					firstname.setBorder(new LineBorder(Color.red,2));
				}else {
					firstname.setBorder(new LineBorder(Color.green,1));
				}
    }//GEN-LAST:event_firstnameKeyReleased

    private void lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyReleased
         if(!fieldvalide(lastname.getText())) {
					lastname.setBorder(new LineBorder(Color.red,2));
				}else {
					lastname.setBorder(new LineBorder(Color.green,1));
				}
    }//GEN-LAST:event_lastnameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
         if(!emailvalide(email.getText())) {
					email.setBorder(new LineBorder(Color.red,2));
				}else {
					email.setBorder(new LineBorder(Color.green,1));
				}
    }//GEN-LAST:event_emailKeyReleased

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
         if(!phonevalide(phone.getText())) {
					phone.setBorder(new LineBorder(Color.red,2));
				}else {
					phone.setBorder(new LineBorder(Color.green,1));
				}
    }//GEN-LAST:event_phoneKeyReleased

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        if(!fieldvalide(username.getText())) {
					username.setBorder(new LineBorder(Color.red,2));
				}else {
					username.setBorder(new LineBorder(Color.green,1));
				}
    }//GEN-LAST:event_usernameKeyReleased
 public void load(){
    model.setRowCount(0);
     for(Users users :us.findall() ) {
            model.addRow(new Object[]{
            users.getId(),
            users.getUsername(),
            users.getFirst_name(),
            users.getLast_name(),
             users.getTelephone(),
            users.getEmail(),
            users.getPassword(),
            
            });
     }        

   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField confirmpassword;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private raven.panel.PanelShadow panelShadow3;
    private raven.panel.PanelShadow panelShadow4;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField username;
    private javax.swing.JTable userstable;
    // End of variables declaration//GEN-END:variables
}

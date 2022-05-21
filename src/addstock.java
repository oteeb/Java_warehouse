
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class addstock extends javax.swing.JInternalFrame {

    public Connection getConnection(){
        Connection c = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/projectwarehouse","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(additem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ไม่สามารถชื่อมต่อได้\n"+ex);
        }
        return c;
    }
    public addstock() {
        initComponents();
        Connection Conn = this.getConnection();
        Statement SQLstmt;
        jTextField2.setEnabled(false);
        jTextField5.setEnabled(false);
        
        try {
            SQLstmt = Conn.createStatement();
            String sqli = "select * from products";
            ResultSet rsi = SQLstmt.executeQuery(sqli);
            
            DefaultListModel <String> model = new DefaultListModel<>();
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("                                              จำนวนสินค้าคงคลัง\n");
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("รหัสสินค้า           ชื่อสินค้า           ราคาต่อหน่วย           หน่วยนับ           จำนวนคงคลัง    ");
                while(rsi.next()){
                model.addElement(rsi.getString("products_id")+
                                              "                      "
                                +rsi.getString("products_name")+
                                              "                    "
                                +rsi.getString("products_price")+
                                              "                            "
                                +rsi.getString("products_reckon")+
                                              "                     "
                                +rsi.getString("products_number"));
                }
                jList2.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ไม่พบข้อมูล"+ex);
        }
            
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        jLabel1.setText("-------------Add Stock--------------");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel2.setText("รหัสสินค้า :");

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel3.setText("ชื่อสินค้า :");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel6.setText("จำนวนคงคลัง :");

        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jButton1.setText("เพิ่ม");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jButton4.setText("ค้นหา");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sukhumvit Set", 0, 13)); // NOI18N
        jLabel7.setText("จำนวนที่จะเพิ่ม :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()!=KeyEvent.VK_ENTER){
            return;
        }
        if((jTextField1.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "กรุณาป้อนค่า");
            return;
        }
        Connection Conn = this.getConnection();
        Statement SQLstmt;
        jTextField2.setEnabled(false);
        jTextField5.setEnabled(false);
        try {
            SQLstmt = Conn.createStatement();
            String sql = "select * from products where products_id = '"+jTextField1.getText()+"'";
            ResultSet rs = SQLstmt.executeQuery(sql);
            rs.last();

            if(rs.getRow()==0){
                JOptionPane.showMessageDialog(this,"ไม่พบข้อมูล");
                return;
            }else{
                jTextField2.setText(rs.getString("products_name"));
                jTextField5.setText(rs.getString("products_number"));

                DefaultListModel <String> model = new DefaultListModel<>();
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("                                              Manaqe Item\n");
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("รหัสสินค้า           ชื่อสินค้า           ราคาต่อหน่วย           หน่วยนับ           จำนวนคงคลัง    ");
                model.addElement(rs.getString("products_id")+
                    "                      "
                    +rs.getString("products_name")+
                    "                    "
                    +rs.getString("products_price")+
                    "                            "
                    +rs.getString("products_reckon")+
                    "                     "
                    +rs.getString("products_number"));
                jList2.setModel(model);
                Conn.close();
                jButton1.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ผิดพลาด\n"+ex);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((jTextField1.getText().isEmpty())||
            (jTextField2.getText().isEmpty())||
            (jTextField3.getText().isEmpty())||
            (jTextField5.getText().isEmpty())
        ){
            JOptionPane.showMessageDialog(this, "กรุณาป้อนค่า");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(this, "ต้องการที่จะเพิ่ม Stock หรือไม่?")!=0){
            return;
        }
        
        int i = 0;
        i = (Integer.parseInt(jTextField5.getText()))+(Integer.parseInt(jTextField3.getText()));
        Connection Conn = this.getConnection();
        Statement SQLstmt;
        
        try {
            SQLstmt = Conn.createStatement();
            String sql = "update products set products_number='"+i+"'";
            sql += " where products_id='"+jTextField1.getText()+"'";

            SQLstmt.executeUpdate(sql);

            sql = "select * from products where products_id = '"+jTextField1.getText()+"'";
            ResultSet rs = SQLstmt.executeQuery(sql);
            DefaultListModel <String> model = new DefaultListModel<>();
            model.addElement("---------------------------------------------------------------------------------------\n");
            model.addElement("                                              Manaqe Item\n");
            model.addElement("---------------------------------------------------------------------------------------\n");
            model.addElement("รหัสสินค้า           ชื่อสินค้า           ราคาต่อหน่วย           หน่วยนับ           จำนวนคงคลัง    ");
            while(rs.next()){
                model.addElement(rs.getString("products_id")+
                                              "                      "
                                +rs.getString("products_name")+
                                              "                    "
                                +rs.getString("products_price")+
                                              "                            "
                                +rs.getString("products_reckon")+
                                              "                     "
                                +rs.getString("products_number"));
                jTextField5.setText(rs.getString("products_number"));              
            }
            jList2.setModel(model);
            JOptionPane.showMessageDialog(this, "เพิ่ม Stock สำเร็จ");
            jTextField3.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "เกิดข้อผิดพลาด"+ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if((jTextField1.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "กรุณาป้อนค่า");
            return;
        }
        Connection Conn = this.getConnection();
        Statement SQLstmt;
        jTextField2.setEnabled(false);
        jTextField5.setEnabled(false);
        try {
            SQLstmt = Conn.createStatement();
            String sql = "select * from products where products_id = '"+jTextField1.getText()+"'";
            ResultSet rs = SQLstmt.executeQuery(sql);
            rs.last();

            if(rs.getRow()==0){
                JOptionPane.showMessageDialog(this,"ไม่พบข้อมูล");
                return;
            }else{
                jTextField2.setText(rs.getString("products_name"));
                jTextField5.setText(rs.getString("products_number"));

                DefaultListModel <String> model = new DefaultListModel<>();
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("                                              Manaqe Item\n");
                model.addElement("---------------------------------------------------------------------------------------\n");
                model.addElement("รหัสสินค้า           ชื่อสินค้า           ราคาต่อหน่วย           หน่วยนับ           จำนวนคงคลัง    ");
                model.addElement(rs.getString("products_id")+
                    "                      "
                    +rs.getString("products_name")+
                    "                    "
                    +rs.getString("products_price")+
                    "                            "
                    +rs.getString("products_reckon")+
                    "                     "
                    +rs.getString("products_number"));
                jList2.setModel(model);
                Conn.close();
                jButton1.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ผิดพลาด\n"+ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jTextField3KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

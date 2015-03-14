/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistacontrolador;

import modelo.Tiempo;
/**
 *
 * @author garciparedes
 */
public class CambiaFechaUI extends javax.swing.JFrame {
 
    private Tiempo mTiempo;
    private CambiaFechaController mCambiaFechaController;
    /**
     * Creates new form CambiaVistaUI
     */
    public CambiaFechaUI() {
        initComponents();
        initValues();
    }
    
    private void initValues(){
        mTiempo =  new Tiempo();
        mCambiaFechaController = new CambiaFechaController(this, mTiempo);
        showTime(mTiempo);
        showTimeOnLabel(mTiempo);
    }
    
    public void showTimeOnLabel(Tiempo tiempo){
        
    }
    
    public void showTime(Tiempo tiempo){
        updateComboBoxDayModel(tiempo );
        setJComboBoxDay(tiempo.getDayOverZero());
        setJComboBoxMonth(tiempo.getMonth());
        setJTextFieldYear(tiempo.getYearString());
    }
    
    public void updateComboBoxDayModel(Tiempo tiempo){
        jComboBoxDay.setModel(
            new javax.swing.DefaultComboBoxModel(
                tiempo.genConsecutiveDayArray()
            )
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabelDay = new javax.swing.JLabel();
        jLabelMonth = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jComboBoxMonth = new javax.swing.JComboBox();
        jComboBoxDay = new javax.swing.JComboBox();
        jLabelHour = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jTextFieldMin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jTextFieldSec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldYear = new javax.swing.JFormattedTextField();
        jButtonExit = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambiador de fecha");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha y Hora"));

        jLabelDay.setText("Dia:");

        jLabelMonth.setText("Mes:");

        jLabelYear.setText("Año:");

        jComboBoxMonth.setModel(
            new javax.swing.DefaultComboBoxModel(
                Tiempo.genMonthArray()
            )
        );
        jComboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonthActionPerformed(evt);
            }
        });

        jComboBoxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDayActionPerformed(evt);
            }
        });

        jLabelHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHour.setText("H");

        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("M");

        jLabel2.setText(":");

        jLabelSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSec.setText("S");

        jLabel3.setText(":");

        jFormattedTextFieldYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldYearFocusLost(evt);
            }
        });
        jFormattedTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldYearActionPerformed(evt);
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
                            .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelMonth)
                            .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelYear)
                            .addComponent(jFormattedTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldMin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldSec)
                            .addComponent(jLabelSec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxDay, jLabelDay});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxMonth, jLabelMonth});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDay)
                    .addComponent(jLabelMonth)
                    .addComponent(jLabelYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHour)
                            .addComponent(jLabelMin))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSec)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonChange.setText("Cambiar");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabelTitle.setText("Fecha y Hora del Sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChange)
                    .addComponent(jButtonExit)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        mCambiaFechaController.changeTime();
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        mCambiaFechaController.exit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        mCambiaFechaController.onMonthModified();
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

    private void jFormattedTextFieldYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldYearFocusLost
        mCambiaFechaController.onYearModified();
    }//GEN-LAST:event_jFormattedTextFieldYearFocusLost

    private void jFormattedTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldYearActionPerformed
        mCambiaFechaController.onYearModified();
    }//GEN-LAST:event_jFormattedTextFieldYearActionPerformed

    private void jComboBoxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDayActionPerformed
        mCambiaFechaController.onDayModified();
    }//GEN-LAST:event_jComboBoxDayActionPerformed
    
    public void setJComboBoxDay(int value){
       jComboBoxDay.setSelectedIndex(value);
    }
    
    public void setJComboBoxMonth(int value){
        jComboBoxMonth.setSelectedIndex(value);
    }
    
    public void setJTextFieldYear(String value){
        jFormattedTextFieldYear.setText(value);
    }
    
    public void setJTextFieldHour(int value){
        jTextFieldHour.setText(String.valueOf(value));
    }
    
    public void setJTextFieldMin(int value){
        jTextFieldMin.setText(String.valueOf(value));
    }
    
      public void setJTextFieldSec(int value){
        jTextFieldSec.setText(String.valueOf(value));
    }

    
    public int getJComboBoxDay(){
        return jComboBoxDay.getSelectedIndex();
    }
    
    public int getJComboBoxMonth(){
        return jComboBoxMonth.getSelectedIndex();
    }
    
    public String getJTextFieldYear(){
        return jFormattedTextFieldYear.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JComboBox jComboBoxDay;
    private javax.swing.JComboBox jComboBoxMonth;
    private javax.swing.JFormattedTextField jFormattedTextFieldYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDay;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelMonth;
    private javax.swing.JLabel jLabelSec;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldMin;
    private javax.swing.JTextField jTextFieldSec;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}

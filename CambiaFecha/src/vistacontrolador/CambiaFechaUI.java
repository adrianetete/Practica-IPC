/**
 * 
 * @author Sergio Garcia Prado
 * @author Adrian Calvo Rojo
 * 
 */
package vistacontrolador;

import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;
import modelo.Tiempo;

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
        jLabelTime.setText(tiempo.toString());
    }
    
    public void showTime(Tiempo tiempo){
        updateComboBoxDayModel(tiempo );
        
        setJTextFieldSec(tiempo.getSecondString());
        setJTextFieldMin(tiempo.getMinuteString());
        setJTextFieldHour(tiempo.getHourString());
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
        jPanel2 = new javax.swing.JPanel();
        jLabelHour = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSec = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldHour = new javax.swing.JFormattedTextField();
        jLabelMin = new javax.swing.JLabel();
        jFormattedTextFieldSec = new javax.swing.JFormattedTextField();
        jFormattedTextFieldMin = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        NumberFormatter numberFormatter = new NumberFormatter(NumberFormat.getIntegerInstance());
        numberFormatter.setValueClass(Integer.class);
        numberFormatter.setAllowsInvalid(true);
        numberFormatter.setMaximum(9999);
        numberFormatter.setMinimum(0);
        jFormattedTextFieldYear = new javax.swing.JFormattedTextField();
        jLabelYear = new javax.swing.JLabel();
        jLabelMonth = new javax.swing.JLabel();
        jComboBoxDay = new javax.swing.JComboBox();
        jLabelDay = new javax.swing.JLabel();
        jComboBoxMonth = new javax.swing.JComboBox();
        jButtonExit = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jLabelTime = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jToggleButtonPause = new javax.swing.JToggleButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambiador de fecha");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha y Hora"));

        jLabelHour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHour.setText("Hora:");

        jLabel3.setText(":");

        jLabelSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSec.setText("Seg:");

        jLabel2.setText(":");

        jFormattedTextFieldHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldHour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldHourFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldHourFocusLost(evt);
            }
        });
        jFormattedTextFieldHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldHourActionPerformed(evt);
            }
        });

        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("Min:");

        jFormattedTextFieldSec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldSecFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldSecFocusLost(evt);
            }
        });
        jFormattedTextFieldSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSecActionPerformed(evt);
            }
        });

        jFormattedTextFieldMin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldMinFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldMinFocusLost(evt);
            }
        });
        jFormattedTextFieldMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabelHour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSec, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFormattedTextFieldHour, jFormattedTextFieldMin, jFormattedTextFieldSec, jLabelHour, jLabelMin, jLabelSec});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHour)
                    .addComponent(jLabelMin)
                    .addComponent(jLabelSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        jLabelYear.setForeground(new java.awt.Color(51, 51, 51));
        jLabelYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelYear.setText("Año:");

        jLabelMonth.setForeground(new java.awt.Color(51, 51, 51));
        jLabelMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMonth.setText("Mes:");

        jComboBoxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDayActionPerformed(evt);
            }
        });

        jLabelDay.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDay.setText("Dia:");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelDay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelMonth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelYear))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxDay, jComboBoxMonth, jFormattedTextFieldYear, jLabelDay, jLabelMonth, jLabelYear});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDay)
                    .addComponent(jLabelMonth)
                    .addComponent(jLabelYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jLabelTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTime.setText("jLabel1");

        jLabelTitle.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Fecha y Hora del Sistema");

        jToggleButtonPause.setText("Pausar Reloj");
        jToggleButtonPause.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButtonPauseStateChanged(evt);
            }
        });
        jToggleButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPauseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButtonPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChange)
                    .addComponent(jButtonExit)
                    .addComponent(jToggleButtonPause))
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

    private void jToggleButtonPauseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButtonPauseStateChanged
    }//GEN-LAST:event_jToggleButtonPauseStateChanged

    private void jToggleButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPauseActionPerformed
        mCambiaFechaController.pauseClock();
    }//GEN-LAST:event_jToggleButtonPauseActionPerformed

    private void jFormattedTextFieldHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHourActionPerformed
        mCambiaFechaController.onHourModified();
    }//GEN-LAST:event_jFormattedTextFieldHourActionPerformed

    private void jFormattedTextFieldHourFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHourFocusLost
        mCambiaFechaController.onHourModified();
    }//GEN-LAST:event_jFormattedTextFieldHourFocusLost

    private void jFormattedTextFieldHourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldHourFocusGained
        mCambiaFechaController.setModificando();
    }//GEN-LAST:event_jFormattedTextFieldHourFocusGained

    private void jFormattedTextFieldMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldMinActionPerformed
        mCambiaFechaController.onMinModified();
    }//GEN-LAST:event_jFormattedTextFieldMinActionPerformed

    private void jFormattedTextFieldMinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldMinFocusLost
        mCambiaFechaController.onMinModified();
    }//GEN-LAST:event_jFormattedTextFieldMinFocusLost

    private void jFormattedTextFieldMinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldMinFocusGained
        mCambiaFechaController.setModificando();
    }//GEN-LAST:event_jFormattedTextFieldMinFocusGained

    private void jFormattedTextFieldSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSecActionPerformed
        mCambiaFechaController.onSecModified();
    }//GEN-LAST:event_jFormattedTextFieldSecActionPerformed

    private void jFormattedTextFieldSecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSecFocusLost
        mCambiaFechaController.onSecModified();
    }//GEN-LAST:event_jFormattedTextFieldSecFocusLost

    private void jFormattedTextFieldSecFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSecFocusGained
        mCambiaFechaController.setModificando();
    }//GEN-LAST:event_jFormattedTextFieldSecFocusGained

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        mCambiaFechaController.onMonthModified();
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

    private void jComboBoxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDayActionPerformed
        mCambiaFechaController.onDayModified();
    }//GEN-LAST:event_jComboBoxDayActionPerformed

    private void jFormattedTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldYearActionPerformed
        mCambiaFechaController.onYearModified();
    }//GEN-LAST:event_jFormattedTextFieldYearActionPerformed

    private void jFormattedTextFieldYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldYearFocusLost
        mCambiaFechaController.onYearModified();
    }//GEN-LAST:event_jFormattedTextFieldYearFocusLost
    
    public void setJTextFieldSec(String value){
        jFormattedTextFieldSec.setText(value);
    }
    
    public void setJTextFieldMin(String value){
        jFormattedTextFieldMin.setText(value);
    }
    
    public void setJTextFieldHour(String value){
        jFormattedTextFieldHour.setText(value);
    }
    
    public void setJComboBoxDay(int value){
       jComboBoxDay.setSelectedIndex(value);
    }
    
    public void setJComboBoxMonth(int value){
        jComboBoxMonth.setSelectedIndex(value);
    }
    
    public void setJTextFieldYear(String value){
        jFormattedTextFieldYear.setText(value);
    }    
    
    public String getJTextFieldSec(){
        return jFormattedTextFieldSec.getText();
    }
    
    public String getJTextFieldMin(){
        return jFormattedTextFieldMin.getText();
    }
    
    public String getJTextFieldHour(){
        return jFormattedTextFieldHour.getText();
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
    private javax.swing.JFormattedTextField jFormattedTextFieldHour;
    private javax.swing.JFormattedTextField jFormattedTextFieldMin;
    private javax.swing.JFormattedTextField jFormattedTextFieldSec;
    private javax.swing.JFormattedTextField jFormattedTextFieldYear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDay;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelMonth;
    private javax.swing.JLabel jLabelSec;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButtonPause;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    
}

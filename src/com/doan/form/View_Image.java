
package com.doan.form;

import com.doan.event.PublicEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;
import javax.swing.SwingUtilities;


public class View_Image extends javax.swing.JComponent {

    
    public View_Image() {
        initComponents();
    }
    private Icon image;

    public void viewImage(Icon image){
        this.image = image;
        pic.setImage(image);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new com.doan.swing.PictureBox();
        cmsSave = new javax.swing.JButton();

        pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                picMousePressed(evt);
            }
        });

        cmsSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/save.png"))); // NOI18N
        cmsSave.setContentAreaFilled(false);
        cmsSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmsSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmsSaveActionPerformed(evt);
            }
        });

        pic.setLayer(cmsSave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picLayout.createSequentialGroup()
                .addGap(0, 663, Short.MAX_VALUE)
                .addComponent(cmsSave))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addComponent(cmsSave)
                .addGap(0, 350, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void picMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picMousePressed
        if(SwingUtilities.isLeftMouseButton(evt)){
            setVisible(false);
        }
    }//GEN-LAST:event_picMousePressed

    private void cmsSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmsSaveActionPerformed
        PublicEvent.getInstance().getEventImageView().saveImage(image);
    }//GEN-LAST:event_cmsSaveActionPerformed

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setColor(new Color(0, 0, 0, 150));
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmsSave;
    private com.doan.swing.PictureBox pic;
    // End of variables declaration//GEN-END:variables
}

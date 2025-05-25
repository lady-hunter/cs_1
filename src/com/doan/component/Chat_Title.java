
package com.doan.component;

import java.awt.Color;


public class Chat_Title extends javax.swing.JPanel {

    
    public Chat_Title() {
        initComponents();
    }

    public void setUserName(String userName){
        lbName.setText(userName);
    }
    
    public void statusActive(){
        lbStatus.setText("Active now");
        lbStatus.setForeground(new java.awt.Color(40, 147, 59));
    }
    
    public void setStatusText(String text){
        lbStatus.setText(text);
        lbStatus.setForeground(new Color(160, 160, 160));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layer = new javax.swing.JLayeredPane();
        lbName = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        layer.setLayout(new java.awt.GridLayout(0, 1));

        lbName.setBackground(new java.awt.Color(66, 66, 66));
        lbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbName.setText("Kiet");
        layer.add(lbName);

        lbStatus.setBackground(new java.awt.Color(66, 66, 66));
        lbStatus.setForeground(new java.awt.Color(40, 145, 59));
        lbStatus.setText("Active now");
        layer.add(lbStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(layer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane layer;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}

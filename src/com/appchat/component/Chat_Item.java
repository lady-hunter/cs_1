
package com.appchat.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class Chat_Item extends javax.swing.JLayeredPane {

    private JLabel label;
    public Chat_Item() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0, 0, 0, 0));
        txt.setOpaque(false);
    }
 
    public void setUsetProfile(String user){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        layer.setBorder(new EmptyBorder(10, 10, 0, 10));
        JButton cmd = new JButton(user);
        cmd.setContentAreaFilled(false);
        cmd.setFocusable(false);
        layer.add(cmd);
        add(layer, 0);
    }
    public void setText(String text){
        txt.setText(text);
    }
    
    public void setTime (String time){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        layer.setBorder(new EmptyBorder(0, 5, 10, 5));
        label = new JLabel(time);
        label.setForeground(new Color(110, 110, 100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(layer);
        
    }
    
    public void setImage(boolean right, Icon... images){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(right?FlowLayout.RIGHT:FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0, 5, 10, 5));
        Chat_Image chatImage = new Chat_Image();
        chatImage.addImage(images);
        layer.add(chatImage);
        add(layer);
    }
    
    public void sendSuccess(){
        if(label != null){
            label.setIcon(new ImageIcon(getClass().getResource("/com/appchat/icon/tick.png")));
        }
    }
    
    public void seen(){
        if(label != null){
            label.setIcon(new ImageIcon(getClass().getResource("/com/appchat/icon/double_tick.png")));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new com.appchat.swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 5, 10));
        txt.setSelectionColor(new java.awt.Color(94, 190, 255));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(grphcs); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.appchat.swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables
}

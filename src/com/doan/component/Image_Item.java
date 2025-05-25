
package com.doan.component;

import com.doan.swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Image_Item extends javax.swing.JLayeredPane {

    
    public Image_Item() {
        initComponents();
    }

    public void setImage(String image){
        int width = 200;
        int height = 200;
        int[] data = BlurHash.decode(image , width, height, 1);
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        img.setRGB(0, 0, width, height, data, 0, width);
        Icon icon = new ImageIcon(img);
        pic.setImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new com.doan.swing.PictureBox();
        progress1 = new com.doan.swing.Progress();

        progress1.setForeground(new java.awt.Color(255, 255, 255));
        progress1.setValue(50);
        progress1.setProgressType(com.doan.swing.Progress.ProgressType.CANCEL);

        pic.setLayer(progress1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        setLayer(pic, javax.swing.JLayeredPane.DEFAULT_LAYER);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.doan.swing.PictureBox pic;
    private com.doan.swing.Progress progress1;
    // End of variables declaration//GEN-END:variables
}

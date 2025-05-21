
package com.appchat.component;

import com.appchat.swing.ScrollBar;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

   
    public Chat_Body() {
        initComponents();
        init();
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addDate("20/05/2025");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
        addItemRight("hello");
        addDate("Today");
        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet", new ImageIcon(getClass().getResource("/com/appchat/images/cat.jpg")));
        addItemRight("hello");
        addItemRight("hello");
        addItemLeft("", "", new ImageIcon(getClass().getResource("/com/appchat/images/aobing.jpg")));

        
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }
    
    public void addItemLeft(String text, String user, Icon... image){
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(String text){
        Chat_Right item = new Chat_Right();
        item.setText(text);
        body.add(item,"wrap,al right, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addDate(String date){
        Chat_Date item = new Chat_Date();
        item.setDate(date);
        body.add(item, "wrap, al center");
        body.repaint();
        body.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        sp.setBackground(new java.awt.Color(255, 255, 255));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        sp.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

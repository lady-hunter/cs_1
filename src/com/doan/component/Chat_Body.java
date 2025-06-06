
package com.doan.component;

import com.doan.swing.ScrollBar;
import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

public class Chat_Body extends javax.swing.JPanel {

   
    public Chat_Body() {
        initComponents();
        init();
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
         addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addDate("20/05/2025");
//        addItemLeft("public class Chat_avax.s win g .JP ane l", "kiet");
//        addItemRight("hello");
//        addDate("Today");
//        addItemLeft("", "kiet", new ImageIcon(getClass().getResource("/com/appchat/images/cat.jpg")));
//        String img[] = {"LHJ7:x?H_4D%#TDi^,oMIpRj-oVs"};
//        addItemLeft("","Duy", img);
//        addItemRight("hello" );
//        addItemRight("hello");
//        addItemLeft("", "kiet", new ImageIcon(getClass().getResource("/com/appchat/images/aobing.jpg")));
//          addItemRight("", new ImageIcon(getClass().getResource("/com/appchat/images/aobing.jpg")));
//        addItemFile("hmmm", "kiet", "java", "203 MB");
//        addItemFileRight("","app chat", "100 MB");
        
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
        scrollToBottom();
        
    
    }

    public void addItemLeft(String text, String user, String[] image){
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }
    public void addItemFile(String text, String user, String fileName, String fileSize){
        Chat_Left_With_Profile item = new Chat_Left_With_Profile();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item,"wrap, w 100::80%");
        body.repaint();
        body.revalidate();
    }

    public void addItemRight(String text,  Icon... image){
        Chat_Right item = new Chat_Right();
        item.setText(text);
        item.setImage(image);
        body.add(item,"wrap,al right, w 100::80%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemFileRight(String text, String fileName, String fileSize){
        Chat_Right item = new Chat_Right();
        item.setFile(fileName, fileSize);
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
    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

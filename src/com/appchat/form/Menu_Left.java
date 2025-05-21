
package com.appchat.form;

import com.appchat.component.Item_People;
import com.appchat.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;


public class Menu_Left extends javax.swing.JPanel {

    
    public Menu_Left() {
        initComponents();
        init();
    }

    private void init(){
        sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showMessage();
    }
    
    private void showMessage(){
        //test
        menuList.removeAll();
        for(int i=0; i<=20; i++){
            menuList.add(new Item_People("kiet number "+i), "wrap");
        }
        refreshMenuList();
    }
    
    private void showGroup(){
        menuList.removeAll();
        for(int i=0; i<=4; i++){
            menuList.add(new Item_People("gr number "+i), "wrap");
        }
        refreshMenuList();
    }
    
    private void refreshMenuList(){
        menuList.repaint();
        menuList.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        menuGroup = new com.appchat.component.MenuButton();
        menuMessage = new com.appchat.component.MenuButton();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        menu.setBackground(new java.awt.Color(229, 229, 229));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(2, 0));

        menuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/group.png"))); // NOI18N
        menuGroup.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/group_selected1.png"))); // NOI18N
        menuGroup.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/group.png"))); // NOI18N
        menuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGroupActionPerformed(evt);
            }
        });
        menu.add(menuGroup);

        menuMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/mesage1.png"))); // NOI18N
        menuMessage.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/message_selected1.png"))); // NOI18N
        menuMessage.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/appchat/icon/mesage1.png"))); // NOI18N
        menuMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMessageActionPerformed(evt);
            }
        });
        menu.add(menuMessage);

        sp.setBackground(new java.awt.Color(242, 242, 242));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setOpaque(true);

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sp))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMessageActionPerformed
        if(!menuMessage.isSelected()){
            menuMessage.setSelected(true);
            menuGroup.setSelected(false);
            
            showMessage();
        }
    }//GEN-LAST:event_menuMessageActionPerformed

    private void menuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGroupActionPerformed
        if(!menuGroup.isSelected()){
            menuMessage.setSelected(false);
            menuGroup.setSelected(true);
            showGroup();
        }
    }//GEN-LAST:event_menuGroupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane menu;
    private com.appchat.component.MenuButton menuGroup;
    private javax.swing.JLayeredPane menuList;
    private com.appchat.component.MenuButton menuMessage;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}

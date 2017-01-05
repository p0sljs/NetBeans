/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciassictelevision;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;

/**
 *
 * @author LeeJaeseok
 */
public class ClassicTelevision extends javax.swing.JFrame {

    /**
     * Creates new form ClassicTelevision
     */
    private int IMAGE_W = 400;
    private int IMAGE_H = 300;
    private boolean power = true;
    
    public ClassicTelevision() {
        initComponents();
        
        for (int i = 0; i < icons.length; i++) {
            ResizeImage(imageNames[i], i, icons);
        }
        setImage(0);
    }
    
    private void ResizeImage(String imageName, int index, ImageIcon[] imgIcons) {
        java.net.URL imgUrl = this.getClass().getResource(imageName);
        if (imgUrl == null) {
            return;
        }
        Image img = new ImageIcon(imgUrl).getImage().getScaledInstance(IMAGE_W, IMAGE_H, Image.SCALE_DEFAULT);
        imgIcons[index] = new ImageIcon(img);
    }
    
    private void setImage(int chNo) {
        ImageIcon icon = icons[chNo];
        lblImage.setIcon(icon);
        lblImage.invalidate();
    }
    
    private void setZoom(int zoom) {
        IMAGE_W = zoom * 4;
        IMAGE_H = zoom * 3;
        for (int i = 0; i < icons.length; i++) {
            ResizeImage(imageNames[i], i, icons);
        }
        setImage(0);
    }
    
    ImageIcon[] icons = {
        new ImageIcon("images/appleGalaxy_800x600.jpg"),
        new ImageIcon("images/earth_800x600.jpg"),
        new ImageIcon("images/macOSXLake_800x600.jpg"),
        new ImageIcon("images/setaDeMarioBros_800x600.jpg"),
        new ImageIcon("images/sunflower_800x600.jpg")
    };
    
    String[] imageNames = {
        "images/appleGalaxy_800x600.jpg",
        "images/earth_800x600.jpg",
        "images/macOSXLake_800x600.jpg",
        "images/setaDeMarioBros_800x600.jpg",
        "images/sunflower_800x600.jpg"
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPowerOn = new javax.swing.JButton();
        cmbChannel = new javax.swing.JComboBox<>();
        sldImgZoom = new javax.swing.JSlider(JSlider.HORIZONTAL,1,100,100);
        lblZoom = new javax.swing.JLabel();
        panImage = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classic Television");

        btnPowerOn.setText("Power Off");
        btnPowerOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerOnActionPerformed(evt);
            }
        });

        cmbChannel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cmbChannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChannelActionPerformed(evt);
            }
        });

        sldImgZoom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldImgZoomStateChanged(evt);
            }
        });

        lblZoom.setText("1");

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panImageLayout = new javax.swing.GroupLayout(panImage);
        panImage.setLayout(panImageLayout);
        panImageLayout.setHorizontalGroup(
            panImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panImageLayout.setVerticalGroup(
            panImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbChannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sldImgZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblZoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPowerOn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPowerOn)
                            .addComponent(lblZoom))
                        .addComponent(sldImgZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbChannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPowerOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerOnActionPerformed
        JButton powerBtn = (JButton) evt.getSource();
        if (power) {
            powerBtn.setText("Power On");
            power = false;
            lblImage.setIcon(null);
        } else {
            powerBtn.setText("Power Off");
            power = true;
            cmbChannel.setSelectedIndex(0);
            setImage(0);
        }
    }//GEN-LAST:event_btnPowerOnActionPerformed

    private void cmbChannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChannelActionPerformed
        if (power) {
            JComboBox cmb = (JComboBox) evt.getSource();
            int chNo = cmb.getSelectedIndex();
            setImage(chNo);
        }
    }//GEN-LAST:event_cmbChannelActionPerformed

    private void sldImgZoomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldImgZoomStateChanged
        JSlider sl = (JSlider) evt.getSource();
        int zoom = sl.getValue();
        
        String zoomStr = String.valueOf(zoom);
        lblZoom.setText(zoomStr + "%");
        
        setZoom(zoom);
    }//GEN-LAST:event_sldImgZoomStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassicTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassicTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassicTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassicTelevision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassicTelevision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPowerOn;
    private javax.swing.JComboBox<String> cmbChannel;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblZoom;
    private javax.swing.JPanel panImage;
    private javax.swing.JSlider sldImgZoom;
    // End of variables declaration//GEN-END:variables
}
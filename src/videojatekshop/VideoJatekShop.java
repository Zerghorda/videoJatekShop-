/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package videojatekshop;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author TarGergő(SZF_2022_20
 */
public class VideoJatekShop extends javax.swing.JFrame {

    /**
     * Creates new form VideoJatekShop
     */
    public VideoJatekShop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ValasztekRBG = new javax.swing.ButtonGroup();
        valasztekJp = new javax.swing.JPanel();
        Jatek1RBnt = new javax.swing.JRadioButton();
        Jatek2RBnt = new javax.swing.JRadioButton();
        Jatek3RBnt = new javax.swing.JRadioButton();
        Jatek4RBnt = new javax.swing.JRadioButton();
        Jatek1RendelCb = new javax.swing.JCheckBox();
        Jatek3RendelCb = new javax.swing.JCheckBox();
        Jatek4RendelCb = new javax.swing.JCheckBox();
        Jatek2RendelCb = new javax.swing.JCheckBox();
        RendelesBnt = new javax.swing.JButton();
        MegseBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jatekKepLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rendeloLbl = new javax.swing.JLabel();
        kiszalitLbl = new javax.swing.JLabel();
        telefonSzLbl = new javax.swing.JLabel();
        rendelotxtF = new javax.swing.JTextField();
        kiszalitTxtF = new javax.swing.JTextField();
        telefonSzTxtF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jatekLeirTxtA = new javax.swing.JTextArea();
        InformacioLbl = new javax.swing.JLabel();
        BGImg_Lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Játék Shop");
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valasztekJp.setBorder(javax.swing.BorderFactory.createTitledBorder("választékok"));

        ValasztekRBG.add(Jatek1RBnt);
        Jatek1RBnt.setSelected(true);
        Jatek1RBnt.setText("Baldur's Gate III");
        Jatek1RBnt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jatek1RBntItemStateChanged(evt);
            }
        });

        ValasztekRBG.add(Jatek2RBnt);
        Jatek2RBnt.setText("Monster Hunter Rise");
        Jatek2RBnt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jatek2RBntItemStateChanged(evt);
            }
        });

        ValasztekRBG.add(Jatek3RBnt);
        Jatek3RBnt.setText("Halo Infinite");
        Jatek3RBnt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jatek3RBntItemStateChanged(evt);
            }
        });

        ValasztekRBG.add(Jatek4RBnt);
        Jatek4RBnt.setText("Warhammer III");
        Jatek4RBnt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Jatek4RBntItemStateChanged(evt);
            }
        });

        Jatek1RendelCb.setText("Megrendelés");

        Jatek3RendelCb.setText("Megrendelés");

        Jatek4RendelCb.setText("Megrendelés");

        Jatek2RendelCb.setText("Megrendelés");

        javax.swing.GroupLayout valasztekJpLayout = new javax.swing.GroupLayout(valasztekJp);
        valasztekJp.setLayout(valasztekJpLayout);
        valasztekJpLayout.setHorizontalGroup(
            valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valasztekJpLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jatek4RBnt)
                    .addComponent(Jatek3RBnt)
                    .addComponent(Jatek2RBnt)
                    .addComponent(Jatek1RBnt))
                .addGap(18, 18, 18)
                .addGroup(valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Jatek4RendelCb)
                    .addComponent(Jatek3RendelCb)
                    .addComponent(Jatek1RendelCb)
                    .addComponent(Jatek2RendelCb))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        valasztekJpLayout.setVerticalGroup(
            valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valasztekJpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valasztekJpLayout.createSequentialGroup()
                        .addComponent(Jatek1RBnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jatek2RBnt))
                    .addGroup(valasztekJpLayout.createSequentialGroup()
                        .addComponent(Jatek1RendelCb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jatek2RendelCb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jatek3RBnt)
                    .addComponent(Jatek3RendelCb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valasztekJpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jatek4RBnt)
                    .addComponent(Jatek4RendelCb))
                .addContainerGap())
        );

        getContentPane().add(valasztekJp, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, 310, -1));

        RendelesBnt.setBackground(new java.awt.Color(0, 153, 255));
        RendelesBnt.setText("Rendelés");
        RendelesBnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelesBntActionPerformed(evt);
            }
        });
        getContentPane().add(RendelesBnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 289, 60));

        MegseBtn.setBackground(new java.awt.Color(204, 0, 102));
        MegseBtn.setText("Mégse");
        MegseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MegseBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MegseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 295, 60));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jatekKepLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/game1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jatekKepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jatekKepLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 30, 300, 200));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiszálitási adatok"));

        rendeloLbl.setText("Rendelő neve:");

        kiszalitLbl.setText("Kiszálítási cím:");

        telefonSzLbl.setText("Telefon szám:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(telefonSzLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonSzTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rendeloLbl)
                            .addComponent(kiszalitLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kiszalitTxtF, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(rendelotxtF))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rendeloLbl)
                    .addComponent(rendelotxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kiszalitLbl)
                    .addComponent(kiszalitTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonSzLbl)
                    .addComponent(telefonSzTxtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 196, -1, -1));

        jatekLeirTxtA.setColumns(20);
        jatekLeirTxtA.setRows(5);
        jatekLeirTxtA.setText("Massive RPG\nKörre osztot stratégiai játék.\nAhol te írhatod a saját történeted,\nés mindennek van következménye!");
        jScrollPane2.setViewportView(jatekLeirTxtA);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 300, 110));

        InformacioLbl.setLabelFor(jatekLeirTxtA);
        InformacioLbl.setText("informáciok");
        getContentPane().add(InformacioLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 70, 20));

        BGImg_Lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/BG.PNG"))); // NOI18N
        getContentPane().add(BGImg_Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void RendelesBntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelesBntActionPerformed
        boolean NincsNev = rendelotxtF.getText().equals("");
        boolean NincsTszam = telefonSzTxtF.getText().equals("");
        boolean NincsCim = kiszalitTxtF.getText().equals("");
        int ikon = 0;
        String uzenet = "";
        String cim = "";
        if (!NincsNev & !NincsTszam & !NincsCim) {
            informaciok();
        } else if (NincsNev) {
            ikon = JOptionPane.WARNING_MESSAGE;
            uzenet = "Nincs név megadva!";
            cim = "Nincs Név!";
        } else if (NincsTszam) {
            ikon = JOptionPane.WARNING_MESSAGE;
            uzenet = "Nincs Telefon szám megadva!";
            cim = "Nincs telefon szám!";
        } else if (NincsCim) {
            ikon = JOptionPane.WARNING_MESSAGE;
            uzenet = "Nincs cím megadva!";
            cim = "Nincs cím!";
        }
        JOptionPane.showMessageDialog(null, uzenet, cim, ikon);
    }//GEN-LAST:event_RendelesBntActionPerformed

    private void Jatek1RBntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jatek1RBntItemStateChanged
//        kepcsere("kepek/game1.png")
        jatekLeirTxtA.setText("Massive RPG \n Körre osztot stratégiai játék.\nAhol te írhatod a saját történeted,\nés mindennek van következménye!");
    }//GEN-LAST:event_Jatek1RBntItemStateChanged

    private void Jatek2RBntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jatek2RBntItemStateChanged
//        kepcsere("kepek/game2.png")
        jatekLeirTxtA.setText("Kreálj egy karaktert és vadász különféle \nNagy bestiákat és szerez belőlük nyers anyagot,\n hogy nagyobb zsákmányra vadász.");
    }//GEN-LAST:event_Jatek2RBntItemStateChanged

    private void Jatek3RBntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jatek3RBntItemStateChanged
//        kepcsere("kepek/game3.png");
        jatekLeirTxtA.setText("Fps,Open world játék \nJátsz egyjátékosba vagy coop-ba \n,harcolj az idegenek ellen \nés mentsd  meg a univerzumot.");
    }//GEN-LAST:event_Jatek3RBntItemStateChanged

    private void Jatek4RBntItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Jatek4RBntItemStateChanged
//        kepcsere("kepek/game4.png");
        jatekLeirTxtA.setText("Turn based és Real time Stratégiai játék,\nVálasz egy fájt a nagy vátozaték közül és \ngyözdle az ellenfeleidet,\n akár foglald el az egész világot!");
    }//GEN-LAST:event_Jatek4RBntItemStateChanged

    private void MegseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MegseBtnActionPerformed
        JOptionPane.showMessageDialog(null, "Visszlát!");
        System.exit(0);
    }//GEN-LAST:event_MegseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VideoJatekShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VideoJatekShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VideoJatekShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VideoJatekShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VideoJatekShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGImg_Lbl;
    private javax.swing.JLabel InformacioLbl;
    private javax.swing.JRadioButton Jatek1RBnt;
    private javax.swing.JCheckBox Jatek1RendelCb;
    private javax.swing.JRadioButton Jatek2RBnt;
    private javax.swing.JCheckBox Jatek2RendelCb;
    private javax.swing.JRadioButton Jatek3RBnt;
    private javax.swing.JCheckBox Jatek3RendelCb;
    private javax.swing.JRadioButton Jatek4RBnt;
    private javax.swing.JCheckBox Jatek4RendelCb;
    private javax.swing.JButton MegseBtn;
    private javax.swing.JButton RendelesBnt;
    private javax.swing.ButtonGroup ValasztekRBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jatekKepLbl;
    private javax.swing.JTextArea jatekLeirTxtA;
    private javax.swing.JLabel kiszalitLbl;
    private javax.swing.JTextField kiszalitTxtF;
    private javax.swing.JLabel rendeloLbl;
    private javax.swing.JTextField rendelotxtF;
    private javax.swing.JLabel telefonSzLbl;
    private javax.swing.JTextField telefonSzTxtF;
    private javax.swing.JPanel valasztekJp;
    // End of variables declaration//GEN-END:variables

    private int informaciok() {
        String Cim = "Rendelés";
        String RendInf = "Meg Rendelt Játék(ok) : ";
        String nev = rendeloLbl.getText();
        String telefon = telefonSzLbl.getText();
        String cim = kiszalitLbl.getText();
        String rendelt = rendeltek();
        int osszeg = szamolas();
        String format = String.format("%s\nRendelő neve: %s\nKiszálítási cím: %s\nMegrendelő Telefon száma: %s\nRendelt játék(ok): %s\nVégosszeg: %d", RendInf, nev, cim, telefon, rendelt, osszeg);
        int valasz = JOptionPane.showConfirmDialog(rootPane, format, Cim, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (valasz == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Köszönjük,hogy nálunk rendelt!");
            System.exit(0);
        }
        if (valasz == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        return valasz;
    }

//    private void kepcsere(String kep) throws IOException {
//        File kellKep = new File(kep);
//    }
    private String rendeltek() {
        Boolean[] rendeltek = {Jatek1RendelCb.isSelected(), Jatek2RendelCb.isSelected(), Jatek3RendelCb.isSelected(), Jatek4RendelCb.isSelected()};
        String[] JatekokNeve = {Jatek1RBnt.getText(), Jatek2RBnt.getText(), Jatek3RBnt.getText(), Jatek4RBnt.getText()};
        String txt = "\n";
        for (int i = 0; i < rendeltek.length; i++) {
            if (rendeltek[i]) {
                txt += "-" + JatekokNeve[i] + "\n";
            }
        }
        return txt;

    }

    private int szamolas() {
        Boolean[] rendeltek = {Jatek1RendelCb.isSelected(), Jatek2RendelCb.isSelected(), Jatek3RendelCb.isSelected(), Jatek4RendelCb.isSelected()};
        int[] JatekAr = {22700, 11400, 26500, 22700};
        int osszeg = 0;
        for (int i = 0; i < rendeltek.length; i++) {
            if (rendeltek[i]) {
                osszeg += JatekAr[i];
            }
        }
        return osszeg;
    }
}

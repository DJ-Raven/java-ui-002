package com.raven.form;

import com.raven.component.Card;
import com.raven.model.Model_Card;
import com.raven.swing.ScrollBar;
import com.raven.swing.WrapLayout;
import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        init();
    }

    private void init() {
        panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/1.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/2.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/3.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/4.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/5.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/6.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/7.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/8.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/9.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/10.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/11.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/12.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.revalidate();
        panel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));

        jScrollPane1.setBorder(null);

        panel.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

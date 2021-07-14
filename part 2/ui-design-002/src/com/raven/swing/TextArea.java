package com.raven.swing;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JTextArea;

//  make this for disable mouse event
public class TextArea extends JTextArea {

    public TextArea() {
        setEditable(false);
        setFocusable(false);
        setWrapStyleWord(true);
        setLineWrap(true);
    }

    @Override
    public synchronized void addMouseListener(MouseListener ml) {
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener ml) {
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener ml) {
    }

    @Override
    public void addNotify() {
    }
}

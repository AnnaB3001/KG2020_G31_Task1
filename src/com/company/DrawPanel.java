package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Background bg = new Background(560, 800);
    private Cloud cl = new Cloud(150, 100, 400, 200);
    private Mountains ms = new Mountains(800, 300);
    private Balloon bl = new Balloon(250,550);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        bg.draw(gr);
        cl.draw(gr);
        ms.draw(gr);
        bl.draw(gr);
    }
}

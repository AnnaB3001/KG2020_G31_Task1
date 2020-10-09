package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Background bg = new Background(900, 800);
    private Cloud cl = new Cloud(350, 80, 400, 200);
    private Mountains ms = new Mountains(800, 300);
    private Balloon bl = new Balloon(550,67, 250,550, "Свобода");
    private Sun sn = new Sun(100, 100, 40,80,45,Color.orange);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        bg.draw(gr);
        cl.draw(gr);
        ms.draw(gr);
        bl.draw(gr);
        sn.draw(gr);
    }
}

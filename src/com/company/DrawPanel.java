package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Background bg = new Background(500, 800);
    private Cloud cl = new Cloud(250, 150, 400, 200);
    private Mountains ms = new Mountains(0);
    private Balloon bl = new Balloon(400,250, 400,200);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        bg.draw(gr);
        cl.draw(gr);
        ms.draw(gr);
        bl.draw(gr);
    }
}

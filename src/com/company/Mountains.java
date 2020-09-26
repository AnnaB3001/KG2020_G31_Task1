package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;

public class Mountains implements Drawable {
    int weigh;

    public Mountains(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public void draw(Graphics2D g) {
        drawMountains(g);
    }

    private void drawMountains(Graphics2D gr) {
        gr.setColor(new Color(150, 0, 0));
        gr.fillArc(1, 900, 500, 250,0, 180);
    }
}

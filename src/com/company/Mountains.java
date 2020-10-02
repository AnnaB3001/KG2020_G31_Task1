package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;

public class Mountains implements Drawable {
    int weigh;
    int height;

    public Mountains(int weigh, int height) {
        this.weigh = weigh;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g) {
        drawMountains(g);
    }

    private void drawMountains(Graphics2D gr) {
        for (int i = 0; i < 5; i++) {
            gr.setColor(Color.pink);
            gr.drawArc(i * 190 - 80, 3 * height / 2 + 26, 190, 180, 0, 180);
        }
        for (int i = 0; i < 6; i++) {
            gr.setColor(Color.LIGHT_GRAY);
            gr.drawArc(i * 220 - 30, height + 265, 210, 180, 0, 180);
        }
    }
}

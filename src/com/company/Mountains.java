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
        for (int i = 0; i < 6; i++) {
            gr.setColor(Color.pink);
            gr.fillArc(i * 160 - 195 , 3 * height / 2 + 50, 200, 300, 0, 180);
        }
        for (int i = 0; i < 4; i++) {
            gr.setColor(new Color(121, 121, 121, 255));
            gr.fillArc(i * 200 - 15, height + 240, 215, 250, 0, 180);
        }
    }
}

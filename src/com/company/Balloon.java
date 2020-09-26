package com.company;

import java.awt.*;

public class Balloon implements Drawable{
    int height;
    int weigh;
    int x, y;

    public Balloon(int height, int weigh, int x, int y) {
        this.height = height;
        this.weigh = weigh;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBalloon(g);
    }

    private void drawBalloon(Graphics2D gr) {
        gr.setColor(new Color(242, 3, 255));
        gr.fillOval(400, 100, 150, 300 );
    }
}

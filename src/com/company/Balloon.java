package com.company;

import java.awt.*;

public class Balloon implements Drawable{
    int height;
    int weigh;

    public Balloon(int height, int weigh) {
        this.height = height;
        this.weigh = weigh;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBalloon(g, weigh, height);
    }

    private void drawBalloon(Graphics2D gr, int height, int weigh) {
        gr.setColor(new Color(242, 3, 255));
        gr.fillOval(height/4 + 400, weigh/2 - 80, 200, 300 );
        gr.setColor(new Color(242,3,255));
       // gr.fillRect(height/2 + 373, weigh/2 + 170, 50, 50);
        gr.setColor(Color.black);
        gr.drawLine(weigh/2 + 545, height/2 + 62, weigh/2 + 545, height/ 2 + 83);
        gr.drawLine(weigh/2 + 480, height/2 + 62, weigh/2 +480, height / 2 + 83);
        gr.setColor(new Color(97, 40, 36));
        gr.fillRect(weigh/2 + 472, height/2 + 83, 80, 50);
        gr.setColor(new Color(3, 255, 37));
        gr.fillOval(height/4 + 50, weigh/4 + 110, 170, 190 );
        gr.setColor(new Color(242,3,255));
        // gr.fillRect(height/2 + 373, weigh/2 + 170, 50, 50);
        gr.setColor(Color.black);
        gr.drawLine(weigh/4 + 180, height/4 + 220, weigh/4 + 180, height/ 4 + 233);
        gr.drawLine(weigh/4 + 240, height/4 + 220, weigh/4 + 240, height / 4 + 233);
        gr.setColor(new Color(97, 40, 36));
        gr.fillRect(weigh/4 + 170, height/4 + 233, 80, 35);
    }
}

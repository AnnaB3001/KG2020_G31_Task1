package com.company;

import java.awt.*;

public class Balloon implements Drawable{
    int height, weigh;

    public Balloon(int height, int weigh) {
        this.height = height;
        this.weigh = weigh;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBalloon(g,weigh, height);
    }

    private void drawBalloon(Graphics2D gr, int height, int weigh) {
        gr.setColor(new Color(135, 10, 224));
        gr.fillArc(weigh / 2 + 80,height / 4 + 150, 135,190,90,180 );
        gr.fillArc(weigh / 2 + 80,height / 4 + 150, 135,190,270,180 );
        gr.setColor(new Color(196, 46, 46));
        gr.fillArc(weigh / 2 + 100,height / 4 + 150, 100,190,90,180 );
        gr.fillArc(weigh / 2 + 100,height / 4 + 150, 100,190,270,180 );
        gr.setColor(new Color(3,255,37));
        gr.fillArc(weigh / 2 + 118,height / 4 + 150, 65,190,90,180 );
        gr.fillArc(weigh / 2 + 118,height / 4 + 150, 65,190,270,180 );
        gr.setColor(new Color(135,10,224));
        gr.fillArc(weigh / 2 + 133,height / 4 + 150, 35,190,90,180 );
        gr.fillArc(weigh / 2 + 133,height / 4 + 150, 35,190,270,180 );
        gr.setColor(Color.black);
        gr.drawLine(weigh/4 + 250, height/4 + 360, weigh/4 + 250, height/ 4 + 332);
        gr.drawLine(weigh/4 + 305, height/4 + 360, weigh/4 + 305, height / 4 + 332);
        gr.setColor(new Color(97, 40, 36));
        gr.fillRect(weigh/4 + 238, height/4 + 360, 80, 35);
    }
}

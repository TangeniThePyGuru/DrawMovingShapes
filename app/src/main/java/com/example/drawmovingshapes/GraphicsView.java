package com.example.drawmovingshapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class GraphicsView extends View {

    public GraphicsView(Context context)
    {
        super(context);
    }

    public void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();

        paint.setColor(Color.parseColor("#990000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 200, 100, paint);

        paint.setColor(Color.parseColor("#009900"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(500, 200, 100, paint);

        paint.setColor(Color.parseColor("#990000"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100, 700, 300, 1200, paint);

        paint.setColor(Color.parseColor("#009900"));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(500, 700, 700, 1000, paint);

        paint.setColor(Color.parseColor("#000099"));
        paint.setStrokeWidth(20);
        canvas.drawLine(200, 400, 300, 600, paint);

        paint.setColor(Color.parseColor("#000099"));
        paint.setStrokeWidth(10);
        canvas.drawPoint(300, 1300, paint);

        drawTriangle(600, 1200, 900, 1200, 800, 1400, "#990000", canvas);
    }

    private void drawTriangle(float x1, float y1, float x2, float y2, float x3, float y3,
                              String color, Canvas canvas)
    {
        Path path = new Path();
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.lineTo(x1, y1);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor(color));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);

        canvas.drawPath(path, paint);
    }

}

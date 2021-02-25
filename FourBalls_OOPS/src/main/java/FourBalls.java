import processing.core.PApplet;

public class FourBalls extends PApplet
{

    public static int Width=500;
    public static int Height=500;
    public static Sketch ball[]=new Sketch[4];
    public static void main(String[] args)
    {
       PApplet.main("FourBalls",args);

    }

    @Override
    public void settings()
    {
        size(Width,Height);
        for(int i=0;i<4;i++)
        {
            ball[i]=new Sketch(this,Height*(i+1)/5,i+1);
        }

    }
    @Override
    public void draw()
    {
        for(int i=0;i<4;i++)
        {
            ball[i].drawBall().move();
        }

    }

}
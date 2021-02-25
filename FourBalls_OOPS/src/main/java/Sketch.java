import processing.core.PApplet;
public class Sketch extends PApplet
{

    private FourBalls parent;
    private int Height;
    private int Width;
    private int pos;
    private int speed;
    private int x=0;

    public Sketch(FourBalls parent,int pos, int speed)
    {
        this.pos=pos;
        this.speed=speed;
        this.x=0;
        this.parent=parent;
    }

    public Sketch drawBall()
    {
        parent.ellipse(this.x,this.pos,10,10);
        return Sketch.this;
    }

    public void move()
    {
        this.x+=this.speed;
    }
}

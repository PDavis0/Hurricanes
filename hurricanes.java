import java.util.*;

/*  Creates 4 hurricane objects according to 
 */

public class hurricanes
{
    Random myGenerator = new Random();
    
    public int duration=1 + myGenerator.nextInt(500);
    //time it is alive in hours (1-500 hours)
    public int speed = 74 + myGenerator.nextInt(126);
    //speed of the hurricane - mph (74- 200 MPH)
    public int type = 1 + myGenerator.nextInt(3);
    // 1- typhoon, 2 - cyclone, 3 - hurricane (1-3)
    public int category = 0;
    //severity
   
    public boolean touchdown=myGenerator.nextInt(2)%2>0;
    public boolean death=myGenerator.nextInt(5)==4;
    public boolean harambe=myGenerator.nextInt(2)%2>0;
    public boolean flood=myGenerator.nextInt(4)==3;
    
    
    
    //creates the 8 total variables
    public hurricanes()
    {        
    }
    
    public hurricanes(int d, int s,int t, int c)
    {        
        duration=d;
        speed=s;
        type=t;
        category=c;
    }
    public hurricanes(boolean td,boolean d,boolean h,boolean f)
    {
        touchdown=td;
        death=d; 
        harambe=h;
        flood=f;        
    }
    
    
    //if main program wants these values these send them to it
    public int getDuration( )
    {
        return duration;
    }
    public void setDuration(int x)
    {//changes if time is too long
        duration=duration-x;
    }
        
    public int getSpeed( )
    {
        return speed;
    }
    public void setSpeed(int x)
    {
    
    }
    
    public int getType( )
    {
        return type;
    }
    public void setType(int x)
    {
        type++;
    }
    
    public int getCategory( )
    {
        return category;
    }
    public void setCategory(int x)
    {
        category=x;
    }
    
    
    public boolean getTouchdown( )
    {
        return touchdown;
    }
   // public void setTouchdown(int x)
    //{
       // touchdown != touchdown;
   // }
    
    public boolean getDeath( )
    {
        return death;
    }
    
    public boolean getHarambe( )
    {
        return harambe;
    }
    
    public boolean getFlood( )
    {
        return flood;
    }
}

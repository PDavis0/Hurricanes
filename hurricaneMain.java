/*Parker Davis
 * 10/6/2016
 * main program for hurricanes
 * - preforms tasks
 */

import java.util.*;
import java.io.*;

public class hurricaneMain
{
    public static void main(String args[])
    {
        System.out.print("\u000C");//CLS

        Scanner kbReader = new Scanner(System.in);//sets up scanner(keyboard)
        Random myGenerator = new Random();//sets up random statement
        int numHurricanes = 25 +  myGenerator.nextInt(475);//25-500

        int day=0;// calculation using duration
        int hour=0;//calculation using duration
        int choice=0;//intructs what the user wants to do
        int searchValue=0;//the value they want to search by
        int bottom,top;//interval searches
        int a=0;//keeps program running continuously

        //creates hurricanes array to generated length
        hurricanes HC[]=new hurricanes[numHurricanes];

        //runs for each hurricane (array) to desired length of #hurricanes
        for (int i = 0;i<HC.length;i++)
        {
            //creates "new" hurricane and puts it into the array
            HC[i]=new hurricanes();

            //duration calculation
            day = (HC[i].getDuration())/24;
            hour = (HC[i].getDuration())%24;

            //category calculation
            if (HC[i].getSpeed()<=95)
            {//defines category according to the speed
                HC[i].setCategory(1);
            }
            else if(HC[i].getSpeed()>95 && HC[i].getSpeed()<=110)
            {
                HC[i].setCategory(2);
            }
            else if(HC[i].getSpeed()>110 && HC[i].getSpeed()<=129)
            {
                HC[i].setCategory(3);
            }  
            else if(HC[i].getSpeed()>129 && HC[i].getSpeed()<=156)
            {
                HC[i].setCategory(4);
            }
            else if (HC[i].getSpeed()>156)
            {
                HC[i].setCategory(5);
            }
        }

        //main function
        //runs program until the user wants to drop out
        do{

            System.out.println("1. Sort Duration (hours)");
            System.out.println("2. Sort Speed");
            System.out.println("3. Sort Type");
            System.out.println("4. Sort category");
            System.out.println("5. Number of Hurricanes");
            System.out.println("6. Specific Hurricane");
            System.out.println("0 - break");

            choice = kbReader.nextInt( );//inputs from keyboard
            System.out.print("\u000C");//CLS
            switch (choice)
            {
                //if user doesnt want to continue
                case 0:
                a=1;
                break;

                case 1: //duraction
                System.out.println("What interval would you like to search by?   (HOURS)");

                System.out.println("what is the lower bound?");
                bottom = kbReader.nextInt( );//inputs from keyboard
                System.out.println("what is the upper bound?");
                top = kbReader.nextInt( );//inputs from keyboard
                for (int j = 0;j<HC.length;j++)
                {
                    if (HC[j].getDuration()>=bottom && HC[j].getDuration()<=top)
                    { 
                        day = (HC[j].getDuration())/24;
                        hour = (HC[j].getDuration())%24;
                        System.out.println("Hurricane"+j+": " +day+" days, "+hour+" hours");

                        //pauses after every run
                        for(int pause=0;pause<100000000;pause++)
                        {}  
                    }
                }
                break;    

                case 2: // speed
                System.out.println("What interval would you like to search by?  (MPH)");

                System.out.println("what is the lower bound?");
                bottom = kbReader.nextInt( );//inputs from keyboard
                System.out.println("what is the upper bound?");
                top = kbReader.nextInt( );//inputs from keyboard
                for (int j = 0;j<HC.length;j++)
                {
                    if (HC[j].getSpeed()>=bottom && HC[j].getSpeed()<=top)
                    {                  
                        System.out.println("Hurricane"+j+": "+HC[j].getSpeed()+" MPH");

                        //pauses after every run
                        for(int pause=0;pause<100000000;pause++)
                        {}  
                    }
                }

                break;

                case 3: // Type
                System.out.print("1 - Typhoon: ");
                System.out.print("2 - Cyclone: ");
                System.out.print("3 - Hurricane: ");
                searchValue = kbReader.nextInt( );//inputs from keyboard
                for (int j = 0;j<HC.length;j++)
                {
                    if (HC[j].getType()==searchValue)
                    {                  
                        System.out.print("Hurricane"+j+": " );

                        //prints out the type of hurricane using an int  to string
                        if (searchValue == 1)
                        {System.out.println("Typhoon");}
                        else if(searchValue == 2)
                        {System.out.println("Cyclone");}
                        else if(searchValue == 3)
                        {System.out.println("Hurricane");}

                        //pauses after every run
                        for(int pause=0;pause<100000000;pause++)
                        {}  
                    }
                }
                break;

                case 4: //category

                System.out.print("What category would you like to search? ");
                searchValue = kbReader.nextInt( );//inputs from keyboard

                for (int j = 0;j<HC.length;j++)
                {
                    if (HC[j].getCategory()==searchValue)
                    {                  
                        System.out.println("Hurricane"+j);

                        //pauses after every run
                        for(int pause=0;pause<10000000;pause++)
                        {}  
                    }
                }
                break;

                case 5:
                System.out.println((numHurricanes-1)+" Hurricanes");

                //pauses after every run
                for(int pause=0;pause<100000000;pause++)
                {} 
                break;
                case 6://user specific hurricane
                System.out.println("What hurricane do you want to see? (0-"+(numHurricanes-1)+")");
                searchValue = kbReader.nextInt( );//inputs from keyboard

                day = (HC[searchValue].getDuration())/24;//duration calculation
                hour = (HC[searchValue].getDuration())%24;//duration calculation

                //prints out all of the hurricanes,(needs for-loop for array)
                System.out.println("Duration: "+day+" days, "+hour+" hours");                      
                System.out.println("Speed: " +HC[searchValue].getSpeed());
                System.out.print("Type: ");

                //prints out the type of hurricane using an int  to string
                if (HC[searchValue].getType() == 1)
                {System.out.println("Typhoon");}
                else if(HC[searchValue].getType()== 2)
                {System.out.println("Cyclone");}
                else if(HC[searchValue].getType() == 3)
                {System.out.println("Hurricane");}

                System.out.println("Category: " +HC[searchValue].getCategory()+"\n");
                
                System.out.print("Touchdown: ");
                if (HC[searchValue].getTouchdown()==true)
                {System.out.println("Yes");}
                else
                {System.out.println("No");}
                
                System.out.print("Was Harambe alive? ");
                if (HC[searchValue].getHarambe()==true)
               {System.out.println("Yes");}
               else
            {System.out.println("No, RIP in peace Harambe");} //conry jokes from 2015/16
                
                System.out.print("Deaths: ");
                if (HC[searchValue].getDeath()==true)
                {System.out.println("Yes");}
                else
                {System.out.println("No");}
                
                System.out.print("Flood: ");
                if (HC[searchValue].getFlood()==true)
                {System.out.println("Yes");}
                else
                {System.out.println("No");}
                break;
                
                

                default:
                System.out.println("Don't be that guy");

            }

            //prints out all of the hurricanes,(needs for-loop for array)
            //System.out.println("Hurricane"+i+": " +day+" days, "+hour+" hours");                      
            //System.out.println("Hurricane"+i+": " +HC[i].getSpeed());
            //System.out.println("Hurricane"+i+": " +HC[i].getType());
            //System.out.println("hurricane"+i+": " +HC[i].getCategory()+"\n");       
        }while (a==0);                   
    }        
}
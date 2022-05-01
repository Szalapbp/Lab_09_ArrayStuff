import java.util.Random;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {


        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int [] dataPoints = new int[100];
        for(int x = 0; x < dataPoints.length; x ++)
        {
           dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for(int x = 0; x < dataPoints.length; x ++)
        {
            System.out.print(dataPoints[x] + " | " );
        }
            System.out.println();

        int sum = 0;
        for(int x = 0; x < dataPoints.length; x ++)
        {
            sum = sum + dataPoints[x];

        }
            System.out.println();
            System.out.println("The sum of the data points is " + sum);

        int average = 0;
        for(int x = 0; x < dataPoints.length; x ++)
        {
            average = sum / dataPoints.length;

        }
        System.out.println("The average of the data points is " + average);
            System.out.println();


            int hundred;
            hundred = SafeInput.getRangedInt(in,"Input an integer to search for",1, 100);
            boolean foundTarget = false;
        int found = 0;
        for(int x = 0; x < dataPoints.length; x ++)
        {
            if(dataPoints[x] == hundred)
            {

                found = found + 1;
                foundTarget = true;

                System.out.println("Found " + hundred + " at index " + x);
            }


        }
        if(!foundTarget)
        {
            System.out.println("Target value " + hundred + " was not found.");
        }
        System.out.println("Target Value " + hundred + " was found " + found + " times.");
        System.out.println();
foundTarget = false;
       int checkAgain = SafeInput.getRangedInt(in,"Input another integer to search for",1,100);
        for(int x = 0; x < dataPoints.length; x ++)
        {
           if(dataPoints[x] == checkAgain)
            {
                foundTarget = true;
              System.out.println("The value " + checkAgain + " was found at array index " + x);
              break;
            }
        }
        if(!foundTarget)
        {
            System.out.println("Target value " + checkAgain + " was not found.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x ++)
        {
            if(min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if(max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println();
        System.out.println("The minimum value of the data is " + min);
        System.out.println("\nThe maximum value of the data is " + max);

    }

    }




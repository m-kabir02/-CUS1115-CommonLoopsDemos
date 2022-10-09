 import java.util.Scanner;
    public class CommonLoopsDemos {
        public static void main(String[] args){
            /* * Suppose we wanted to create2 random integer comparisons between the values 1 and 6,
            * * 10 times called d1 and d2 to simulate 2 dice being tossed using a for loop
            * */
            System.out.println("d1\td2");

            for(int i=1;i<=10;i++)
            {
                int d1=(int)(6*Math.random())+1;
                int d2=(int)(6*Math.random())+1;
                System.out.println(d1+"\t"+d2);
            }

            //using a for loop to calculate sum and average
            // using inputs from a keyboard/
            // * Steps to calculate the sum and average using a loop interactively assuming
            // Scanner is imported and created
            // Step1 You must assign the first sum to be either 0 or 0.
            // 0 depending if working with integers or decimals
            // Step 2 Create the loop you want to work with for the calculation
            // Step 3 Interactively get a value by asking a question and taking in the input
            // Step 4 Add that value to the previous sum
            // Step 5 Output the sum outside of the loop
            // Step 6 You can also output the average outside of the loop
            // */

            Scanner kb=new Scanner(System.in);
            int sum=0;//Step 1
            int numTimes;
            System.out.print("How many integers would you like to calculate the sum of:");
        numTimes=kb.nextInt();
        for(int i=1;i<=numTimes;i++)
            //Step 2
            {
                System.out.print("Enter an integer:");
                //Step3
                int val=kb.nextInt();
                //Step 3
                sum+=val;
                //Step 4 same as
                sum=sum+val;
            }
        System.out.println("Sum is "+sum);//Step 5
        System.out.println("Average is "+(sum)/numTimes);//Step 6
            // do the same thing using decimal values
            double sum2=0.0;//Step 1
            int numTimes2;
            System.out.print("How many decimals would you like to calculate the sum of:");
            numTimes2=kb.nextInt();

            for(int i=1;i<=numTimes2;i++)//Step 2
                 {
                  System.out.print("Enter a decimal value:");//Step3
                  double val2=kb.nextDouble();//Step 3
                  sum2+=val2;//Step 4 same as
                      sum2=sum2+val2;
                 }
            System.out.println("Sum is "+sum2);//Step 5
            System.out.println("Average is "+(sum2)/numTimes2);//Step 6

            // using a while loop to print the sum of value for
            // as long as a decimal value is input into the keyboard
            // EG hasNextDouble()
            System.out.print("Enter decimal values to create a sum:");
            double total=0.0; //Step1
             while(kb.hasNextDouble())// as long as a double value is typed in continue the while loop
                 // Eg. Typing in a word will end this loop
                 {
                     double val3=kb.nextDouble();
                     total+=val3;
                 }
             System.out.println("The sum using the while loop is "+total);

}}

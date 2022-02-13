import java.io.*;

import java.util.*;
public class simpleCalculator {
    public static void main(String [] args) throws Exception{
        int num1,num2,result1,result2,result3 ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input value of x: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Input value of y: ");
        num2 = Integer.parseInt(br.readLine());
        result1 = num1 + num2 ;
        result2 = num1 * num2 ;
        result3= num1 / num2 ;
        float result4  = num1 - num2 ;
        System.out.println("Division of result is");
        System.out.println("Addition of result is " + result1);
        System.out.println("Subbtration of result is " + result4);
        System.out.println("Multiplication of result is " + result2);
        System.out.println("Division of result is " + result3);

            int day,month,year;
            int second,minute,hour;
            Calendar date = new GregorianCalendar();
            day = date.get(Calendar.DAY_OF_MONTH);
            month = date.get(Calendar.MONTH);
            year = date.get(Calendar.YEAR);
            second = date.get(Calendar.SECOND);
            minute = date.get(Calendar.MINUTE);
            hour = date.get(Calendar.HOUR);
            System.out.println("Date is " + day + "/" + (month+1) + "/" + year);
            System.out.println("Time is " + (hour+12) + ":" + minute + ":" + second);


    }
    }


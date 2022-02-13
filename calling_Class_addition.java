import java.io.*;
public class calling_Class_addition {

int sum(int num1, int num2) {

    return (num1+num2);
    }

        public static void main(String[] args) throws  IOException{
            int x,y;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input two integers: ");
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());

            calling_Class_addition add = new calling_Class_addition();
            System.out.println("Result od addition is: " + add.sum(x,y));

        }

    }


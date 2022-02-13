public class swapValues {
    class swapFrist_value {
        int num1, num2, a, b;

        swapFrist_value(int a, int b) {
            num1 = a;
            num2 = b;
        }

    }


    class swapSec_value {
        void swap(swapFrist_value s) {
            int output = s.num1;
            s.num1 = s.num2;
            s.num2 = output;
        }


    }


public void main(String[] args) {
        swapFrist_value s1 = new swapFrist_value(20, 10);
        System.out.println("Before swapping: " + s1.num1 + "\t" + s1.num2);
        swapSec_value s2 = new swapSec_value();
        s2.swap(s1);
        System.out.println("After swapping: " + s1.num1 + "\t" + s1.num2);


    }

}

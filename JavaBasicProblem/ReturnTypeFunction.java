package JavaBasicProblem;

public class ReturnTypeFunction {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, maximum;
        maximum = max(n1,n2);
        System.out.println("maximum is " + maximum);
    }

    public static int max(int num1, int num2){
        int result;
        if(num1 > num2)
            result = num1;
        else
            result = num2;
        return result;

       }
    }


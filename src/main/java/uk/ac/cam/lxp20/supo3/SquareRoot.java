package uk.ac.cam.lxp20.supo3;

public class SquareRoot {
    static double SquareRoot(double number) throws NegativeInput{
        if (number<0){
            throw new NegativeInput();
        }
        double x = number;
        double last = 0; //ensures that it doesn't run if the input is 0
        while (Math.abs(x-last)>1e-20){
            last = x;
            x = x - (Math.pow(x,2)-number)/(2*x);
        }
        return x;
    }

    public static void main(String[] args) {
        try {
            System.out.println(SquareRoot(20));
        }
        catch (NegativeInput e){
            System.out.println("The number is negative so it doesn't have a square root.");
        }
    }
}

class NegativeInput extends Exception{}

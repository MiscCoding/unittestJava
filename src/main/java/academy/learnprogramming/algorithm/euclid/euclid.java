package academy.learnprogramming.algorithm.euclid;

//it finds the greatest common divisor
public class euclid {

    //implementation with recursion
    public int gcd(int number, int divisor){
        int remaining = (number % divisor);
        if(remaining != 0){
            return gcd(divisor, remaining);
        } else {
            return divisor;
        }
    }

    //implementation without recursion
    public int gcd2(int number, int divisor){
        while(divisor != 0){
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }
}

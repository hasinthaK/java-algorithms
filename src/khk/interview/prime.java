package khk.interview;

import java.util.ArrayList;


public class prime {
////////////////////////////////////////////////
    public static boolean isPrime(int number) {

        for(int i = 2; i <= number/2; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    //////////////////////////////////////////////////
    public static ArrayList primes(int upto) {
        ArrayList primes = new ArrayList();

        for(int current = 1; current <= upto; current++){
//            for(int i = 2; i <= current/2; i++){
//                if(current % i == 0) {
//
//                }
//            }
            if(isPrime(current)){
                primes.add(current);
            }
        }
        return primes;
    }
    /////////////////////////////////////////////////

    public static int reverseInt(int number){
        int temp = 0;
        while(number != 0){
            temp *= 10;
            temp += number % 10;
            number /= 10;
        }
        return temp;
    }

}

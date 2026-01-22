package Basics;

public class day5_waterBottles {

    public int bottles(int numBottle , int numExchange){

        int ans = numBottle;

        while(numExchange >= numBottle){

            int newBottles = numBottle / numExchange;

            int remBottles = numBottle % numExchange;

            ans = ans + newBottles ;

            numBottle = newBottles + remBottles;
        }

        return ans;

    }

    
    
}

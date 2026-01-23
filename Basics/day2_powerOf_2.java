package Basics;

class day2_powerOf_2
     {
      public static boolean power(int n)
      {
        if(n<1){
            return false;
        }else if(n==1){
            return  true;

        }else 
            while(n%2==0){
                n=n/2;
            }
            
    
          return n==1;
      }
    

    public static void main(String[] args) {
        int n =9 ;

        if (power(n)) {
            System.out.println(n + "  is power of two :- ");
        } else {
            System.out.println(n + "  is not power of two :- ");
        }
    
      }
     }

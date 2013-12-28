import java.lang.Math;

public class fib{
    public static void main(String args[]){
        resource a = new resource();
        
        // This program is only accurate between the values of 1 and 46 (inclusive)
        for (int i = 1; i < 47; i++){
            System.out.println( i +  " = " + (int) a.fibonacci(i));
        }
    }
}

// This resouce class 
class resource{
    public double goldenRatio(){
        return ( (1 + Math.sqrt(5) ) / 2);
    }

    public double fibonacci(int n){
        return ( ( (Math.pow(goldenRatio(), n))  - (Math.pow( 1 - goldenRatio(), n ) ) ) / Math.sqrt(5) );
    }
}

package logicalprograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int count=0,num=25;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;

            }

        }
        if(count==2){
            System.out.println(                                                                                                  "It is a prime");
        }
        else
            System.out.println(num +"It is not prime");

    }
}

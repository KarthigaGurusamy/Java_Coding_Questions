package Prime_Number;

public class Prime_Number {
    public static void main(String[] args) {

        System.out.println("The prime numbers between 1 to 100 are:");

        for(int i=1;i<=100;i++)
        {
            if(i==1)
            {
                continue;
            }
            int x = i;
            boolean isPrime=false;
            for(int j=2;j<=x/2;j++)
            {
                if(x%j==0)
                {
                    isPrime=true;
                    break;

                }
            }
            if(!isPrime)
            {
                System.out.println(x);
            }
        }
    }
}

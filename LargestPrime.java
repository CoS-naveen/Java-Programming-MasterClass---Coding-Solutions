package Section;

public class LargestPrime {
    public static int getLargestPrime(int number){
    if(number<=1)
        return -1;
    int largest=0;
    int n = number;
    while(number%2==0){
        number=number/2;
        largest=2;
    }
    for(int i=3;i<=n;i+=2){
        while(number>1 && number%i==0){
        	largest=i;
        	number=number/i;
        }
    }
    return largest;
}
    public static void main(String []args) {}
}
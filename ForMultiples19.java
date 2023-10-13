import java.util.Scanner;
public class ForMultiples19{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        int multiple;
        System.out.print("Input the multiple = ");
        multiple = scan.nextInt();
        for(int i=1;i<=50;i++){
            if(i%multiple == 0){
                sum = sum + i;
                counter++;
            }
        }
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter,multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);


    }
}
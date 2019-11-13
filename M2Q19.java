import java.util.*;
public class M2Q19{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int i =1;
        int j =1;
        while (i <= n) {
            System.out.print(i+"\t");
            i+=j;
            j++;
        }
        System.out.println(i);
        i=1;
        while(i <= n+1){
            for (int k =1; k<=i; k++) {
                System.out.print(i+"\t");
            }
            i++;
        }
        System.out.println();
    }
}
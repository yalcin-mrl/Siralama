import java.util.Arrays;
import java.util.Scanner;
public class siralama {
    public static void main(String[] args){
        int a, b, c;
        String sira = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayi: ");
        a = sc.nextInt();
        System.out.print("2. Sayi: ");
        b = sc.nextInt();
        System.out.print("3. Sayi: ");
        c = sc.nextInt();
        int[] sort= {a,b,c};
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++)
            if(sort[j]>sort[j+1]){
                int temp = sort[j];
                sort[j]=sort[j+1];
                sort[j+1] =temp;
            }
        }
        System.out.println(Arrays.toString(sort));
    }
}

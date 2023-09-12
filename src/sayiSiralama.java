import java.util.Scanner;
public class sayiSiralama {
    public static void main(String[] args) {

        //Değişkenler
        int a,b,c;

        //Scanner nesnesi
        Scanner inpt = new Scanner(System.in);

        //Sayıları al
        System.out.print("1. sayıyı giriniz: ");
        a = inpt.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = inpt.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        c = inpt.nextInt();

        //Sayıları karşılaştır
        if (a>b && a>c) {
            if (b > c){
                System.out.print("a>b>c");
            }else {
                System.out.print("a>c>b");
            }
        } else if (b>a && b>c) {
            if (a > c) {
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");
            }
        } else {
            if (a>b){
                System.out.print("c>a>b");
            }else {
                System.out.print("c>b>a");
            }
        }
    }
}
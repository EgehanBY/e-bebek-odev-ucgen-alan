import java.util.Scanner;
public class UcgenAlanHesabi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double a,b,c,cevre,alan, u;
        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenar uzunluklarını giriniz. Lütfen girdiğiniz değerlerin bir üçgen oluşturup oluşturmadığına dikkat ediniz.");
        System.out.print("1. kenar uzunluğunu giriniz : ");
        a=sc.nextDouble();
        System.out.print("2. kenar uzunluğunu giriniz : ");
        b=sc.nextDouble();
        System.out.print("3. kenar uzunluğunu giriniz : ");
        c=sc.nextDouble();
        boolean ucgenSarti;
        // 1. ve 2. kenar toplamının 3. kenardan küçük olması şartı koşulur
        ucgenSarti=  (((a+b)>c) && ((a+c)>b) && ((b+c)>a));
        String ucgen = ucgenSarti ? "" : "Girdiğiniz değerler bir üçgen oluşturmamaktadır.";
        cevre=a+b+c;
        u=cevre/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(ucgen);
        System.out.println("Üçgeninizin alanı : " +alan);


    }

}

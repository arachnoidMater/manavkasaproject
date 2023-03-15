import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
        Scanner inp=new Scanner(System.in);

        System.out.print("Armut kaç kilo?:");
        armutKg=inp.nextDouble();
        System.out.print("Elma kaç kilo?:");
        elmaKg=inp.nextDouble();
        System.out.print("Domates kaç kilo?:");
        domatesKg=inp.nextDouble();
        System.out.print("Muz kaç kilo?:");
        muzKg=inp.nextDouble();
        System.out.print("Patlıcan kaç kilo?:");
        patlıcanKg=inp.nextDouble();

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.0;
        double toplam= ((armutKg*armut)+(elmaKg*elma)+(domatesKg*domates)+(muzKg*muz)+(patlıcanKg*patlıcan));
        System.out.println("Toplam tutar:"+toplam);


    }
}
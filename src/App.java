import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hosgeldiniz! Lutfen zeytin agac cinsi seciniz");
        System.out.println("Kara zeytin icin 1");
        System.out.println("Kima zeytin icin 2");
        System.out.println("Kivircik zeytin icin 3");

        Scanner scanner = new Scanner(System.in);
        int treeType = scanner.nextInt();

        switch (treeType) {
            case 1:
                // OperationDashboard(); burada seçim yapıcak bu seçime iç içe 2 switch kod okunabiliriğini azatabilir.
                ZeytinAgac x = new ZeytinAgac();
                System.out.println(x.YasiniGetir());
                break;
            case 2:

                break;
            case 3:

                break;

            default:
                System.out.println("Gecersiz secim. Programdan cikiliyor.");
                break;
        }

        scanner.close();
    }

    private static void OperationDashboard() {
        System.out.println("Ortalama kac kilo yag verdigini ogrenmek icin 1'e tiklayiniz.");
        System.out.println("Yag verimini etkileyen faktorleri ogrenmek icin 2'ye tiklayiniz.");
        System.out.println("Kilosunu girerek elde edeceginiz ortalama yagi ogrenmek icin 3'e tiklayiniz.");
        System.out.println("Cinslerini ogrenmek icin 4'e tiklayiniz.");
        System.out.println("Yagi satimindan elde edeceginiz kazanci hesaplamak icin 5'e tiklayiniz.");
    }
}
public class Main {
    public static void main(String[] args) {
        // if en temel ve en çok kullanılan şart bloğudur.
        // else şart bloğumuzun dışında bir durum varsa ne yapayım demektir.
        //karşılaştırma yaparken (==) kullanıyorum. Bu değer atama işlemidir. Bunlara operatörler denmektedir.

        int sayi = 24;

        if (sayi < 20) {
            System.out.println("sayi 20'den küçüktür");
        } else if (sayi == 20) {
            System.out.println("Sayi 20'ye eşittir");
        } else {
            System.out.println("Sayi 20 den büyüktür");
        }
    }
}
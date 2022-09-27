public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Yigit";
        String ogrenci2 = "Elif";
        String ogrenci3 = "Ada";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);


        System.out.println("-------------------------------------");


        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Yigit";
        ogrenciler[1] = "Elif";
        ogrenciler[2] = "Ada";
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-------------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        

    }
}
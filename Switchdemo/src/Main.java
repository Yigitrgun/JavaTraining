public class Main {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade){
            case "A":
                System.out.println("Mükemmel : geçtiniz");
                break;
            case "B":
                System.out.println("Çok iyi : geçtiniz");
                break;
            case "C":
                System.out.println("iyi : Geçtiniz");
                break;
            case "D":
                System.out.println("Fena değil : geçtiniz");
                break;
            case "F":
                System.out.println("Maalesef kaldınız");
                break;
            default:
            System.out.println("Geçersiz sayi girdiniz");

        }


    }
}
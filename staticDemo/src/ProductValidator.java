public class ProductValidator {

    static{
        System.out.println("Yapıcı blok çalıştı");
    }
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
// Bir metodu static yaptığımızda,direk içinde bulunduğu classın ismini yazarak çağırma işlemini yaparız.
}

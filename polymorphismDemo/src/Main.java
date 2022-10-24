public class Main {
    public static void main(String[] args) {
    // polymorphism çok biçimlilik demektir.

//        BaseLogger [] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        // Hepsi base logger'ın refaranslarını  tutuyorlar.
//        // Bu yaptığımız işleme polymırphism deniyor. Yani çok biçimlilik.
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();


    }
}
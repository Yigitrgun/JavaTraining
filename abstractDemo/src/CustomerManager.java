public class CustomerManager {

    BaseDatabaseManager databaseManager;
    // yani ben hangi veritabanının çalışmasını istersem bana onu çalıştırıcak.

    public  void getCustomers(){
        databaseManager.getData();
    }


}

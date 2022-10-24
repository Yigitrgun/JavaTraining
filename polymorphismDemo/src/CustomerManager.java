public class CustomerManager {
    private BaseLogger Logger;

    public CustomerManager(BaseLogger logger){
        this.Logger = logger;

    }
 public void Add (){
     System.out.println("Customer added");
     this.Logger.Log("Log mesajı");
 }

}

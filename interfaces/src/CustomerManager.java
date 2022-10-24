public class CustomerManager {
    private ICustomerDal customerDal;
    public  CustomerManager (ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    // Ben buraya direk şu şekilde bağlarsam geçmiş olsun
    // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
    // Bu yüzden yukarıdaki kodları yazıyorum ve buna main içerinde ben karar vericem diyorum. bu şekilde istediğimizi ekleyip değiştirebiliyoruz.
    public void add(){
        // iş kodları
        customerDal.Add();
    }
}

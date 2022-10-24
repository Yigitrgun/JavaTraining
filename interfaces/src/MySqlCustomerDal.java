public class   MySqlCustomerDal implements  ICustomerDal,IRepository {
    @Override
    public void Add() {
        System.out.println("My sql eklendi");
        //  Bir class birden fazla interface'i implements edebilir.
        //Ancak sadece bir class'ı  1  kere extends edebiliriz
    }
}

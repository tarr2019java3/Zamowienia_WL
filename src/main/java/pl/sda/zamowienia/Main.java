package pl.sda.zamowienia;

public class Main {
    public static void main(String[] args) throws NameProductException, AgeConsumerException, EmailException {

        Consumer consumer = new Consumer();
        consumer.setName("JAN");
        consumer.setSurname("NOWAK");
        consumer.setAge(28);
        consumer.setEmail("nowak@wp.pl");

        Product product1= new Product();
        product1.setCategory("TELEWIZORY");
        product1.setName("SAMSUNG LED50");
        product1.setPrice(2899.99);

        

        System.out.println(product1.getName());

    }
}


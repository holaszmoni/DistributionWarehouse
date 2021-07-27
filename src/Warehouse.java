import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    public static void main(String[] args) {
        List<String> fruitslist = new ArrayList<>();
        fruitslist.add("Apples");
        fruitslist.add("Peaches");
        fruitslist.add("Oranges");
        System.out.println("List of all fruits: " + fruitslist);

        List<String> fruitsunit = new ArrayList<>();
        fruitsunit.add("kg");
        fruitsunit.add("box");
        fruitsunit.add("bag (2.5kg)");
        System.out.println("List off all measurable units: " + fruitsunit);

        List<String>vegetableslist = new ArrayList<>();
        vegetableslist.add("Potatoes");
        vegetableslist.add("Onions");
        System.out.println("List of all vegetables: " + vegetableslist);

        List<String>otherlist = new ArrayList<>();
        otherlist.add("Crakers");
        System.out.println("List of all others products: " + otherlist);

        Product product = new Product();
        Fruits fruits = new Fruits();
        Vegetables vegetables = new Vegetables();
        Other other = new Other();
        Fruits.Apple apple = new Fruits.Apple();


        product.setProductName("Apples");
//        product.setMeasurableUnit("kg");
        product.setPrice(6);
        product.setEntryDate(LocalDate.now());
        product.setExpirationDate(LocalDate.now().plusMonths(3));
        product.setWeight(10);
        System.out.println(product.toString());
//        System.out.println(product.getProductName() + product.getMeasurableUnit() + product.getPrice() + product.getEntryDate() + product.getExpirationDate());

        fruits.setProducer("Fresh");
        fruits.setNutritionalQuality("healthy");
        fruits.setEntryDate(LocalDate.now());
        fruits.setExpirationDate(LocalDate.now().plusMonths(5));
        fruits.setPrice(13);
//        fruits.setMeasurableUnit("Bag(2.5kg)");
        fruits.setProductName("Oranges");
        System.out.println(fruits.toString());
//        System.out.println(fruits.getProductName() + fruits.getMeasurableUnit() + fruits.getPrice() + fruits.getEntryDate() + fruits.getExpirationDate() + fruits.getProducer() + fruits.getNutritionalQuality());

        vegetables.setNutritionalQuality("Energic");
        vegetables.setProducer("Best");
        vegetables.setEntryDate(LocalDate.now());
//        vegetables.setMeasurableUnit("Bag(4kg)");
        vegetables.setPrice(2.5f);
        vegetables.setProductName("Onions");
        vegetables.setExpirationDate(LocalDate.now().plusMonths(7));
//        System.out.println(vegetables.getProductName() + vegetables.getMeasurableUnit() + vegetables.getPrice() + vegetables.getEntryDate() + vegetables.getExpirationDate() + vegetables.getProducer() + vegetables.getNutritionalQuality());


        other.setProductName("Crackers");
//        other.setMeasurableUnit("Pack");
        other.setPrice(2);
        other.setEntryDate(LocalDate.now());
        other.setExpirationDate(LocalDate.now().plusMonths(10));
//        System.out.println(other.getProductName() + other.getMeasurableUnit() + other.getPrice() + other.getEntryDate() + other.getExpirationDate());

    }
}

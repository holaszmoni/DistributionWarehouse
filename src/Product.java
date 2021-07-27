import java.time.LocalDate;
public class Product {
    private String productName;
    private float Price;
    private LocalDate entryDate;
    private LocalDate expirationDate;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return Price;
    }

//    public String getMeasurableUnit() {
//        return measurableUnit;
//    }
//
//    public void setMeasurableUnit(String measurableUnit) {
//        this.measurableUnit = measurableUnit;
//    }

    public void setPrice(float price) {
        Price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", Price=" + Price +
                ", entryDate=" + entryDate +
                ", expirationDate=" + expirationDate +
                ", weight=" + weight +
                '}';
    }

    private enum measurableUnit {
        kg, bag, box, pack
    }
}

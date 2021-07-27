import java.util.ArrayList;
import java.util.List;

public class Fruits extends Product {
    private String nutritionalQuality;
    private String producer;

 public static class Apple extends Fruits {


  }


    public String getNutritionalQuality() {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(String nutritionalQuality) {
        this.nutritionalQuality = nutritionalQuality;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "nutritionalQuality='" + nutritionalQuality + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}


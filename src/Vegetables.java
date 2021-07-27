public class Vegetables extends Product {
    private String nutritionalQuality;
    private String producer;

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
        return "Vegetables{" +
                "nutritionalQuality='" + nutritionalQuality + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}

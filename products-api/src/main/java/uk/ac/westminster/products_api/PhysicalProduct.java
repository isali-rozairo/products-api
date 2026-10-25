package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private Double weightKG;
    private String dimensions;


    public PhysicalProduct() {

    }

    public PhysicalProduct(Long id, String name, Double price, Double weightKG, String dimensions) {
        super(id, name, price);

        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    public Double getweightKG() {
        return getweightKG();
    }

    public String getDimensions() {
        return getDimensions();
    }
}

package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private Double fileSizeMB;

    public DigitalProduct() {

    }

    public DigitalProduct(String downloadUrl, Double fileSizeMB, Long id, String name, Double price) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}

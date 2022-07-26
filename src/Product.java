public class Product {
    String name;
    long price;

    String brand;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

   public Product(long price, String brand){
        this.price = price;
        this.brand = brand;
   }

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + (price / 100.0 ) + " RON " +
                ", brand=" + brand +
                '}';
    }
}

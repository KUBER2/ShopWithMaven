package entity;

public class Product {

    private long id;
    private int productCount;
    private String productName,color;
    private float price,weight;

    public Product(long id,int productCount, String productName, String color, float price,float weight){
        this.id=id;
        this.productCount=productCount;
        this.productName=productName;
        this.color=color;
        this.price=price;
        this.weight=weight;
    }
    public Product(Long id, String productName, Float price, Float weight, String color, Integer productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount=productCount;
    }


    public void setId(long id){
        this.id=id;
    }

    public void setClor(String clor) {
        this.color = clor;
    }

    public void setProductCount(int productCount){
        this.productCount=productCount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public Long getId() {
        return (Long) id;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    public String getProductName() {
        return productName;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
    public String toStringDao() {
        return  id +"#" + productName + "#" + price + ", weight=" + weight +"#" + color +  "#" + productCount;
    }

    public Product (String lineFromFile){

        String[] productDataArray = lineFromFile.split("#");

        long id = Long.parseLong(productDataArray[0]);
        this.id = Integer.parseInt(productDataArray[5]);
        this.productName = productDataArray[1];
        this.color = productDataArray[4];
        this.weight = Float.parseFloat(productDataArray[3]);
        this.price = Float.parseFloat(productDataArray[2]);
        /*
        int productCount = Integer.parseInt(productDataArray[5]);
        String productName = productDataArray[1];
        String color = productDataArray[4];
        float weight = Float.parseFloat(productDataArray[3]);
        float price = Float.parseFloat(productDataArray[2]);
        final Product product = new Product(id, productCount, productName, color, price, weight);  return product;
        */
    }

}

package entity;

public class Cloth extends Product {

    private String size,material;

    public Cloth(long id,int productCount, String productName, String color, float price,float weight,String size, String material){
        super(id,productCount,productName,color,price,weight);
        this.material=material;
        this.size = size;
    }
    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productCount, productName, color, price, weight);
        this.size = size;
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
    @Override
    public String toString() {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }


}

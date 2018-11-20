package entity;

public class Boots extends Product {

    private int size;
    private boolean isNaturalSkin;

    public Boots(long id,int productCount, String productName, String color, float price,float weight, int size, boolean isNatural){
        super(id,productCount,productName,color,price,weight);
        this.size=size;
        this.isNaturalSkin=isNatural;
    }
    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, Integer size, boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public void setNatural(boolean natural) {
        isNaturalSkin = natural;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }


    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}

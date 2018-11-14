package pl.jakubrola;

public class Boots extends Product {

    private int size;
    private boolean isNatural;

    public Boots(long id,int productCount, String productName, String color, float price,float weight, int size, boolean isNatural){
        super(id,productCount,productName,color,price,weight);
        this.size=size;
        this.isNatural=isNatural;
    }

    public void setNatural(boolean natural) {
        isNatural = natural;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isNatural() {
        return isNatural;
    }

    public int getSize() {
        return size;
    }
    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNatural +
                '}';
    }
}

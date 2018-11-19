package entity;

import java.util.LinkedList;

public class ProductsList<P> extends LinkedList<Product> {

    public int returnProductIndexById (long Id)
    {
        for(int i=0;i<this.size();i++){
            if(this.get(i).getId()==Id)
                return i;

        }
        return -1;
    }
    public int returnProductIndexByName (String name)
    {
        for(int i=0;i<this.size();i++){
            if(this.get(i).getProductName()==name)
                return i;

        }
        return -1;
    }
}

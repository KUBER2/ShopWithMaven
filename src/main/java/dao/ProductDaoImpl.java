package dao;

import api.ProductDao;
import entity.Product;
import entity.ProductsList;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private String fileName;

    public ProductDaoImpl(String fileName){
        this.fileName=fileName;
    }


    public void saveProduct(Product product) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.write(product.toStringDao()+"\n");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveProducts(List<Product> products) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for(Product product:products){
                printWriter.write(product.toStringDao()+"\n");
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void removeProductById(long id) {
        ProductsList<Product> listFromFile = (ProductsList<Product>) this.getAllProducts();
        Product productToRemove = this.getProductById(id);
        listFromFile.remove(productToRemove);
        this.saveProducts(listFromFile);
        /*try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                listFromFile.add(new Product(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();
            int indexOfProduct = listFromFile.returnProductIndexById(id);
            if(indexOfProduct>=0)
                listFromFile.remove(indexOfProduct);
            else
                System.out.println("There is not a product with id: "+id+" in file: "+this.fileName);
            PrintWriter printWriter = new PrintWriter(fileName);
            for(Product pr:listFromFile){
                printWriter.write(pr.toStringDao());
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


    }

    public void removeProductByName(String productName) {
        ProductsList<Product> listFromFile = new ProductsList<Product>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                listFromFile.add(new Product(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();
            int indexOfProduct = listFromFile.returnProductIndexByName(productName);
            if(indexOfProduct>=0)
                listFromFile.remove(indexOfProduct);
            else
                System.out.println("There is not a product with name: "+productName+" in file: "+this.fileName);
            PrintWriter printWriter = new PrintWriter(fileName);
            for(Product pr:listFromFile){
                printWriter.write(pr.toStringDao());
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public final Product getProductById(long id) {

        ProductsList<Product> listFromFile = new ProductsList<Product>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                listFromFile.add(new Product(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int indexOfProduct = listFromFile.returnProductIndexById(id);
        if(indexOfProduct>=0)
            return listFromFile.get(indexOfProduct);
        else {
            System.out.println("There is not a product with id: " + id + " in file: " + this.fileName);
            return null;
        }


    }

    public Product getProductByName(String productName) {
        ProductsList<Product> listFromFile = new ProductsList<Product>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                listFromFile.add(new Product(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int indexOfProduct = listFromFile.returnProductIndexByName(productName);
        if(indexOfProduct>=0)
            return listFromFile.get(indexOfProduct);
        else {
            System.out.println("There is not a product with name: " + productName + " in file: " + this.fileName);
            return null;
        }
    }

    public List<Product> getAllProducts() {
        LinkedList<Product> listFromFile = new LinkedList<Product>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String readOneLineFromFile = reader.readLine();
            while(readOneLineFromFile!=null){
                listFromFile.add(new Product(readOneLineFromFile));
                readOneLineFromFile = reader.readLine();
            }
            reader.close();
            return listFromFile;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package abstractfactory.Products;

import abstractfactory.AbstractProductB;

/**
 * Created by bircumaxim on 11/14/2016.
 */

public class ProductB1 extends AbstractProductB {
    public ProductB1(String arg){
        System.out.println("Hello "+arg);
    }
}

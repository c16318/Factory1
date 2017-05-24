
package sushi;
import framework.*;

public class Sushimaker extends Maker {
    protected Product createProduct(String name){
        return new Sushi(name);
    }
}

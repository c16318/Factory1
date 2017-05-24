
package framework;

/**
 *
 * @author matsu
 */
public abstract class Maker {
    public final Product create(String name){
        Product p = createProduct(name);
        return p;
    }
    
    protected abstract Product createProduct(String name);
}

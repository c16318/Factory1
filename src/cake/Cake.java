
package cake;
import framework.*;

public class Cake extends Product{
    private String name;
    
    Cake(String name){
        System.out.println(name + "のケーキを作ります");
        this.name = name;
    }
    
    public void eat(){
        System.out.println(name + "のケーキを食べます。");
    }
}

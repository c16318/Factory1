
package sushi;
import framework.*;


public class Sushi extends Product{
    private String name;
    Sushi(String name){
        System.out.println(name + "の寿司を作ります。");
        this.name = name;
    }
    
    public void eat(){
        System.out.println(name + "の寿司を食べます。");
    }
}

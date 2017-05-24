

import framework.*;
import sushi.*;
import cake.*;

public class Main {
    public static void main(String [] args){
        Maker sushimaker = new Sushimaker();
        Maker cakemaker = new Cakemaker();
        
        Product sushi1 = sushimaker.create("まぐろ");
        Product sushi2 = sushimaker.create("いくら");
        Product cake1  = cakemaker.create("チョコケーキ");
        Product cake2  = cakemaker.create("チーズケーキ");
        
        sushi1.eat();
        sushi2.eat();
        cake1.eat();
        cake2.eat();
        
    }
}

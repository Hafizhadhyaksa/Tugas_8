package Exception;
import java.util.*;

public class Titan extends Character{

    public boolean attack(){
        if (random() > 0 && random() <= 40){
            return true;
        }else {
            return false;
        }
    }

    public int random(){
        Random r = new Random();
        int batas = 100;
        int random;
        return random = r.nextInt(batas);
    }

    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

}

package Exception;
import java.util.*;

public class Magician extends Character{

    public boolean attack(){
        if (random() > 0 && random() <= 35){
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

    Magician (){
        setHP(100);
        setAttack(60);
        setDefense(10);
    }

}
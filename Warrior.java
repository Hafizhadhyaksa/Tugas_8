package Exception;
import java.util.*;

public class Warrior extends Character{

    public boolean attack(){
        if (random() > 0 && random() <= 60){
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

    Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

}

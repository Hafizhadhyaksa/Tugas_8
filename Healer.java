package Exception;
import java.util.*;

public class Healer extends Character{

    public boolean attack() {
        if (random() > 0 && random() <= 85) {
            return true;
        } else {
            return false;
        }
    }

    public int random(){
        Random r = new Random();
        int batas = 100;
        int random;
        return random = r.nextInt(batas);
    }

    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }
    public void heal(){
        setHP(getHP() + 25);
    }

    }

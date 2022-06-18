package Exception;

abstract class Character{
    private int HP;
    private int attack;
    private int defense;

    public abstract boolean attack();
//GETTER
    public int getHP() {
        return HP;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttack() {
        return attack;
    }

//SETTER
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    public void info(){
        System.out.println("HP\t\t\t: " + getHP());
        System.out.println("Attack\t\t: " + getAttack());
        System.out.println("Defense\t\t: " + getDefense());
    }
    public void receiveDamage(int damage){
        setHP(HP - (damage - getDefense()));
        if (HP <= 0){
            setHP(0);
            }

        }

    }



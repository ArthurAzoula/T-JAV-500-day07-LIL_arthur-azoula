public abstract class Character implements Movable, Comparable<Character> {

    protected final String RPGClass;
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;
    protected int capacity = 0;

    protected Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }

    public int compareTo(Character character) {
        if (this instanceof Mage && character instanceof Warrior) {
            if(this.capacity * this.capacity < character.capacity) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.capacity < character.capacity) {
            return -1;
        }
        else if (this.capacity > character.capacity) {
            return 1;
        }
        return 0;
    }
}

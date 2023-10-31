import java.util.ArrayList;
import java.util.List;

public class Battalion {

    private List<Character> characters;

    public Battalion() {
        characters = new ArrayList<>();
    }

    public void add(List<? extends Character> characters) {
        this.characters.addAll(characters);
    }

    public void display() {
        for (Character character : characters) {
            System.out.println((character.getName()));
        }
    }

    public boolean fight() {
        if (this.characters.size() < 2 ) {
            return false;
        }

        Character first = this.characters.get(0);
        Character second = this.characters.get(1);

        int compare = first.compareTo(second);

        if (compare > 0) {
            this.characters.remove(second);
        } else if (compare < 0) {
            this.characters.remove(first);
        } else {
            this.characters.remove(first);
            this.characters.remove(second);
        }

        return true;
    }


}

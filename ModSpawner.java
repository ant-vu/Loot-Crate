import java.util.Random;

public class ModSpawner implements ModInterface {

    public String getMod() {
        int r = new Random().nextInt(3);
        if(r == 0) {
            return new Dexterity().getMod();
        }
        else if(r == 1) {
            return new Intelligence().getMod();
        }
        return new Strength().getMod();
    }

}

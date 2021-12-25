import java.util.Random;

public class BossRaritySpawner implements RarityInterface {

    public String getRarity(){
        double r = new Random().nextDouble();
        if(r < 0.1) {
            return new Common().getRarity();
        }
        else if(r < 0.3) {
            return new Uncommon().getRarity();
        }
        else if(r < 0.6) {
            return new Rare().getRarity();
        }
        return new Epic().getRarity();
    }

}

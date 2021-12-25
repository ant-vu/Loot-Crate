import java.util.Random;

public class NormalRaritySpawner implements RarityInterface {

    public String getRarity(){
        double r = new Random().nextDouble();
        if(r < 0.4) {
            return new Common().getRarity();
        }
        else if(r < 0.7) {
            return new Uncommon().getRarity();
        }
        else if(r < 0.9) {
            return new Rare().getRarity();
        }
        return new Epic().getRarity();
    }

}

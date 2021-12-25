import java.util.Random;

public class SlotSpawner implements SlotInterface {

    public String getSlot(){
        int r = new Random().nextInt(4);
        if(r == 0) {
            return new Boots().getSlot();
        }
        else if(r == 1) {
            return new ChestPiece().getSlot();
        }
        else if(r == 2) {
            return new Gloves().getSlot();
        }
        return new Helm().getSlot();
    }

}

public class NormalArmour extends Armour {

    public NormalArmour() {
        this.rarity = new Rarity("Normal");
        this.slot = new Slot();
        this.mod = new Mod(rarity.getRarity());
    }

    public String getDescription() {
        return rarity.getRarity() + " " + slot.getSlot() + ":\n" + mod.getMod();
    }

}

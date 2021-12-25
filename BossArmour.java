public class BossArmour extends Armour {

    public BossArmour() {
        this.rarity = new Rarity("Boss");
        this.slot = new Slot();
        this.mod = new Mod(rarity.getRarity());
    }

    public String getDescription() {
        return rarity.getRarity() + " " + slot.getSlot() + ":\n" + mod.getMod();
    }

}

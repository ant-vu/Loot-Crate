public class Mod {

    private String mod1;
    private String mod2;
    private String mod3;

    public Mod(String rarity) {
        ModSpawner modSpawner = new ModSpawner();
        if (rarity.equals("Uncommon")) {
            mod1 = modSpawner.getMod();
        }
        else if (rarity.equals("Rare")) {
            mod1 = modSpawner.getMod();
            mod2 = modSpawner.getMod();
        }
        else if (rarity.equals("Epic")) {
            mod1 = modSpawner.getMod();
            mod2 = modSpawner.getMod();
            mod3 = modSpawner.getMod();
        }
    }

    public String getMod() {
        String mod = "";
        if (mod1 != null) {
            mod = mod + mod1 + "\n";
        }
        if (mod2 != null) {
            mod = mod + mod2 + "\n";
        }
        if (mod3 != null) {
            mod = mod + mod3 + "\n";
        }
        return mod;
    }

}

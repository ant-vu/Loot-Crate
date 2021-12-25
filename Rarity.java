public class Rarity {

    private String rarity;

    Rarity(String enemy){
        if (enemy.equals("Normal")){
            this.rarity = new NormalRaritySpawner().getRarity();
        }
        else if (enemy.equals("Boss")){
            this.rarity = new BossRaritySpawner().getRarity();
        }
    }

    public String getRarity(){
        return rarity;
    }

}

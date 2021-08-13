package ww222ag_assign3.exercise7;

public class NorseGods {

    private  String name;
    private  String race;
    private  String desc;

    public NorseGods(){

    }

    public NorseGods(String name, String race, String desc){
        this.name = name;
        this.race = race;
        this.desc = desc;
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  String getRace() {
        return race;
    }

    public  void setRace(String race) {
        this.race = race;
    }

    public  String getDesc() {
        return desc;
    }

    public  void setDesc(String desc) {
        this.desc = desc;
    }   @Override

    public String toString() {

        return name;

    }
}

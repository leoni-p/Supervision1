package uk.ac.cam.lxp20.supo2.NinjaEmployee;

public class Ninja {
    private String name;
    int skillLevel;

    public Ninja(String name) {
        this.name = name;
        skillLevel = 0;
    }

    String getName () {
        return name;
    }

    int getSkillLevel() {
        return skillLevel;
    }

    void increaseSkillLevel() {
        skillLevel++;
    }

    void doNinjaThings () {
        System.out.println("I'm a ninja");
        skillLevel ++;
    }


}

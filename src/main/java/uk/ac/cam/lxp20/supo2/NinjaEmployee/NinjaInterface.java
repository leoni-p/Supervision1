package uk.ac.cam.lxp20.supo2.NinjaEmployee;

public interface NinjaInterface {
    Ninja constructNinja(String name);

    int getSkillLevel();

    void doNinjaThings();

    String getName();
}

package uk.ac.cam.lxp20.supo2.NinjaEmployee;

public class NinjaEmployee extends Employee implements NinjaInterface {
    Ninja ninja;

    public Ninja constructNinja(String name) {
        return new Ninja(name);
    }

    NinjaEmployee(String name) {
        super(name);
        ninja = constructNinja(name);
    }

    public int getSkillLevel() {
        return ninja.getSkillLevel();
    }

    public void doNinjaThings() {
        ninja.doNinjaThings();
    }

    public void doNinjaEmployeeThings() {
        System.out.println("I'm a ninja employee");
        salary ++;
        ninja.increaseSkillLevel();
    }

    public String getName() {
        return super.getName();
    }


}

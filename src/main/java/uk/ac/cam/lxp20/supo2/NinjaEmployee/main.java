package uk.ac.cam.lxp20.supo2.NinjaEmployee;

public class main {

    public static void main(String[] args) {
        NinjaEmployee n = new NinjaEmployee("NAME");
        NinjaEmployee b = new NinjaEmployee("new");
        System.out.println(n.getSalary());
        System.out.println(n.getSkillLevel());

        n.doEmployeeThings();
        n.doNinjaThings();
        n.doNinjaEmployeeThings();

        System.out.println(n.getSalary());
        System.out.println(n.getSkillLevel());
        System.out.println(b.getSalary());
        System.out.println(b.getSkillLevel());

        System.out.println(n.getName());
        System.out.println(b.getName());


    }
}

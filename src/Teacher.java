public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print() {
        System.out.println("Teacher name:\t" + this.name);
        System.out.println("Branch:\t" + this.branch);
        System.out.println("Mobile Phone:\t" + this.mpno);
    }
}

package Class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] s = new Student[2];
        s[0] = student1;
        s[1] = student2;

        System.out.println("이름:" + s[0].name + " 나이:" + s[0].age + " 성적:" + s[0].grade);
        System.out.println("이름:" + s[1].name + " 나이:" + s[1].age + " 성적:" + s[1].grade);

    }
}

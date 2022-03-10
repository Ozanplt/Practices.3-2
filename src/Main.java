public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("XXX","Ali","Veli",123456);
        Instructor instructor2 = new Instructor("YYY","Duty","Free",78901);
        Student student1 = new Student("ZZZ","Ozan","Polat",172391);

        InstructorManager instructorManager = new InstructorManager();

        StudentManager studentManager = new StudentManager();
        //operations
        studentManager.add(student1);
        instructorManager.login(instructor1);
        instructorManager.delete(instructor2);

    }
}

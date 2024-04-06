package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {

        Scanner readStr = new Scanner(System.in);
        Scanner readInt = new Scanner(System.in);
        ArrayList<Student> notes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.print("Num : ");
            s.num = readInt.nextInt();
            System.out.print("Full Name : ");
            s.fullName = readStr.nextLine();
            System.out.print("Point : ");
            s.point = readInt.nextInt();

            System.out.println(); // space

            notes.add(s);
        }

        allStudents(notes);
        aveOfNotes(notes);

        // 2. Version
        int ave2 = aveOfNotes2(notes);
        System.out.print("Average of the Points : " + ave2);

    }

    public static void allStudents(ArrayList<Student> notes) {
        for (Student s : notes)
            System.out.println(s.num + " " + s.fullName + " " + s.point);
    }

    public static void aveOfNotes(ArrayList<Student> notes) {
        int sum = 0;
        for (Student s : notes)
            sum = sum + s.point;

        int ave = sum / notes.size();
        System.out.println("Average of the Points : " + ave);
    }


    // 2. Version
    public static int aveOfNotes2(ArrayList<Student> notes) {
        int sum = 0;
        for (Student s : notes)
            sum = sum + s.point;

        int ave = sum / notes.size();
        return ave;
    }

}

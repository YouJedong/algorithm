import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Student[] students = new Student[count];
        
        for (int i = 0; i < count; i++) {
            String[] score = br.readLine().split(" ");
            students[i] = new Student(
                score[0],
                Integer.parseInt(score[1]),
                Integer.parseInt(score[2]),
                Integer.parseInt(score[3]));    
        }
        Comparator<Student> stuComparator = new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                if(o1.kor < o2.kor) {
                    return 1;
                } else if(o1.kor == o2.kor) {
                    if(o1.eng > o2.eng) {
                        return 1;
                    } else if(o1.eng == o2.eng) {
                        if(o1.mat < o2.mat) {
                            return 1;
                        } else if(o1.mat == o2.mat) {
                            return o1.name.compareTo(o2.name);
                        }
                    }
                }
                return -1;
            }
        };
        Arrays.sort(students, stuComparator);
        for (int i = 0; i < count; i++) {
            bw.write(students[i].name + "\n");
        };
        br.close();
        bw.flush();
        
    }
}
class Student {
    String name;
    int kor;
    int eng;
    int mat;

    Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
}
package org.example.chapter06;

// 학생 관리 시스템

import java.sql.SQLOutput;
import java.util.ArrayList;

// 1. 학생 클래스 정의
// : 학생 정보 저장, 관련 메서드 제공
class Student {
    // === 필드 === //
    int studentId;
    String name;
    int age;
    String major;
    double gpa;

    // === 메서드 === //
    void printStudentInfo() {
        System.out.println("ID " + studentId
        + ", Name " + name
        + ", Age " + age
        + ", Major " + major
        + ", GPA " + gpa
        );
    }
    void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }
    // === 생성자 === //
    Student() {
        // 필드값 초기화
        this.studentId = 0;
        this.name = "Unknown";
        this.age = 20;
        this.major = "Undeclared";
        this.gpa = 0.0;
    }

    Student(int studentId, String name, int age, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

    Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

}

// 2. 학생 관리 시스템 클래스 정의
// : 메인 클래스(실행)
// : 학생 등록, 조회, 수정 기능 담당

public class StudentManagementApp {

    // cf) 자바의 클래스명은 파일명과 동일 (대소문자까지)
    //      : 하나의 파일에서 public 단위의 클래스는 한 개만 지정 가능
    //      >> public class 클래스명은 파일명과 일치

    // cf) static
    //      : 인스턴스화 없이 클래스 자체에서 직접 호출
    //      - 메인 메서드 내부에서 다른 메서드 호출 시 반드시 해당 메서드는 static 이어야 한다

    static ArrayList<Student> students = new ArrayList<>();

    // 학생 등록
    static void addStudent(int id, String name, int age, String major, double gpa) {
        Student student = new Student(id, name, age, major, gpa);
        students.add(student);
        System.out.println(name + "학생이 등록되었습니다.");
    }

    // 학생 조회 (전체)
    static void printAllStudents() {
        System.out.println("== 전체 학생 목록==");
        // for (순회하는 요소의 변수 선언: 배열리스트) {}
        for (Student student : students) {
            student.printStudentInfo();
        }
    }

    // 학생 검색: 학생 ID를 통해 해당 학생의 정보를 출력
    static void findStudentById(int studentId) {
        for (Student student : students) {
            if (student.studentId == studentId) {
                student.printStudentInfo();
                return; // 메서드 종료
            }
        }

        System.out.println(studentId + "해당 ID의 학생을 찾을 수 없습니다.");
    }

    // 평균 학점 업데이트: 학생 ID를 사용하여 해당 학생의 학점을 업데이트
    static void updateStudentGpa(int studentId, double newGpa) {
        for (Student student : students) {
            if (student.studentId == studentId) {
                student.updateGpa(newGpa);
                System.out.println("학점이 업데이트 되었습니다.");
                return;
            }
        }

        System.out.println(studentId + "해당 ID의 학생을 찾을 수 없습니다.");
    }

    // main 메서드
    // : 프로그램 진입점을 제공
    // >> public static void main(String[] args) {} 형석이어야만 실행 가능
    // >> JVM은 Main 메서드가 없을 경우 해당 파일을 실행 X

    public static void main(String[] args) {

        addStudent(1, "김보민", 20, "Iot", 3.8);
        addStudent(2, "박진영", 21, "Iot", 3.9);
        addStudent(3, "오신혁", 22, "Iot", 3.7);
        addStudent(4, "김세훈", 23, "Iot", 3.8);

        // 학생 전체 조회
        printAllStudents();

        // 학생 조회 (단건)
        System.out.println("== 학생 조회 (단건) ");
        findStudentById(2);
        findStudentById(3);

        // 학생 평점 업데이트
        updateStudentGpa(2, 4.1);
        updateStudentGpa(4, 4.5);

        findStudentById(2);
        findStudentById(4);
    }
}

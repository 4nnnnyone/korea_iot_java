package org.example.chapter12;

/*
*  == 학생 관리 시스템 ==
* : MVC 패턴 적용 + DTO(데이터 처리)
* - 학생 데이터에 대한 CRUD 기능
*
* 1. 요구 사항 정의
* 1) 학생 추가 기능
* 2) 학생 전체 조회 기능 - 전체 조회
* 3) 특정 학생 조회 기능 - 단건 조회
* 4) 학생 수정 기능
* 5) 학생 삭제 기능
* 6) 프로그램 종료
*
* 2. MVC 패턴의 구성 요소
* 1) Model(Student)
* @Field
*   name(이름), age(나이), StudentNumber(학번), StudentId(고유 번호), createdAt(생성일)
* @Method
*   getter/setter, toString
*
* 2) View(StudentView)
* : 사용자와 상호작용할 수 있는 메뉴를 표시
*       - 각 요청에 따라 controller 에게 요청값과 행위를 전달
*
* 3) Controller(StudentController)
* : 학생 데이터 저장 (List<Student>)
* +) 6가지 기능 수행
*
* DTO(StudentRequestDo 요청)
*
* */

import org.example.chapter12.controller.StudentController;
import org.example.chapter12.model.Student;
import org.example.chapter12.view.StudentView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> dummyStudents = new ArrayList<>();
        dummyStudents.add(new Student(1, "이승아", 25, "1111"));
        dummyStudents.add(new Student(1, "이승아", 25, "1111"));
        dummyStudents.add(new Student(1, "이승아", 25, "1111"));
        dummyStudents.add(new Student(1, "이승아", 25, "1111"));

        StudentController controller = new StudentController(dummyStudents);
        Scanner sc = new Scanner(System.in);

        StudentView view = new StudentView(sc, controller);
        view.showMenu();

    }
}

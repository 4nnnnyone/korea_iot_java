package org.example.chapter07;

// === 캡슐화(Encapsulation) === //
// : OOP 에서 데이터와 해당 데이터를 처리하는 함수(메서드)를 하나로 묶는 것을 의미
// - 객체 내부의 구현을 숨기고, 외부에서는 제공된 메서드를 통해서만 접근하도록 설정
// - 데이터 보호, 유지보수성 향상, 사용자 편의성 증대

// == getter & setter 메서드 == //
// : 캡슐화된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능
// +) 데이터의 무결성 유지와 정보 은닉

// cf) 데이터 보호 / 유지보수성 향상을 목적으로 데이터 필드(속성)를 private 선언
//      >> 데이터에 접근하거나 수정할 때는 getter & setter 메서드를 사용하는 체계

// 1) getter: 객체의 특정 필드값을 읽는 메서드
//      get<필드명>();
//      Ex) getName();, getAge();, getStudentId();

// 2) setter: 객체의 특정 필드값을 설정하는 메서드
//      set<필드명>();
//      Ex) setName(String name);, setAge(int age);, setStudentId(int studentId);

// == (예시) 학생 정보 관리 클래스 == //
class Student {
    // 1) 필드는 private 설정
    private String name;
    private int residentNumber;
    private int age;
    private int score;

    // getter: private 필드값을 읽어 반환
    public String getName() {
        return name;
    }

    public int getResidentNumber() {
        return residentNumber;
    }

    // cf) getter는 단순한 데이터의 반환 뿐만 아니라, 데이터 가공 역할을 담당하기도 함
    public String getAge() {
        if (age < 19) {
            return "성인";
        } else {
            return "미성년자";
        }
    }

    public int getScore() {
        return score;
    }

    // setter: 데이터를 받아 내부의 필드에 저장 (필드 타입의 매개 변수와 반환 타입 X)
    public void setName(String name) {
        this.name = name;
    }

    public void setResidentNumber(int ResidentNumber) {
        this.residentNumber = ResidentNumber;
    }

    // cf) setter: 단순한 데이터 설정 뿐만 아니라, 데이터의 검증 역할을 담당하기도 함
    public void setAge(int Age) {
        if (Age < 0) {
            System.out.println("유효하지 않은 나이입니다.");
        } else {
            this.age = Age;
        }
    }

    public void setScore(int Score) {
        if (Score >= 0 && score <= 100) {
            this.score = Score;
        } else {
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
}

public class B_Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();
        // student.name = "이승아"; - private 설정 (해당 클래스 외에서는 접근 불가)

        student.setName("이승아");
        student.setAge(-30); // 유효하지 않은 나이입니다.
        student.setAge(29);
        student.setResidentNumber(1234567);
        student.setScore(101); // 유효하지 않은 점수입니다.
        student.setScore(100);

        student.setResidentNumber(987654321);
        System.out.println(student.getResidentNumber()); // 987654321
        // >> final 키워드 (데이터의 불변성을 지키는 키워드)
    }
}

// cf) 언더스코어(_)와 하이픈(-)의 차이

// ctrl + 좌우 방향키: 단어별 이동
// ctrl + shift + 좌우 방향키: 단어별 드래그

// a_hello
// : 가독성을 위한 단어의 구분 (단어가 1개)

// a-hello
// : 각 단어의 구분 (단어가 여러 개)

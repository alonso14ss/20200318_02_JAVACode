package co.kr.tjoeun.helloworld.a20200318_02_javacode.datas;

public class User {

    private String name;
    private int birthYear;

//    alt+insert => getter and setter 선택
//    같은 방식으로 생성자도 가능


    public User(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}

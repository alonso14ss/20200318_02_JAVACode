package co.kr.tjoeun.helloworld.a20200318_02_javacode;

//액티비티가 아니라 자바 클래스로 만든 파일
//모든 액티비티가 공통으로 사용하는 기능들을 묶어두는 클래스
// 1) 이벤트 세팅 2) 초기값 세팅

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract void setupEvents();
    public abstract void setValues();

}

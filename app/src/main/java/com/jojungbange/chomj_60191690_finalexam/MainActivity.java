package com.jojungbange.chomj_60191690_finalexam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> finalList;
    TextView ext;

    BookFragment bookFragment;
    MovieFragment movieFragment;
    MusicFragment musicFragment;
    PersonFragment personFragment;

    //bookfragment 요소들 정의
    public static Boolean[] boolBook ={false,false,false,false,false};
    String[] Book = {"종이여자 [기욤뮈소]","달러구트 꿈 백화점 [이미예]","미 비포 유 [조조모예스]", "연금술사 [파울로 코엘료]","유리멘탈을 위한 심리책 [미즈시마 히로코]"};
    //moviefragment 요소들 정의
    public static Boolean[] boolMovie={false,false,false,false,false,false};
    String[] Movie = {"맘마미아!","위대한 쇼맨","겨울왕국2", "소울","인턴","이터널 선샤인"};
    //musicfragment 요소들 정의
    public static Boolean[] boolMusic={false,false,false,false,false,false,false};
    String[] Music = {"Superfantastic -페퍼톤스","unlucky -아이유","김밥 -더 자두", "Festival -엄정화","Thank you -페퍼톤스","Andante, Andante -ABBA","Blank Space -Taylor Swift"};
    //personfragment 요소들 정의
    public static Boolean[] boolPerson={false,false,false,false,false,false};
    String[] Person = {"박주영 교수님","페퍼톤스 이장원","유승연","황정민","유희열","조민정"};

    //각 fragment 요소들 배열화
    Boolean[][] finalBool = {boolBook,boolMovie,boolMusic,boolPerson};
    String[][] finalString = {Book,Movie,Music,Person};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My Favorite Things");

        //fagment 생성
        bookFragment = new BookFragment();
        movieFragment = new MovieFragment();
        musicFragment = new MusicFragment();
        personFragment = new PersonFragment();

        //button 연결
        Button btnBook = (Button) findViewById(R.id.btnBook);
        Button btnMovie = (Button) findViewById(R.id.btnMovie);
        Button btnMusic = (Button) findViewById(R.id.btnMusic);
        Button btnPerson = (Button) findViewById(R.id.btnPerson);
        Button btnResult = (Button) findViewById(R.id.btnResult);

        //선택한 모든 항목들을 담을 ArrayList정의
        ArrayList<String> finalList = new ArrayList<String>();

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment 화면 전환
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,bookFragment).commit();
                btnBook.setTypeface(null,Typeface.BOLD_ITALIC);
                btnMovie.setTypeface(null,Typeface.NORMAL);
                btnMusic.setTypeface(null,Typeface.NORMAL);
                btnPerson.setTypeface(null,Typeface.NORMAL);
            }
        });

        btnMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment 화면 전환
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,movieFragment).commit();
                btnBook.setTypeface(null,Typeface.NORMAL);
                btnMovie.setTypeface(null,Typeface.BOLD_ITALIC);
                btnMusic.setTypeface(null,Typeface.NORMAL);
                btnPerson.setTypeface(null,Typeface.NORMAL);
            }
        });

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment 화면 전환
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,musicFragment).commit();
                btnBook.setTypeface(null,Typeface.NORMAL);
                btnMovie.setTypeface(null,Typeface.NORMAL);
                btnMusic.setTypeface(null,Typeface.BOLD_ITALIC);
                btnPerson.setTypeface(null,Typeface.NORMAL);
            }
        });

        btnPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fragment 화면 전환
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,personFragment).commit();
                btnBook.setTypeface(null,Typeface.NORMAL);
                btnMovie.setTypeface(null,Typeface.NORMAL);
                btnMusic.setTypeface(null,Typeface.NORMAL);
                btnPerson.setTypeface(null,Typeface.BOLD_ITALIC);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //finalList를 초기화 한 후에 사용자가 선택한 모든 항목들을 add한다.
                finalList.clear();
                for(int i=0;i<4;i++){
                    for(int j=0;j<finalBool[i].length;j++){
                        if(finalBool[i][j]==true){
                            finalList.add(finalString[i][j]);
                        }
                    }
                }
                //intent를 통해서 사용자가 선택한 모든 항목들을 ResultActivity로 보낸다.
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("finalList",finalList);
                startActivity(intent);
            }
        });


    }


}
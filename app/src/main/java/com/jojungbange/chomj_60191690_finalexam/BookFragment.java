package com.jojungbange.chomj_60191690_finalexam;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolBook;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMusic;

public class BookFragment extends Fragment {
    public void onAttach(Context context) {
        super.onAttach(context);
        MainActivity mainActivity = (MainActivity)getActivity();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.book, container, false);

        LinearLayout book1 = (LinearLayout) v.findViewById(R.id.book1);
        LinearLayout book2 = (LinearLayout) v.findViewById(R.id.book2);
        LinearLayout book3 = (LinearLayout) v.findViewById(R.id.book3);
        LinearLayout book4 = (LinearLayout) v.findViewById(R.id.book4);
        LinearLayout book5 = (LinearLayout) v.findViewById(R.id.book5);

        LinearLayout[] linearBook = {book1,book2,book3,book4,book5};

        //사용자가 선택한 항목이라면 backgroudcolor를 회색으로 설정한다.
        for(int i = 0; i< boolBook.length; i++){
            if(boolBook[i]==true){
                linearBook[i].setBackgroundColor(Color.rgb(226,226,226));
            }
        }

        book1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                //사용자가 롱클릭 했을 때 선택이 돼있던 경우와 그렇지 않은 경우
                //선택이 돼있지 않은 경우는 선택을 하게 한다.
                if(boolBook[0]==false){
                    book1.setBackgroundColor(Color.rgb(226,226,226));
                    boolBook[0]=true;
                }else{
                    //선택이 돼있던 경우는 선택을 해제 한다.
                    book1.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolBook[0]=false;
                }
                return true;
            }
        });

        book2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolBook[1]==false){
                    book2.setBackgroundColor(Color.rgb(226,226,226));
                    boolBook[1]=true;
                }else{
                    book2.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolBook[1]=false;
                }
                return true;
            }
        });

        book3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolBook[2]==false){
                    book3.setBackgroundColor(Color.rgb(226,226,226));
                    boolBook[2]=true;
                }else{
                    book3.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolBook[2]=false;
                }
                return true;
            }
        });

        book4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolBook[3]==false){
                    book4.setBackgroundColor(Color.rgb(226,226,226));
                    boolBook[3]=true;
                }else{
                    book4.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolBook[3]=false;
                }
                return true;
            }
        });

        book5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolBook[4]==false){
                    book5.setBackgroundColor(Color.rgb(226,226,226));
                    boolBook[4]=true;
                }else{
                    book5.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolBook[4]=false;
                }
                return true;
            }
        });

        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

}

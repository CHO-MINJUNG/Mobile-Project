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
import androidx.fragment.app.Fragment;

import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolBook;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMusic;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMovie;

public class MovieFragment extends Fragment {
    public void onAttach(Context context) {
        super.onAttach(context);
        MainActivity mainActivity = (MainActivity)getActivity();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.movie, container, false);

        LinearLayout movie1 = (LinearLayout) v.findViewById(R.id.movie1);
        LinearLayout movie2 = (LinearLayout) v.findViewById(R.id.movie2);
        LinearLayout movie3 = (LinearLayout) v.findViewById(R.id.movie3);
        LinearLayout movie4 = (LinearLayout) v.findViewById(R.id.movie4);
        LinearLayout movie5 = (LinearLayout) v.findViewById(R.id.movie5);
        LinearLayout movie6 = (LinearLayout) v.findViewById(R.id.movie6);

        LinearLayout[] linearMovie = {movie1,movie2,movie3,movie4,movie5,movie6};

        for(int i = 0; i< boolMovie.length; i++){
            if(boolMovie[i]==true){
                linearMovie[i].setBackgroundColor(Color.rgb(226,226,226));
            }
        }

        movie1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[0]==false){
                    movie1.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[0]=true;
                }else{
                    movie1.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[0]=false;
                }
                return true;
            }
        });
        movie2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[1]==false){
                    movie2.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[1]=true;
                }else{
                    movie2.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[1]=false;
                }
                return true;
            }
        });
        movie3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[2]==false){
                    movie3.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[2]=true;
                }else{
                    movie3.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[2]=false;
                }
                return true;
            }
        });
        movie4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[3]==false){
                    movie4.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[3]=true;
                }else{
                    movie4.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[3]=false;
                }
                return true;
            }
        });
        movie5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[4]==false){
                    movie5.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[4]=true;
                }else{
                    movie5.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[4]=false;
                }
                return true;
            }
        });
        movie6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMovie[5]==false){
                    movie6.setBackgroundColor(Color.rgb(226,226,226));
                    boolMovie[5]=true;
                }else{
                    movie6.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMovie[5]=false;
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

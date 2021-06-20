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

import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMovie;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMusic;

public class MusicFragment extends Fragment {
    public void onAttach(Context context) {
        super.onAttach(context);
        MainActivity mainActivity = (MainActivity)getActivity();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.music, container, false);

        LinearLayout music1 = (LinearLayout) v.findViewById(R.id.music1);
        LinearLayout music2 = (LinearLayout) v.findViewById(R.id.music2);
        LinearLayout music3 = (LinearLayout) v.findViewById(R.id.music3);
        LinearLayout music4 = (LinearLayout) v.findViewById(R.id.music4);
        LinearLayout music5 = (LinearLayout) v.findViewById(R.id.music5);
        LinearLayout music6 = (LinearLayout) v.findViewById(R.id.music6);
        LinearLayout music7 = (LinearLayout) v.findViewById(R.id.music7);

        LinearLayout[] linearMusic = {music1,music2,music3,music4,music5,music6,music7};

        for(int i = 0; i< boolMusic.length; i++){
            if(boolMusic[i]==true){
                linearMusic[i].setBackgroundColor(Color.rgb(226,226,226));
            }
        }

        music1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[0]==false){
                    music1.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[0]=true;
                }else{
                    music1.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[0]=false;
                }
                return true;
            }
        });

        music2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[1]==false){
                    music2.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[1]=true;
                }else{
                    music2.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[1]=false;
                }
                return true;
            }
        });

        music3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[2]==false){
                    music3.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[2]=true;
                }else{
                    music3.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[2]=false;
                }
                return true;
            }
        });

        music4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[3]==false){
                    music4.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[3]=true;
                }else{
                    music4.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[3]=false;
                }
                return true;
            }
        });

        music5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[4]==false){
                    music5.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[4]=true;
                }else{
                    music5.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[4]=false;
                }
                return true;
            }
        });
        music6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[5]==false){
                    music6.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[5]=true;
                }else{
                    music6.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[5]=false;
                }
                return true;
            }
        });

        music7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolMusic[6]==false){
                    music7.setBackgroundColor(Color.rgb(226,226,226));
                    boolMusic[6]=true;
                }else{
                    music7.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolMusic[6]=false;
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

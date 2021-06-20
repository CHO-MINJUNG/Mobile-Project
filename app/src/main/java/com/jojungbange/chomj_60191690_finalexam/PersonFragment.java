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

import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMusic;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolMovie;
import static com.jojungbange.chomj_60191690_finalexam.MainActivity.boolPerson;

public class PersonFragment extends Fragment {
    public void onAttach(Context context) {
        super.onAttach(context);
        MainActivity mainActivity = (MainActivity)getActivity();
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.person, container, false);

        LinearLayout person1 = (LinearLayout) v.findViewById(R.id.person1);
        LinearLayout person2 = (LinearLayout) v.findViewById(R.id.person2);
        LinearLayout person3 = (LinearLayout) v.findViewById(R.id.person3);
        LinearLayout person4 = (LinearLayout) v.findViewById(R.id.person4);
        LinearLayout person5 = (LinearLayout) v.findViewById(R.id.person5);
        LinearLayout person6 = (LinearLayout) v.findViewById(R.id.person6);

        LinearLayout[] linearPerson = {person1,person2,person3,person4,person5,person6};

        for(int i = 0; i< boolPerson.length; i++){
            if(boolPerson[i]==true){
                linearPerson[i].setBackgroundColor(Color.rgb(226,226,226));
            }
        }

        person1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[0]==false){
                    person1.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[0]=true;
                }else{
                    person1.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[0]=false;
                }
                return true;
            }
        });
        person2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[1]==false){
                    person2.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[1]=true;
                }else{
                    person2.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[1]=false;
                }
                return true;
            }
        });
        person3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[2]==false){
                    person3.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[2]=true;
                }else{
                    person3.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[2]=false;
                }
                return true;
            }
        });
        person4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[3]==false){
                    person4.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[3]=true;
                }else{
                    person4.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[3]=false;
                }
                return true;
            }
        });
        person5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[4]==false){
                    person5.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[4]=true;
                }else{
                    person5.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[4]=false;
                }
                return true;
            }
        });
        person6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(boolPerson[5]==false){
                    person6.setBackgroundColor(Color.rgb(226,226,226));
                    boolPerson[5]=true;
                }else{
                    person6.setBackground(getResources().getDrawable(R.drawable.list_round));
                    boolPerson[5]=false;
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

package com.jojungbange.chomj_60191690_finalexam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ResultActivity extends Activity {
    Button menuB;
    ArrayList<String> finalList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        //MainActivity로부터 받은 finalList를 변수에 담아준다.
        Intent intent = getIntent();
        finalList = intent.getStringArrayListExtra("finalList");
        TextView noneText = (TextView) findViewById(R.id.noneText) ;

        //ContextMenu로 사용할 menu button을 연결한다
        menuB = (Button) findViewById(R.id.menuB);
        registerForContextMenu(menuB);

        //finalList를 ListView로 보여준다.
        final ArrayAdapter<String> adapter;
        ListView listView=(ListView) findViewById(R.id.listView);

        //finalList가 비어있다면 사용자가 어떤 항목도 선택하지 않았기 때문에 그에 맞는 textView를 띄운다
        if(finalList.isEmpty()){
            noneText.setText("우리는 겹치는 취향이 없네요 T.T");
        }
        else{
            //finalList가 비어있지 않다면 noneText를 초기화한 후 listView를 띄운다.
            noneText.setText("");
            adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1,finalList);
            listView.setAdapter(adapter);
        }


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflator = getMenuInflater();
        if(v==menuB){
            mInflator.inflate(R.menu.menu1,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btnReturn:
                finalList.clear();
                finish();
                return true;
            case R.id.btnFile:
                try{
                    String finalStr = "";
                    FileOutputStream outFs =  openFileOutput("file.txt", Context.MODE_APPEND);
                    for(int i=0;i<finalList.size();i++){
                        finalStr+=finalList.get(i);
                    }
                    outFs.write(finalStr.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), "file.txt에 저장되었습니다",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                }
                return true;
        }
        return false;
    }
}

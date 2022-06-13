package com.example.currentplacedetailsonmap;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity4 extends AppCompatActivity {

    private ListView listView;
    private String[] from = {"item1","item2","item3"};
    private int[] to = {R.id.name,R.id.address,R.id.phoneNo};
    private LinkedList<HashMap<String,String>> data =new LinkedList<>();
    private SimpleAdapter adapter;
    Intent intent ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        listView = findViewById(R.id.list);
        initListView();
        intent = new Intent(MainActivity4.this,MainActivity5.class);
    }
    private void initListView(){
        adapter = new SimpleAdapter(this,data,R.layout.list_item,from,to);
        listView.setAdapter(adapter);
    }


    public void add(View view) {
        HashMap<String,String> d2 = new HashMap<>();
        d2.put(from[0],"Test3" );
        d2.put(from[1],"Test2");
        d2.put(from[2],"Test");
        data.add(d2);
        adapter.notifyDataSetChanged();
        startActivity(intent);
    }

    public void del(View view) {
        if(data.size()>0){
            data.remove(0);
        }
        adapter.notifyDataSetChanged();
    }
}
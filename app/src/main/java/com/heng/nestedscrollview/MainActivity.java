package com.heng.nestedscrollview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private NestedScrollViewAdapter adapter;
    private List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView customTitle = findViewById(R.id.customTitle);
        customTitle.setText("马月儿子");
        RecyclerView rvNestedScrollView = findViewById(R.id.rvNestedScrollView);
        strings = InitData.getInstance().integerList();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rvNestedScrollView.setLayoutManager(manager);
        adapter = new NestedScrollViewAdapter();
        rvNestedScrollView.setAdapter(adapter);

    }


    class NestedScrollViewAdapter extends RecyclerView.Adapter<NestedScrollViewAdapter.MyHolder> {


        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.text_layout, viewGroup, false);
            MyHolder holder = new MyHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
            myHolder.textView.setText(strings.get(i));
        }

        @Override
        public int getItemCount() {
            return strings.size();
        }

        class MyHolder extends RecyclerView.ViewHolder {

            private final TextView textView;

            public MyHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.text);
            }
        }
    }


}

package com.mounacheikhna.animationplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import butterknife.Bind;
import butterknife.ButterKnife;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


  @Bind(R.id.playground_list) RecyclerView playgroundList;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);


    playgroundList.setAdapter(new PlaygroundAdapter());
  }



}

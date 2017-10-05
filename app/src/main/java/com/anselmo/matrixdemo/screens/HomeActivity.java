package com.anselmo.matrixdemo.screens;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.anselmo.matrixdemo.R;
import com.anselmo.matrixdemo.adapters.HomeAdapter;
import com.anselmo.matrixdemo.model.HomeItem;
import com.anselmo.matrixdemo.utils.Utils;

import java.util.ArrayList;

import java.util.List;

public class HomeActivity extends BaseActivity {
    private RecyclerView recycler;
    private List<HomeItem> itemsList;
    private HomeAdapter mAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = getToolbar();
        toolbar.setTitle(getString(R.string.app_name));

        //Init component
        recycler = (RecyclerView) findViewById(R.id.homeRecycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recycler.setHasFixedSize(true);
        recycler.setItemViewCacheSize(20);
        recycler.setDrawingCacheEnabled(true);
        recycler.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        //Init elements
        itemsList = new ArrayList<>();
        for( int i = 0; i < Utils.TITLES.length; i++ ) {
            itemsList.add( new HomeItem( getString(Utils.TITLES[i]) ) );
        }

        mAdapter = new HomeAdapter(this, itemsList);

        recycler.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }
}

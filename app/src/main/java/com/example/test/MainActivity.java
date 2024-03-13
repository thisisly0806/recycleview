package com.example.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import com.example.test.databinding.ActivityMainBinding;
import com.google.android.material.internal.NavigationSubMenu;

import java.util.ArrayList;

import adapters.NavigationRecyclerAdapter;
import model.Navigation;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //Khai báo adapter
    NavigationRecyclerAdapter adapter;
    //khai báo array list toàn cục
    ArrayList<Navigation> navigations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
    }


    private void loadData() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvShopee.setLayoutManager(layoutManager);
        binding.rvShopee.setHasFixedSize(true);

        navigations = new ArrayList<>();
        navigations.add(new Navigation("xu", "coin", R.drawable.hot, R.drawable.discount));
        navigations.add(new Navigation("xu", "coin", R.drawable.hot, R.drawable.fashion));
        navigations.add(new Navigation("xu", "coin", R.drawable.food, R.drawable.tech));
        navigations.add(new Navigation("xu", "coin", R.drawable.skin, R.drawable.hot));
        navigations.add(new Navigation("xu", "coin", R.drawable.hot, R.drawable.coin));
        navigations.add(new Navigation("xu", "coin", R.drawable.hot, R.drawable.discount));
        navigations.add(new Navigation("xu", "coin", R.drawable.live, R.drawable.discount));
        navigations.add(new Navigation("xu", "coin", R.drawable.techzone, R.drawable.outlet));
        navigations.add(new Navigation("xu", "coin", R.drawable.voucher, R.drawable.techzone));
        adapter = new NavigationRecyclerAdapter(getApplicationContext(), navigations);
        binding.rvShopee.setAdapter(adapter);

    }


}
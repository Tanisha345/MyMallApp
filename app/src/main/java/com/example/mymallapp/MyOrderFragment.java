package com.example.mymallapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyOrderFragment extends Fragment {


    public MyOrderFragment() {
        // Required empty public constructor
    }

    private RecyclerView myOrdersRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_order, container, false);

        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyOrderItemModel> myOrderItemModelList = new ArrayList<>();
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.product_image,2,"Pixel 2 XL(Black)"
        ,"Delivered on Mon 15th Jan 2020"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.image2,1,"Pixel 2 XL(Black)"
                ,"Delivered on Mon 15th Jan 2020"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.product_image,0,"Pixel 2 XL(Black)"
                ,"Cancelled"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.image2,4,"Pixel 2 XL(Black)"
                ,"Delivered on Mon 15th Jan 2020"));

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(myOrderItemModelList);
        myOrdersRecyclerView.setAdapter(myOrderAdapter);
        myOrderAdapter.notifyDataSetChanged();


        return view;
    }

}

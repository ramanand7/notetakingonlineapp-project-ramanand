package com.example.collegeprojrct2;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.collegeprojrct2.R;


import java.lang.reflect.Array;
import java.util.Arrays;


public class bubble_sort_fragment extends Fragment {

    Button bt1b;
    TextView outputb;

    EditText n1b,n2b,n3b,n4b,n5b;



    public bubble_sort_fragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_bubble_sort_fragment, container, false);


        bt1b = view.findViewById(R.id.btb1);
        outputb =view.findViewById(R.id.outputbinarby);
        n1b=view.findViewById(R.id.nb1);
        n2b=view.findViewById(R.id.nb2);
        n3b=view.findViewById(R.id.nb3);
        n4b=view.findViewById(R.id.nb4);
        n5b=view.findViewById(R.id.nb5);
        bt1b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"working",Toast.LENGTH_SHORT).show();

                String nu1b=n1b.getText().toString();
                String nu2b=n2b.getText().toString();
                String nu3b=n3b.getText().toString();
                String nu4b=n4b.getText().toString();
                String nu5b=n5b.getText().toString();



                String [] str = {nu1b, nu2b, nu3b,nu4b,nu5b};
                int size = str.length;
                int [] arr = new int [size];
                for(int i=0; i<size; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
                bubbleSort(arr);

                outputb.setText(Arrays.toString(arr));

            }
        });


        return view;
    }
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

}
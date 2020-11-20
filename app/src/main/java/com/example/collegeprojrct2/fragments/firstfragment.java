package com.example.collegeprojrct2.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.collegeprojrct2.R;
import com.example.collegeprojrct2.R;





public class firstfragment extends Fragment {
    EditText input;
    Button bt1;

    TextView output;

    EditText n1,n2,n3,n4,n5;

    public firstfragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View view= inflater.inflate(R.layout.fragment_firstfragment, container, false);
        input=view.findViewById(R.id.inputbinary);
        bt1 = view.findViewById(R.id.bt1);
        output =view.findViewById(R.id.output);
        n1=view.findViewById(R.id.n1);
        n2=view.findViewById(R.id.n2);
        n3=view.findViewById(R.id.n3);
        n4=view.findViewById(R.id.n4);
        n5=view.findViewById(R.id.n5);



        bt1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"working",Toast.LENGTH_SHORT).show();
                String in=input.getText().toString();
                String nu1=n1.getText().toString();
                String nu2=n2.getText().toString();
                String nu3=n3.getText().toString();
                String nu4=n4.getText().toString();
                String nu5=n5.getText().toString();



                String [] str = {nu1, nu2, nu3,nu4,nu5};
                int size = str.length;
                int [] arr = new int [size];
                for(int i=0; i<size; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }

                int result= binarySearch(arr,Integer.parseInt(in));

                if (result == -1)
                    output.setText("element is not present");
                else {
                    int position = result+1;
                    output.setText("element position ={"+ position+"}");
                }
            }
        });

        return view;
    }

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;


            if (arr[m] < x)
                l = m + 1;


            else
                r = m - 1;
        }
        return -1;
    }
}
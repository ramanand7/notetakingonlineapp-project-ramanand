package com.example.collegeprojrct2.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.collegeprojrct2.R;
import com.example.collegeprojrct2.R;

import java.util.Arrays;
import java.util.Stack;

public class stack extends Fragment {
 EditText n1,n2,n3,n4,n5,n6,n7,n8,size,puell;
 TextView outp,t;
 Button show,create,peek,pop,push;
    String [] str;
    Stack<Integer> stackk = new Stack<Integer>();
    public stack() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fragment_stack, container, false);
        n1= v.findViewById(R.id.i1);
        n2= v.findViewById(R.id.i2);
        n3= v.findViewById(R.id.i3);
        n4= v.findViewById(R.id.i4);
        n5= v.findViewById(R.id.i5);
        n6= v.findViewById(R.id.i6);
        n7= v.findViewById(R.id.i7);
        n8= v.findViewById(R.id.i8);
       outp= v.findViewById(R.id.out);
       show=v.findViewById(R.id.showstack);
       push=v.findViewById(R.id.push);
       pop=v.findViewById(R.id.pop);
       create=v.findViewById(R.id.createstackbtn);
       peek=v.findViewById(R.id.peek);
       size=v.findViewById(R.id.size);
       puell=v.findViewById(R.id.puel);


       create.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int siz= Integer.parseInt(size.getText().toString());
               Toast.makeText(getContext(),"STACK CREATED",Toast.LENGTH_SHORT).show();



  if(siz==1){
      String n11=n1.getText().toString();
      String [] str= {n11};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);

      }
      outp.setText(Arrays.toString(arr));

  }
    else if(siz==2){
        String n11=n1.getText().toString();
      String n22=n2.getText().toString();

        String [] str= {n11,n22};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));

               }
  else if(siz==3){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String [] str= {n11,n22,n33};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);

      }
      for(int i=0; i<size; i++) {

          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));

  }
  else if(siz==4){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String n44=n4.getText().toString();
      String [] str= {n11,n22,n33,n44};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));

  }
  else if(siz==5){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String n44=n4.getText().toString();
      String n55=n5.getText().toString();
      String [] str= {n11,n22,n33,n44,n55};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));

  }
  else if(siz==6){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String n44=n4.getText().toString();
      String n55=n5.getText().toString();
      String n66=n6.getText().toString();
      String [] str= {n11,n22,n33,n44,n55,n66};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));


  }
  else if(siz==7){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String n44=n4.getText().toString();
      String n55=n5.getText().toString();
      String n66=n6.getText().toString();
      String n77=n7.getText().toString();
      String [] str= {n11,n22,n33,n44,n55,n66,n77};

      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));


  }
  else if(siz==8){
      String n11=n1.getText().toString();
      String n22=n2.getText().toString();
      String n33=n3.getText().toString();
      String n44=n4.getText().toString();
      String n55=n5.getText().toString();
      String n66=n6.getText().toString();
      String n77=n7.getText().toString();
      String n88=n8.getText().toString();
      String [] str= {n11,n22,n33,n44,n55,n66,n77,n88};


      int size = str.length;
      int [] arr = new int [size];
      for(int i=0; i<size; i++) {
          arr[i] = Integer.parseInt(str[i]);
          stackk.push(arr[i]);
      }
      outp.setText(Arrays.toString(arr));
  }

  }
  });



       pop.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (stackk.isEmpty()){
                   Toast.makeText(v.getContext(),"empty stack",Toast.LENGTH_SHORT).show();

               }

               else {
             int x= stackk.pop();

               Toast.makeText(v.getContext(),"element "+x +" is popped out",Toast.LENGTH_SHORT).show();
               outp.setText(String.valueOf(x));
               }
           }
       });

       peek.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (stackk.isEmpty()){
                   Toast.makeText(v.getContext(),"empty stack",Toast.LENGTH_SHORT).show();

               }
               else{
                   int x= stackk.peek();
                   String st = String.valueOf(x);
                   outp.setText(st);}
           }
       });

       push.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String s = puell.getText().toString();
              int z= Integer.parseInt(s);
               Toast.makeText(v.getContext(),"element"+z +"is pushed into the stack",Toast.LENGTH_SHORT).show();
               stackk.push(z);
           }
       });
     show.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             int i=0;
             int [] ar = new int[stackk.size()];
             while(!stackk.isEmpty()){
            ar[i] =stackk.pop();
              i++;
             }

             outp.setText(Arrays.toString(ar));

             for(int j=0;j<i;j++){
                 stackk.push(ar[j]);

             }
         }
     });

        return v;
    }
}
package com.example.a16866099_5.taller3_fa.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.a16866099_5.taller3_fa.R;

public class DataFragment extends Fragment {
    private TextView textData1;
    private TextView textData2;
    private TextView textData3;
    private Button btnSend;
    private Button btnSend2;
    private Button btnSend3;
    private DataListener callback;


    public DataFragment()
    {

    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        try {
            callback = (DataListener) context;

        }catch (Exception e)
        {
            throw new ClassCastException(context.toString()+"should implement DataListener");
        }
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_data,container,false);
        textData1= view.findViewById(R.id.textView);
        textData2=view.findViewById(R.id.textView2);
        textData3=view.findViewById(R.id.textView3);
        btnSend = view.findViewById(R.id.buttonSend);
        btnSend2 = view.findViewById(R.id.buttonSend2);
        btnSend3 = view.findViewById(R.id.buttonSend3);

        btnSend.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String textToSend = textData1.getText().toString();


                callback.sendData(textToSend);
            }
        });
        btnSend2.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String textToSend = textData2.getText().toString();

                callback.sendData(textToSend);
            }
        });

        btnSend3.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String textToSend = textData3.getText().toString();

                callback.sendData(textToSend);
            }
        });
        return view;
    }

    public interface DataListener{
        void sendData(String text);
    }
}
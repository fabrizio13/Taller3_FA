package com.example.a16866099_5.taller3_fa.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a16866099_5.taller3_fa.R;

public class DetailsFragment extends Fragment {

    private TextView details;
    private TextView details2;
    private TextView details3;
    private TextView details4;

    public DetailsFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_details,container,false);

        details = (TextView) view.findViewById(R.id.textViewDetails);
        details2 = (TextView) view.findViewById(R.id.textViewTo);
        details3 = (TextView) view.findViewById(R.id.textViewFrom);
        details4 = (TextView) view.findViewById(R.id.textViewBody);

        return view;
    }


    public void renderText(String text )
    { details.setText(text);}
    public void renderTextTo(String text )
    { details2.setText(text);}
    public void renderTextFrom(String text )
    { details3.setText(text);}
    public void renderTextBody(String text )
    { details4.setText(text);}

}

package com.example.id2013_03.android_app.TABS;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.id2013_03.android_app.R;


public class Brochure extends Fragment {

    Spinner Titles;
    Spinner Cars;

    EditText Firstname;
    EditText Surname;
    EditText Email;
    EditText confEmail;

    ImageView sendBtn;



    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.brochrue, container, false);


        Titles = (Spinner)rootView.findViewById(R.id.titleSpinner);
        Cars = (Spinner)rootView.findViewById(R.id.carsSpinner);

        Firstname = (EditText)rootView.findViewById(R.id.FirstName);
        Surname = (EditText)rootView.findViewById(R.id.Surname);
        Email = (EditText)rootView.findViewById(R.id.emailAddress);
        confEmail = (EditText)rootView.findViewById(R.id.confirmEmail);

        sendBtn = (ImageView)rootView.findViewById(R.id.sendEmail);

        Titles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Titles.setSelection(0);
            }
        });
        Cars.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Cars.setSelection(0);
            }
        });

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firstname.getText().clear();
                Surname.getText().clear();
                Email.getText().clear();
                confEmail.getText().clear();

                Titles.setSelection(0);
                Cars.setSelection(0);
            }
        });


        return rootView;
    }
}

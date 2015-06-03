package com.example.shifra.fragmentsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.annotation.Target;


public class FragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Button btnGetText = (Button) getActivity().findViewById(R.id.btnGetText);

        btnGetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView fragmentATextView = (TextView) getActivity().findViewById(R.id.fragmentATextView);
                Toast.makeText(getActivity(), fragmentATextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}

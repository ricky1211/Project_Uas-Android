package com.hello.rickkyyapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.hello.rickkyyapps.R;
import com.hello.rickkyyapps.sinopsis.comedy.SinopsisCekTokoSebelah;
import com.hello.rickkyyapps.sinopsis.romance.SinopsisAncika;
import com.hello.rickkyyapps.sinopsis.romance.SinopsisDilan1990;
import com.hello.rickkyyapps.sinopsis.romance.SinopsisDilan1991;

public class Tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tab2, container, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAncika.class);
                startActivity(intent);
            }
        });

        ImageView imageView12 = view.findViewById(R.id.imageView12);
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDilan1991.class);
                startActivity(intent);
            }
        });
        ImageView imageView13 = view.findViewById(R.id.imageView13);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDilan1990.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void OnToggleClicked() {
    }
}
package com.example.fall20team04sec01_artgallery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LogOut#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LogOut extends Fragment {


    public LogOut() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static LogOut newInstance() {
        LogOut fragment = new LogOut();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }


}
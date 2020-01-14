package com.example.appplanetario.ui.sair;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.appplanetario.ActLogin;
import com.example.appplanetario.R;

public class SairFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FragmentActivity act = getActivity();
        if (act != null) {
            startActivity(new Intent(act, ActLogin.class));
            act.finish();
        }
        View view=null;
        return view;
    }
}
package es.studium.davinciapp.ui.inventor;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.studium.davinciapp.R;
import es.studium.davinciapp.ui.home.HomeViewModel;

public class Inventor extends Fragment {

    private InventorViewModel mViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(InventorViewModel.class);
        View root = inflater.inflate(R.layout.inventor_fragment, container, false);
        final TextView textView = root.findViewById(R.id.nav_inventor);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
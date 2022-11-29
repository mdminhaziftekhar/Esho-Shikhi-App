package com.example.eshoshikhinew.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.eshoshikhinew.AnimalsActivity;
import com.example.eshoshikhinew.ColorsActivity;
import com.example.eshoshikhinew.FruitsActivity;
import com.example.eshoshikhinew.LettersActivity;
import com.example.eshoshikhinew.MathsActivity;
import com.example.eshoshikhinew.NumbersActivity;
import com.example.eshoshikhinew.R;
import com.example.eshoshikhinew.VegitablesActivity;
import com.example.eshoshikhinew.databinding.FragmentHomeBinding;
import com.example.eshoshikhinew.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        LinearLayoutCompat color, numbers, animals, letters, fruits, vegitables, maths;

        color = root.findViewById(R.id.colorLayout);
        numbers = root.findViewById(R.id.numbersLayout);
        animals = root.findViewById(R.id.animalLayout);
        letters = root.findViewById(R.id.lettersLayout);
        fruits = root.findViewById(R.id.fruitsLayout);
        vegitables = root.findViewById(R.id.vegitableLayout);
        maths = root.findViewById(R.id.mathsButton);

        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ColorsActivity.class));
            }
        });
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), NumbersActivity.class));
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AnimalsActivity.class));
            }
        });
        letters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LettersActivity.class));
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FruitsActivity.class));
            }
        });
        vegitables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), VegitablesActivity.class));
            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MathsActivity.class));
            }
        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
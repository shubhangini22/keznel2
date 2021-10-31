package com.example.keznel.ui.borrowing_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.keznel.R;
import com.example.keznel.databinding.FragmentGalleryBinding;
import com.example.keznel.ui.gallery.GalleryViewModel;

public class borrowing_pageFragment extends Fragment {

    private BorrowingPageViewModel BorrowingPageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BorrowingPageViewModel =
                new ViewModelProvider(this).get(BorrowingPageViewModel.class);

        View root = inflater.inflate(R.layout.fragment_borrowing_page, container, false);


        final TextView textView = root.findViewById(R.id.text_borrowing_page);
        BorrowingPageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
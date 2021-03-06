package com.eric_b.mynews.controllers.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.eric_b.mynews.R;

import butterknife.BindView;
import icepick.State;


public class MostPopularFragment extends BaseFragment {
    @BindView(R.id.fragment_mostpopular_textview)
    TextView textView;
    @State
    int buttonTag;

    // --------------
    // BASE METHODS
    // --------------


    @Override
    protected BaseFragment newInstance() {
        return null;
    }

    @Override
    protected int getFragmentLayout() {
        return 0;
    }

    @Override
    protected void configureDesign() {

    }

    @Override
    protected void updateDesign() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_most_popular, container, false);
    }
}

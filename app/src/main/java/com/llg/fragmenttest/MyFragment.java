package com.llg.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.llg.fragmenttest.MainActivity.TAG;

/**
 * create by lilugen on 2018-11-10
 */
public class MyFragment extends Fragment {

    @Override
    public void onDetach() {
        Log.e(TAG, "Frag onDetach");
        super.onDetach();
    }

    @Override
    public void onAttach(Context context) {
        Log.e(TAG, "Frag onAttach");
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "Frag onCreateView");
        View view = inflater.inflate(R.layout.fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "Frag onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.e(TAG, "Frag onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG, "Frag onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(TAG, "Frag  onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "Frag onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "Frag onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "Frag onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "Frag onDestroyView");
        super.onDestroyView();
    }
}

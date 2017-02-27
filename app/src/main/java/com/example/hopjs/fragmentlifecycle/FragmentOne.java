package com.example.hopjs.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hopjs on 2017/2/24.
 */

public class FragmentOne extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        showMessage("onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        showMessage("onDetach");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showMessage("onActivityCreated");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showMessage("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        showMessage("onCreateView");
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showMessage("onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        showMessage("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        showMessage("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        showMessage("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        showMessage("onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        showMessage("onSaveInstanceState");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        showMessage("onViewStateRestored");
    }

    private void showMessage(String msg){
        Log.i("MainActivityTTTT","FragmentOne:"+msg+",ThreadId:"+android.os.Process.myTid());
    }
}

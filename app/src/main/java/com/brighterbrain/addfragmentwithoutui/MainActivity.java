package com.brighterbrain.addfragmentwithoutui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fragmentManager = getFragmentManager();
// Or: FragmentManager fragmentManager = getSupportFragmentManager()
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BackgroundFragment fragment = new BackgroundFragment();
        fragmentTransaction.add(fragment, "thread_manager");
        fragmentTransaction.commit();

    }

    public static class BackgroundFragment extends Fragment {
        private  static  final  String TAG = "BGFragment";
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(TAG, "Created blank fragment");
        }
    }
}

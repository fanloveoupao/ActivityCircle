package bruse.com.activitylifecircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("TAG,","界面2-》onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG,","界面2-》onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG,","界面2-》onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG,","界面2-》onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG,","界面2-》onPStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG,","界面2-》onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG,","界面2-》onDestory");
    }
}

package bruse.com.activitylifecircle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG,","界面1-》onCreate");
        findViewById(R.id.helelo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG,","界面1-》onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG,","界面1-》onResume");
        /*程序界面开始运行*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG,","界面1-》onPause");
        /*另外一个界面进入*/
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG,","界面1-》onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG,","界面1-》onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG,","界面1-》onDestory");
        Toast.makeText(MainActivity.this, "点击推出", Toast.LENGTH_LONG).show();
    }
}

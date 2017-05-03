package jniproject.ndkproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


/**
 * auth:huanjulu
 */

public class MainActivity extends AppCompatActivity {


    static {
        System.loadLibrary("hellojni");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ((TextView) findViewById(R.id.text)).setText(nativeMethod());
    }
    /**
     * native code
     *
     * @return
     */
    public native String nativeMethod();

}

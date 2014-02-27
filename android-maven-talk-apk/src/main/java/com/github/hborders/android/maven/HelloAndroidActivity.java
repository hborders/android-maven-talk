package com.github.hborders.android.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import it.sephiroth.android.library.ab.AB;
import it.sephiroth.android.library.ab.ABTest;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        AB alphaBetaTest = AB.getInstance( this );
        alphaBetaTest.doABTest( "test-action", new ABTest() {
            @Override
            public void A() {
                Toast.makeText(HelloAndroidActivity.this, "A", Toast.LENGTH_LONG).show();
            }

            @Override
            public void B() {
                Toast.makeText(HelloAndroidActivity.this, "B", Toast.LENGTH_LONG).show();
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(com.github.hborders.android.maven.R.menu.main, menu);
	return true;
    }

    public void buttonClicked(View view) {
        startActivity(new Intent(this, CalendarActivity.class));
    }
}


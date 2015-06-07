package com.toystalk.nanodegreeapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Called when the user touches the Spotify Streamer button
    public void onClickSpotify(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer app!", Toast.LENGTH_SHORT).show();
    }

    // Called when the user touches the Scores button
    public void onClickScores(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Scores app!", Toast.LENGTH_SHORT).show();
    }

    // Called when the user touches the Library button
    public void onClickLibrary(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Library app!", Toast.LENGTH_SHORT).show();
    }

    // Called when the user touches the Build It Bigger button
    public void onClickBuild(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    // Called when the user touches the XYZ Reader button
    public void onClickReader(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    // Called when the user touches the Capstone: My Own APP button
    public void onClickCapstone(View view){
        Toast.makeText(getApplicationContext(),"This button will launch Capstone: My Own APP!", Toast.LENGTH_SHORT).show();
    }
}

package projects.oss2015.cs.fundookid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Colors extends ActionBarActivity {
    public static MediaPlayer mpCheer,mpAww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        mpCheer= MediaPlayer.create(this, R.raw.cheering);
        mpAww= MediaPlayer.create(this, R.raw.aww);
    }

    public void onClickBlueHat(View view){
        mpCheer.start();
    }

    public void onClickRedHat(View view){
       mpAww.start();
    }

    public void onClickYellowHat(View view){
        mpAww.start();
    }

    public void onClickRightArrow(View view){
        Intent i = new Intent(this,Shoes.class);
        startActivity(i);
    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_colors, menu);
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
}
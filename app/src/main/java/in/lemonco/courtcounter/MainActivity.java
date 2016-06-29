package in.lemonco.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA=0;
    private int scoreTeamB=0;
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
    /**
     * Displays the given score for Team A.
     */
    public void onClickA(View v){
        switch(v.getId()) {
            case R.id.three_points_A:
                scoreTeamA+=3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.two_points_A:
                scoreTeamA+=2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.one_point_A:
                scoreTeamA+=1;
                displayForTeamA(scoreTeamA);
                break;
        }

    }
    public void onClickB(View v){
        switch(v.getId()) {
            case R.id.three_points_B:
                scoreTeamB+=3;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.two_points_B:
                scoreTeamB+=2;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.one_point_B:
                scoreTeamB+=1;
                displayForTeamB(scoreTeamB);
                break;
        }

    }
    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_A);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_score_B);
        scoreView.setText(String.valueOf(score));
    }
}

package newpackage.vab.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startgame(View view)
    {
        Intent intent = new Intent(this,MainGameActivity.class);
        startActivity(intent);

    }

    public void optionScreen(View view)
    {
        Intent intent = new Intent(this,MainOptionActivity.class);
        startActivity(intent);
    }


    public void exitGame(View view)
    {
        System.exit(0);
    }



}

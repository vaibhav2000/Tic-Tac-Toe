package newpackage.vab.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_option);
    }

    public void shareIt(View view)
    {
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"Hey there, install this awesome app for free!! Visit https://github.com/vaibhav2000/Tic-Tac-Toe for details.");
        intent.setType("text/plain");

        startActivity(intent);

    }

}

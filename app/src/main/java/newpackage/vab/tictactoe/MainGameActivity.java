package newpackage.vab.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainGameActivity extends AppCompatActivity {

    private int count=0;
    boolean flag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);


    }

    public void playerTook(View view)
    {
        Button butt= (Button)findViewById(view.getId());

        if(butt.getText().toString().equals("")&&flag)
        {if(count%2==0)
            butt.setText("O");
        else
            butt.setText("X");
        count++;

         if(checkAll())
         {
             flag=false;

             TextView txt= (TextView)findViewById(R.id.textid);

             if(count%2==1)
                 txt.setText("Player 1 wins");
             else
                 txt.setText("Player 2 wins");



         }


        }
    }

    public void reset(View view)
    {
        flag=true;

        ((Button)findViewById(R.id.but11)).setText("");
        ((Button)findViewById(R.id.but12)).setText("");
        ((Button)findViewById(R.id.but13)).setText("");
        ((Button)findViewById(R.id.but21)).setText("");
        ((Button)findViewById(R.id.but22)).setText("");
        ((Button)findViewById(R.id.but23)).setText("");
        ((Button)findViewById(R.id.but31)).setText("");
        ((Button)findViewById(R.id.but32)).setText("");
        ((Button)findViewById(R.id.but33)).setText("");

        ((TextView)findViewById(R.id.textid)).setText("");
        count=0;
    }


    boolean checkAll()
    {
        String A[][]= new String[3][3];

        A[0][0]= ((Button)findViewById(R.id.but11)).getText().toString();
        A[0][1]= ((Button)findViewById(R.id.but12)).getText().toString();
        A[0][2]= ((Button)findViewById(R.id.but13)).getText().toString();
        A[1][0]= ((Button)findViewById(R.id.but21)).getText().toString();
        A[1][1]= ((Button)findViewById(R.id.but22)).getText().toString();
        A[1][2]= ((Button)findViewById(R.id.but23)).getText().toString();
        A[2][0]= ((Button)findViewById(R.id.but31)).getText().toString();
        A[2][1]= ((Button)findViewById(R.id.but32)).getText().toString();
        A[2][2]= ((Button)findViewById(R.id.but33)).getText().toString();


        for(int i=0;i<3;i++)
        {
            if ((A[0][i] == A[1][i] && A[1][i] == A[2][i])&&(A[0][i].equals("")==false))
                return true;
            if ((A[i][0]==A[i][1]&&A[i][1]==A[i][2])&&(A[i][0].equals("")==false))
                 return true;
        }

        if((A[0][0]==A[1][1]&&A[1][1]==A[2][2])&&(A[0][0].equals("")==false))
             return true;

        if((A[0][2]==A[1][1]&&A[1][1]==A[0][2])&&(A[0][2].equals("")==false))
             return true;

        return false;
    }


}

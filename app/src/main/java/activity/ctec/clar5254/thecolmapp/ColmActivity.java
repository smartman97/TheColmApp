package activity.ctec.clar5254.thecolmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class ColmActivity extends AppCompatActivity
{
    private Button FamilyButton;
    private Button FoodButton;
    private Button MusicButton;
    private Button SportsButton;
    private Button TechButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colm);

        FamilyButton = (Button) findViewById(R.id.FamilyButton);
        FoodButton = (Button) findViewById(R.id.FoodButton);
        MusicButton = (Button) findViewById(R.id.MusicButton);
        SportsButton = (Button) findViewById(R.id.SportsButton);
        TechButton = (Button) findViewById(R.id.TechButton);

        setupListener();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_colm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListener()
    {
        FamilyButton.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View buttonView)
                {
                    Intent changeScreen = new Intent(buttonView.getContext(), FamilyActivity.class);
                    startActivityForResult(changeScreen, 0);
                }
        });

        FoodButton.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View buttonView)
                {
                    Intent changeScreen = new Intent(buttonView.getContext(), FoodActivity.class);
                    startActivityForResult(changeScreen, 0);
                }
        });

        MusicButton.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View buttonView)
                {
                    Intent changeScreen = new Intent(buttonView.getContext(), MusicActivity.class);
                    startActivityForResult(changeScreen, 0);
                }
        });

        SportsButton.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View buttonView)
                {
                    Intent changeScreen = new Intent(buttonView.getContext(), SportsActivity.class);
                    startActivityForResult(changeScreen, 0);
                }
        });

        TechButton.setOnClickListener(new View.OnClickListener()
        {
                public void onClick(View buttonView)
                {
                    Intent changeScreen = new Intent(buttonView.getContext(), TechnologyActivity.class);
                    startActivityForResult(changeScreen, 0);
                }
        });
    }

}

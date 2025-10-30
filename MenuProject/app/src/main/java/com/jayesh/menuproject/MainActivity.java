package com.jayesh.menuproject;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView selectedOptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get reference to the TextView
        selectedOptionText = findViewById(R.id.selected_option_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.item_option1:
                selectedOptionText.setText("You selected Option 1");
                return true;
            case R.id.item_option2:
                selectedOptionText.setText("You selected Option 2");
                return true;
            case R.id.item_option3:
                selectedOptionText.setText("You selected Option 3");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

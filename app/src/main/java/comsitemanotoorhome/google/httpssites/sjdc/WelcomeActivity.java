package comsitemanotoorhome.google.httpssites.sjdc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Start the activity and finish the splash screen
        //once everything is loaded from main screen
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}

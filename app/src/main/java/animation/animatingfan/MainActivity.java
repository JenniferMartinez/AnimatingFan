package animation.animatingfan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private final String TAG = getClass().getSimpleName();
    private final boolean D = Log.isLoggable(TAG, Log.DEBUG);

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (D) {
            Log.d(TAG, "Starting onCreateView");
        }

        final ImageView imageView = (ImageView) findViewById(R.id.fan);

        final ToggleButton power = (ToggleButton) findViewById(R.id.power);
        final RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF,
                0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(6000);

        Button speed1 = (Button) findViewById(R.id.speed1);
        Button speed2 = (Button) findViewById(R.id.speed2);
        Button speed3 = (Button) findViewById(R.id.speed3);

        //power button
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (power.isChecked()) {
                    Toast.makeText(getApplicationContext(), "On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Off", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //speed 1 button
        speed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (power.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Speed 1", Toast.LENGTH_SHORT).show();

                    rotate.setDuration(6000);
                    imageView.startAnimation(rotate);
                }
            }
        });

        //speed 2 button
        speed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (power.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Speed 2", Toast.LENGTH_SHORT).show();

                    rotate.setDuration(2500);
                    imageView.startAnimation(rotate);
                }
            }
        });

        //speed 3 button
        speed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (power.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Speed 3", Toast.LENGTH_SHORT).show();
                    rotate.setDuration(500);
                    imageView.startAnimation(rotate);
                }
            }
        });

        if (D) {
            Log.d(TAG, "onCreateView completed");
        }

    }


}


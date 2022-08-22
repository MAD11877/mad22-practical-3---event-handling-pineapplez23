package sg.edu.np.mad.practical_2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MyMessageButton = findViewById(R.id.MessageButton);
        Button MyFollowButton = findViewById(R.id.FollowButton);
        User MyUser = new User();
        MyUser.setName("MAD practical 3");
        MyUser.setDescription("App for practical 3");
        MyUser.setFollowed(false);
        TextView MyName = findViewById(R.id.Name);
        TextView MyDescription = findViewById(R.id.Discription);

        MyName.setText(MyUser.getName());
        MyDescription.setText(MyUser.getDescription());


        MyMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this,"Message", Toast.LENGTH_LONG).show();
            }
        });

        MyFollowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MyUser.isFollowed() == false)
                {
                    MyFollowButton.setText("Follow");
                    Toast.makeText(MainActivity.this,"Followed", Toast.LENGTH_LONG).show();
                    MyUser.setFollowed(true);
                }
                else
                {
                    MyFollowButton.setText("Unfollow");
                    Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_LONG).show();
                    MyUser.setFollowed(false);
                }

            }
        });

    }
    }
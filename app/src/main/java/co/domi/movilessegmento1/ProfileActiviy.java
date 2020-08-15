package co.domi.movilessegmento1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActiviy extends AppCompatActivity {

    private Button backBtn;
    private EditText newUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activiy);

        String username = getIntent().getExtras().getString("A");

        backBtn = findViewById(R.id.backBtn);
        newUsername = findViewById(R.id.newUsername);

        newUsername.setText(username);

        backBtn.setOnClickListener(
                (v) -> {

                    Intent data = new Intent();
                    data.putExtra("username", newUsername.getText().toString());
                    setResult(RESULT_OK, data);
                    finish();
                }
        );
    }
}
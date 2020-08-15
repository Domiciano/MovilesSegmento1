package co.domi.movilessegmento1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView loginTitle;
    private ImageView loginLogo;
    private EditText loginUsername;
    private EditText loginPassword;
    private Button loginIniciarBtn;
    private static final int CODE = 16;

    //Primer metodo que se ejecuta en una Actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciar
        loginTitle = findViewById(R.id.loginTitle);
        loginLogo = findViewById(R.id.loginLogo);
        loginUsername = findViewById(R.id.loginUsername);
        loginPassword = findViewById(R.id.loginPassword);
        loginIniciarBtn = findViewById(R.id.loginIniciarBtn);


        loginIniciarBtn.setOnClickListener(
                (v) -> {
                    //Aqui va mi accion
                    String username = loginUsername.getText().toString();
                    String password = loginPassword.getText().toString();
                    //Toast.makeText(this, username + " " + password, Toast.LENGTH_LONG).show();
                    //INTENT

                    Intent intent = new Intent(this, ProfileActiviy.class);
                    intent.putExtra("A", username);
                    startActivityForResult(intent, CODE);
                }
        );

    }


    //Control + O


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == CODE && resultCode == RESULT_OK){
            String username = data.getExtras().getString("username");
            loginUsername.setText(username);
        }
    }
}
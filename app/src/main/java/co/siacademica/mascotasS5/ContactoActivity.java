package co.siacademica.mascotasS5;

import android.os.Bundle;

import co.siacademica.mascotasS5.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    public void enviaMail(View view) {



        EditText ETEmail = (EditText)findViewById(R.id.editEmail);
        String Email = ETEmail.getText().toString();

        EditText ETMensaje = (EditText)findViewById(R.id.editMensaje);
        String Mensaje = ETMensaje.getText().toString();

        Log.e("Email", "Contactanos");
        EmailSenderService emailService = new EmailSenderService();
        emailService.sendEmail(Mensaje, Email);
        finish();
        Toast.makeText(ContactoActivity.this, "Email enviado", Toast.LENGTH_LONG).show();


    }
}

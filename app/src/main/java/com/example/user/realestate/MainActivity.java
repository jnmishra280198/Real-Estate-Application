package com.example.user.realestate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  ButtonClick(View view)
    {
        EditText et1=(EditText)findViewById(R.id.etmyemail);
        EditText et2=(EditText)findViewById(R.id.etmypasss);

        String email=et1.getText().toString();
        String pass=et2.getText().toString();


        String oemail="jnmishra280198@gmail.com";
        String opass="jay@280198";

        if(email.equals(oemail) && pass.equals(opass))
        {
            Intent intent=new Intent(this,Navigation.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Invalid Email and Password", Toast.LENGTH_SHORT).show();
        }
    }

}

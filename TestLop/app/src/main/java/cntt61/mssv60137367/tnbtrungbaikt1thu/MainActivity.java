package cntt61.mssv60137367.tnbtrungbaikt1thu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername, edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ các biến
        edtusername = (EditText) findViewById(R.id.edtUser);
        edtpass = (EditText) findViewById(R.id.edtPass);
    }
    public void XulyLogin(View v) {
        String username = "baotrung";
        String password = "123";
        if (edtusername.getText().toString().equals(username) && edtpass.getText().toString().equals(password)){
            Toast.makeText(getApplicationContext(),"User and Password is correct",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"User and Password is wrong”",Toast.LENGTH_LONG).show();
        }
    }
}
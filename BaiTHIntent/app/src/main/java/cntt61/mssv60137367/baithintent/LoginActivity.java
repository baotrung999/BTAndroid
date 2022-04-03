package cntt61.mssv60137367.baithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtusername, edtpass, edtmail;
    Button btnok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ánh xạ các biến
        edtusername = (EditText) findViewById(R.id.edtUsername);
        edtpass = (EditText) findViewById(R.id.edtPass);
        edtmail = (EditText) findViewById(R.id.edtMail);
        btnok = (Button) findViewById(R.id.btnOK);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "baotrung";
                String password = "123";
                String mall = "trung@gmail.com";
                if (edtusername.getText().toString().equals(username) && edtpass.getText().toString().equals(password) && edtmail.getText().toString().equals(mall)){
                    Toast.makeText(getApplicationContext(),"Đăng Nhập Thành Công",Toast.LENGTH_LONG).show();
                    Intent iManhinhHome = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(iManhinhHome);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Tài Khoản Hoặc Mật Khẩu Sai",Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
package cntt61.mssv60137367.baithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtusername, edtpass, edtmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ánh xạ các biến
        edtusername = (EditText) findViewById(R.id.edtUsername);
        edtpass = (EditText) findViewById(R.id.edtPass);
        edtmail = (EditText) findViewById(R.id.edtMail);
    }
    public void XulyLogin(View v) {
        String username = "baotrung";
        String password = "123";
        String mail = "trung@gmail.com";
        if (edtusername.getText().toString().equals(username) && edtpass.getText().toString().equals(password) && edtmail.getText().toString().equals(mail)){
            Toast.makeText(getApplicationContext(),"Đăng Nhập Thành Công",Toast.LENGTH_SHORT).show();
            /*String hoten = data.getStringExtra("HT");
            TextView tvHT = (TextView)findViewById(R.id.editKQ);
            tvHT.setText(hoten);*/
            Intent iManhinhHome = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(iManhinhHome);
        }
        else{
            Toast.makeText(getApplicationContext(),"Tài Khoản Hoặc Mật Khẩu Sai",Toast.LENGTH_LONG).show();
        }
    }
}
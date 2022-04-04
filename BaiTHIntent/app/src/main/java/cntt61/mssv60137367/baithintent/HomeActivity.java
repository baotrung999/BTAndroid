package cntt61.mssv60137367.baithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void Nhap_QuayVe(View v){
        EditText edHT = (EditText)findViewById(R.id.editKQ);
        // Lấy dữ Liệu
        String hoten = edHT.getText().toString();

        // Tạo mới Intent
        Intent iKQnhaplieu = new Intent();
        iKQnhaplieu.putExtra("HT",hoten);
        // Gửi kết quả về cho Activity đã gọi nó
        setResult(RESULT_OK, iKQnhaplieu);
        // Đóng Activity nhập Liệu (này)
        finish();
    }
}
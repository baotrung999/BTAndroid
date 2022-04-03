package cntt61.mssv60137367.baithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Hàm đáp ứng sự kiện nhấn lên nút "Sang màn hình khác"
    // xử Lý chuyến màn hình
    public void ChuyenManHinh (View v) {
        // Tạo một đối tượng Intent
        // Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyến
        Intent iManHinhkhac = new Intent(  this, LoginActivity.class);
        // Thực hiện chuyến
        startActivity(iManHinhkhac);
    }
}
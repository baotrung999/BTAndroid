package cntt61.mssv60137367.mylyric;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShowLyricActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lyric);
        //
        Intent BH = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt
        String tenBai = BH.getStringExtra("tenBH");
    }
}
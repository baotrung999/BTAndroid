package cntt61.mssv60137367.thigkbai2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    ThoAdapter adapter;
    RecyclerView rv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_list = (RecyclerView) findViewById(R.id.contact_list);
        rv_list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rv_list.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getLoaderManager().initLoader(0, null, this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                View getEmpIdView = li.inflate(R.layout.dialog_tho, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

                //đặt hộp dialog_contact_details.xml thành trình tạo alertdialog
                alertDialogBuilder.setView(getEmpIdView);

                final EditText nameInput = (EditText) getEmpIdView.findViewById(R.id.editTextDialogNameInput);
                final EditText phoneInput = (EditText) getEmpIdView.findViewById(R.id.editTextDialogPhoneInput);
                // đặt thông báo hộp thoại

                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("Thêm", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // lấy đầu vào của người dùng và đặt nó thành kết quả
                                insertContact(nameInput.getText().toString(), phoneInput.getText().toString());


                            }

                            private void insertContact(String toString, String toString1) {
                            }
                        }).create()
                        .show();

            }
        });
    }
    private void insertContact(String ThoName) {
        ContentValues values = new ContentValues();
        values.put(SQLiteHelper.CONTACT_NAME, ThoName);
        Uri contactUri = getContentResolver().insert(ContactsProvider.CONTENT_URI, values);
        Toast.makeText(this, "Tạo liên hệ" + ThoName, Toast.LENGTH_LONG).show();
    }

    private void deleteAllContacts() {

        getContentResolver().delete(ContactsProvider.CONTENT_URI, null, null);
        restartLoader();
        Toast.makeText(this, "Xóa", Toast.LENGTH_LONG).show();
    }
}
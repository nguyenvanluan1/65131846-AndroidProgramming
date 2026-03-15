package tiil.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Lưu ý: Không cần ánh xạ ở đây nếu bạn làm theo cách của thầy là ánh xạ bên trong hàm onClick
    }

    // Tên hàm này PHẢI trùng khớp với android:onClick="XuLyCong" trong XML
    public void XuLyCong(View view) {
        // 1. Ánh xạ các điều khiển từ XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        // 2. Lấy dữ liệu từ EditText
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        // Kiểm tra nếu người dùng chưa nhập gì để tránh văng app (Crash)
        if (strA.isEmpty() || strB.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đủ số a và b", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // 3. Chuyển đổi sang kiểu số và tính toán
            int so_A = Integer.parseInt(strA);
            int so_B = Integer.parseInt(strB);
            int tong = so_A + so_B;

            // 4. Hiển thị kết quả (Phải chuyển số về lại dạng Chuỗi)
            editTextKetQua.setText(String.valueOf(tong));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng chỉ nhập số nguyên", Toast.LENGTH_SHORT).show();
        }
    }
}
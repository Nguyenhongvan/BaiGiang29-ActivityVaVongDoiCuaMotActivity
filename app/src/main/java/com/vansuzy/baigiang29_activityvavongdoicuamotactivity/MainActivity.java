package com.vansuzy.baigiang29_activityvavongdoicuamotactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyCheKhuatToanBo(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh2Activity.class);
        startActivity(intent);
    }

    /*
    Các sự kiện xảy ra khi chuyển từ Màn hình 1 sang Màn hình 2 và ngược lại
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    /*
     1: Hàm onStart() được thực thi khi chương trình được khởi chạy lần đầu tiên
     6: Hàm onStart() được thực thi sau khi hàm onRestart() được thực thi xong (khi click vào button Quay trở về)
      */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_LONG).show();
    }

    /*
    4: Hàm onStop() được thực thi sau khi hàm onPause() thực thi xong (khi click vào button Che khuất toàn bộ màn hình)
     */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_LONG).show();
    }

    /*
    3: Hàm onPause() được thực thi khi click vào button Che khuất toàn bộ màn hình
     */

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_LONG).show();
    }

    /*
    5: Hàm onRestart() được thực thi khi click vào button Quay trở về
     */

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_LONG).show();
    }

    /*
    2: Hàm onResume() được thực thi sau khi hàm onStart() thực thi xong (khi chương trình được khởi chạy lần đầu tiên)
    7: Hàm onResume() được thực thi sau khi hàm onRestart() được thực thi xong (khi click vào button Quay trở về)
     */

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_LONG).show();
    }

    public void xuLyCheKhuatMotPhan(View view) {
        Intent intent = new Intent(MainActivity.this, ManHinh3Activity.class);
        startActivity(intent);
    }
}

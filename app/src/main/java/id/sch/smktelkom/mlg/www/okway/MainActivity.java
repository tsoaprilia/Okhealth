package id.sch.smktelkom.mlg.www.okway;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivityData = findViewById(R.id.btn_move_activity_data);
        btnMoveActivityData.setOnClickListener(this);

        Button btnMoveWithData = findViewById(R.id.btn_move_with_data);
        btnMoveWithData.setOnClickListener(this);

        Button btnMoveWithActivity = findViewById(R.id.btn_move_with_activity);
        btnMoveWithActivity.setOnClickListener(this);


        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_with_data_activity);
        btnMoveWithDataActivity.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent MoveActivityData = new Intent(MainActivity.this, MoveActivity2.class);
                startActivity(MoveActivityData);
                break;
            case R.id.btn_move_with_data_activity:
                Intent movewithdataactivity = new Intent(MainActivity.this, MoveActivity3.class);
                startActivity(movewithdataactivity);
                break;
            case R.id.btn_move_with_activity:
                Intent Move = new Intent(MainActivity.this, MoveActivity4.class);
                startActivity(Move);
                break;
            case R.id.btn_move_with_data:
                Intent Movewithdata = new Intent(MainActivity.this, MoveActivity5.class);
                startActivity(Movewithdata);
                break;


        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

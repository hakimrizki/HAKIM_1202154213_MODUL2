package id.hakimrizki.hakim_1202154213_modul2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


import id.hakimrizki.hakim_1202154213_modul2.MenuMakanan.ListMenuActivity;

public class TakeAwayActivity extends AppCompatActivity {

    EditText ed_nama, ed_phone, ed_alamat, ed_catatan;
    Button btnPilih, btnDate, btnTime;
    SimpleDateFormat dateFormat;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    TextView tvTanggal,tvJam;

    //Deklarasi komponen yang digunakan pada UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        ed_nama = (EditText)findViewById(R.id.edNama);
        ed_phone = (EditText)findViewById(R.id.edPhone);
        ed_alamat = (EditText)findViewById(R.id.edAlamat);
        ed_catatan = (EditText)findViewById(R.id.edCatatan);
        btnPilih = (Button)findViewById(R.id.btn_pilih);
        btnDate = (Button)findViewById(R.id.btn_tanggal);
        btnTime = (Button)findViewById(R.id.btn_jam);
        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        tvTanggal = (TextView)findViewById(R.id.tv_tanggal);
        tvJam = (TextView)findViewById(R.id.tv_jam);

        //Binding komponen pada UI ke Java

        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TakeAwayActivity.this, ListMenuActivity.class);
                startActivity(i);
            }
        });

        //Ketika button diklik maka akan berpindah activity ke ListMenuActivity

        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        //Ketika button diklik maka akan muncul opsi tanggal yang bisa dipilih

        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTimeDialog();
            }
        });

        //Ketika button diklik maka akan muncul opsi waktu yang bisa dipilih

    }

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, day);
                tvTanggal.setText("Tanggal yang dipilih = "+dateFormat.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    //Method diatas digunakan untuk inisialisasi komponen DatePicker

    private void showTimeDialog() {
        Calendar calendar = Calendar.getInstance();
        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                tvJam.setText("Waktu yang dipilih = "+hourOfDay+":"+minute);
            }
        }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true);
        timePickerDialog.show();
    }

    //Method diatas digunakan untuk inisialisasi komponen TimePicker
}

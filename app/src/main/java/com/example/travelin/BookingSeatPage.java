package com.example.travelin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookingSeatPage extends AppCompatActivity implements View.OnClickListener {

    private Button search_buses;
    private ImageView seatA1, seatA2, seatA3, seatA4, seatA5, seatA6;
    private ImageView seatB1, seatB2, seatB3, seatB4, seatB5, seatB6;
    private ImageView seatC1, seatC2, seatC3, seatC4, seatC5, seatC6;
    private ImageView seatD1, seatD2, seatD3, seatD4, seatD5, seatD6;

    private int[] seatsId = new int[24];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_seat);

        seatA1 = findViewById(R.id.seatA1);
        seatA2 = findViewById(R.id.seatA2);
        seatA3 = findViewById(R.id.seatA3);
        seatA4 = findViewById(R.id.seatA4);
        seatA5 = findViewById(R.id.seatA5);
        seatA6 = findViewById(R.id.seatA6);

        seatB1 = findViewById(R.id.seatB1);
        seatB2 = findViewById(R.id.seatB2);
        seatB3 = findViewById(R.id.seatB3);
        seatB4 = findViewById(R.id.seatB4);
        seatB5 = findViewById(R.id.seatB5);
        seatB6 = findViewById(R.id.seatB6);

        seatC1 = findViewById(R.id.seatC1);
        seatC2 = findViewById(R.id.seatC2);
        seatC3 = findViewById(R.id.seatC3);
        seatC4 = findViewById(R.id.seatC4);
        seatC5 = findViewById(R.id.seatC5);
        seatC6 = findViewById(R.id.seatC6);

        seatD1 = findViewById(R.id.seatD1);
        seatD2 = findViewById(R.id.seatD2);
        seatD3 = findViewById(R.id.seatD3);
        seatD4 = findViewById(R.id.seatD4);
        seatD5 = findViewById(R.id.seatD5);
        seatD6 = findViewById(R.id.seatD6);

        //Di sini nyimpen array yg isinya semua R.id dari tiap kursi
        seatsId[0] = R.id.seatA1;
        seatsId[1] = R.id.seatA2;
        seatsId[2] = R.id.seatA3;
        seatsId[3] = R.id.seatA4;
        seatsId[4] = R.id.seatA5;
        seatsId[5] = R.id.seatA6;

        seatsId[6] = R.id.seatB1;
        seatsId[7] = R.id.seatB2;
        seatsId[8] = R.id.seatB3;
        seatsId[9] = R.id.seatB4;
        seatsId[10] = R.id.seatB5;
        seatsId[11] = R.id.seatB6;

        seatsId[12] = R.id.seatC1;
        seatsId[13] = R.id.seatC2;
        seatsId[14] = R.id.seatC3;
        seatsId[15] = R.id.seatC4;
        seatsId[16] = R.id.seatC5;
        seatsId[17] = R.id.seatC6;

        seatsId[18] = R.id.seatD1;
        seatsId[19] = R.id.seatD2;
        seatsId[20] = R.id.seatD3;
        seatsId[21] = R.id.seatD4;
        seatsId[22] = R.id.seatD5;
        seatsId[23] = R.id.seatD6;

        seatA1.setOnClickListener(this);
        seatA2.setOnClickListener(this);
        seatA3.setOnClickListener(this);
        seatA4.setOnClickListener(this);
        seatA5.setOnClickListener(this);
        seatA6.setOnClickListener(this);

        seatB1.setOnClickListener(this);
        seatB2.setOnClickListener(this);
        seatB3.setOnClickListener(this);
        seatB4.setOnClickListener(this);
        seatB5.setOnClickListener(this);
        seatB6.setOnClickListener(this);

        seatC1.setOnClickListener(this);
        seatC2.setOnClickListener(this);
        seatC3.setOnClickListener(this);
        seatC4.setOnClickListener(this);
        seatC5.setOnClickListener(this);
        seatC6.setOnClickListener(this);

        seatD1.setOnClickListener(this);
        seatD2.setOnClickListener(this);
        seatD3.setOnClickListener(this);
        seatD4.setOnClickListener(this);
        seatD5.setOnClickListener(this);
        seatD6.setOnClickListener(this);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_main);
//        search_buses = findViewById(R.id.search_buses);
//        search_buses.setOnClickListener(view -> {
//            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
//            startActivity(intent);
//        });
    }

    @Override
    public void onClick(View v) {
        // Pake if yg ini buat ngatur2 tombol
//        if(){

//        }else {
            int i = 0;
            String seatId = ""; // nyimpen nama kursi yg dipilih
            int selectedSeat; // nyimpen nomor urutan array kursi ke berapa yg kita pilih

            // Disini ngecek kursi mana yg kita pencet
            // Cara taunya nyocokin R.id yg kita pencet (v.getId()) sama R.id kursi yg udah disimpen di array di atas, kalo id-nya sama nanti nama kursinya disimpen di seatID
            // Kalo udah, perulangan di bawah (do-while) selesai
            do {
                if (v.getId() == seatsId[i]) {
                    seatId = getResources().getResourceEntryName(v.getId());
                    selectedSeat = i;
                }
                i++;
            } while (v.getId() != seatsId[i - 1] && i < 24);

            selectedSeat = i - 1;
            Toast.makeText(getApplicationContext(), "You Click On " + seatId + String.valueOf(selectedSeat), Toast.LENGTH_SHORT).show();

            // Disini tinggal ngubah warna kursi jadi available sama ngecek kursi available atau ngga
            // Jangan lupa masukin kursi mana aja yg mau di booking

//        }
    }
}
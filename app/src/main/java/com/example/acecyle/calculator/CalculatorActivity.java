package com.example.acecyle.calculator;

import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalculatorActivity extends Fragment {


    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
                    button9, buttonClr, buttonPersen, buttonKali, buttonTbh, buttonBagi, buttonTtk, buttonHtg;
    private ImageButton buttonDlt, buttonKrg;
    TextView operator, Hhasil, notif, edt1, edt2;
    private int operation ;
    private double hasilEnd = 0 ;
    private String ck1 = "";
    private String ck2 = "";



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedIntanceState){
        View view = inflater.inflate(R.layout.activity_calculator, container, false);
        //return view;

        button0 = view.findViewById(R.id.btn0);
        button1 = view.findViewById(R.id.btn1);
        button2 = view.findViewById(R.id.btn2);
        button3 = view.findViewById(R.id.btn3);
        button4 = view.findViewById(R.id.btn4);
        button5 = view.findViewById(R.id.btn5);
        button6 = view.findViewById(R.id.btn6);
        button7 = view.findViewById(R.id.btn7);
        button8 = view.findViewById(R.id.btn8);
        button9 = view.findViewById(R.id.btn9);
        buttonTtk = view.findViewById(R.id.btnTitik);
        buttonClr = view.findViewById(R.id.btnClear);
        buttonDlt = view.findViewById(R.id.btnDlt);
        buttonPersen = view.findViewById(R.id.btnPersen);
        buttonKali = view.findViewById(R.id.btnKali);
        buttonKrg = view.findViewById(R.id.btnKurang);
        buttonTbh = view.findViewById(R.id.btnTambah);
        buttonBagi = view.findViewById(R.id.btnBagi);
        buttonHtg = view.findViewById(R.id.btnHitung);
        edt1 = view.findViewById(R.id.kolom1);
        edt2 = view.findViewById(R.id.kolom2);
        notif = view.findViewById(R.id.notifikasi);
        operator = view.findViewById(R.id.operan);
        Hhasil = view.findViewById(R.id.hasil);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+"9");
            }
        });
        buttonTtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt2.setText(edt2.getText()+".");
            }
        });

        buttonTbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 1;
                operator.setText("+");
                edt1.setText(edt2.getText());
                edt2.setText("");
                }
        });
        buttonKrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 2;
                operator.setText("-");
                edt1.setText(edt2.getText());
                edt2.setText("");
            }
        });
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 3;
                operator.setText("X");
                edt1.setText(edt2.getText());
                edt2.setText("");
            }
        });
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = 4;
                operator.setText("/");
                edt1.setText(edt2.getText());
                edt2.setText("");
            }
        });
        buttonPersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dbl = Double.parseDouble(edt2.getText().toString());
                dbl = dbl / 100;
                edt2.setText(dbl.toString());

            }
        });


        buttonHtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ck1 = edt1.getText().toString();
                ck2 = edt2.getText().toString();
                if ((ck1.equalsIgnoreCase("")) || (ck2.equalsIgnoreCase(""))) {
                    notif.setText("The column cannot be empty");
                }
                else {
                    double input1 = Double.parseDouble(edt1.getText().toString());
                    double input2 = Double.parseDouble(edt2.getText().toString());

                    switch (operation){
                        case 1:
                            hasilEnd = input1 + input2;
                            break;
                        case 2:
                            hasilEnd = input1 - input2;
                            break;
                        case 3:
                            hasilEnd = input1 * input2;
                            break;
                        case 4:
                            hasilEnd = input1 / input2;
                            break;
                    }
                    if (operation < 1){
                        Hhasil.setText("0");
                    }
                    else {
                        String hasilContext = String.valueOf(hasilEnd);
                        Hhasil.setText(hasilContext);
                        notif.setText("");
                    }
                }

            }
        });
        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                operator.setText("");
                notif.setText("");
                Hhasil.setText("");
            }
        });
        buttonDlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edt2.getText().toString();
                if (str.length() > 1){
                    str = str.substring(0, str.length() - 1);
                    edt2.setText(str);
                }
                else if (str.length() <=1 ){
                    edt2.setText("");
                }
            }
        });


        return view;
    }

}

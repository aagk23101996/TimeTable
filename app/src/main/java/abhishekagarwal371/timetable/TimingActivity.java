package abhishekagarwal371.timetable;

import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class TimingActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView t1;private Button bstart1;private Button bend1;
    private TextView t2;private Button bstart2;private Button bend2;
    private TextView t3;private Button bstart3;private Button bend3;
    private TextView t4;private Button bstart4;private Button bend4;
    private TextView t5;private Button bstart5;private Button bend5;
    private TextView t6;private Button bstart6;private Button bend6;
    private TextView t7;private Button bstart7;private Button bend7;
    private TextView t8;private Button bstart8;private Button bend8;
    private TextView t9;private Button bstart9;private Button bend9;
    private TextView t10;private Button bstart10;private Button bend10;
private static String[] timings={"-","-","-","-","-","-","-","-","-","-"};
    private String timingstring="a";
    private Drawable shapes;
    private Drawable shapes1;
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Set<String> g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_timing);
        toolbar=(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);

        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing1);
        collapsingToolbarLayout.setTitle("Enter Timings");
        t1=(TextView)findViewById(R.id.txtt1);t1.setText("Hour 1");
        bstart1=(Button)findViewById(R.id.buttton1);bend1=(Button)findViewById(R.id.freebuttton1);
        bstart2=(Button)findViewById(R.id.buttton2);bend2=(Button)findViewById(R.id.freebuttton2);
        bstart3=(Button)findViewById(R.id.buttton3);bend3=(Button)findViewById(R.id.freebuttton3);
        bstart4=(Button)findViewById(R.id.buttton4);bend4=(Button)findViewById(R.id.freebuttton4);
        bstart5=(Button)findViewById(R.id.buttton5);bend5=(Button)findViewById(R.id.freebuttton5);
        bstart6=(Button)findViewById(R.id.buttton6);bend6=(Button)findViewById(R.id.freebuttton6);
        bstart7=(Button)findViewById(R.id.buttton7);bend7=(Button)findViewById(R.id.freebuttton7);
        bstart8=(Button)findViewById(R.id.buttton8);bend8=(Button)findViewById(R.id.freebuttton8);
        bstart9=(Button)findViewById(R.id.buttton9);bend9=(Button)findViewById(R.id.freebuttton9);
        bstart10=(Button)findViewById(R.id.buttton10);bend10=(Button)findViewById(R.id.freebuttton10);
        t2=(TextView)findViewById(R.id.txtt2);t2.setText("Hour 2");
        t3=(TextView)findViewById(R.id.txtt3);t3.setText("Hour 3");
        t4=(TextView)findViewById(R.id.txtt4);t4.setText("Hour 4");
        t5=(TextView)findViewById(R.id.txtt5);t5.setText("Hour 5");
        t6=(TextView)findViewById(R.id.txtt6);t6.setText("Hour 6");
        t7=(TextView)findViewById(R.id.txtt7);t7.setText("Hour 7");
        t8=(TextView)findViewById(R.id.txtt8);t8.setText("Hour 8");
        t9=(TextView)findViewById(R.id.txtt9);t9.setText("Hour 9");
        t10=(TextView)findViewById(R.id.txtt10);t10.setText("Hour 10");
        bstart1.setText("Start Time");bend1.setText("End Time");
        bstart2.setText("Start Time");bend2.setText("End Time");
        bstart3.setText("Start Time");bend3.setText("End Time");
        bstart4.setText("Start Time");bend4.setText("End Time");
        bstart5.setText("Start Time");bend5.setText("End Time");
        bstart6.setText("Start Time");bend6.setText("End Time");
        bstart7.setText("Start Time");bend7.setText("End Time");
        bstart8.setText("Start Time");bend8.setText("End Time");
        bstart9.setText("Start Time");bend9.setText("End Time");
        bstart10.setText("Start Time");bend10.setText("End Time");
        shapes= ContextCompat.getDrawable(this,R.drawable.shape);
        shapes1=ContextCompat.getDrawable(this,R.drawable.shapes1);
        bstart1.setOnClickListener(this);bend1.setOnClickListener(this);
        bstart2.setOnClickListener(this);bend2.setOnClickListener(this);
        bstart3.setOnClickListener(this);bend3.setOnClickListener(this);
        bstart4.setOnClickListener(this);bend4.setOnClickListener(this);
        bstart5.setOnClickListener(this);bend5.setOnClickListener(this);
        bstart6.setOnClickListener(this);bend6.setOnClickListener(this);
        bstart7.setOnClickListener(this);bend7.setOnClickListener(this);
        bstart8.setOnClickListener(this);bend8.setOnClickListener(this);
        bstart9.setOnClickListener(this);bend9.setOnClickListener(this);
        bstart10.setOnClickListener(this);bend10.setOnClickListener(this);
    //    g = (TextView) findViewById(R.id.txtttt);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttton1:

                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                      timings[0]=hourOfDay+":"+minute;
                        bstart1.setBackground(shapes1);
                        bstart1.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd.show(getFragmentManager(),"Timepickerdialog");


                break;
            case R.id.buttton2:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd2 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[1]=hourOfDay+":"+minute;
                        bstart2.setBackground(shapes1);
                        bstart2.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd2.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton3:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd3 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[2]=hourOfDay+":"+minute;
                        bstart3.setBackground(shapes1);
                        bstart3.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd3.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton4:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd4 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[3]=hourOfDay+":"+minute;
                        bstart4.setBackground(shapes1);
                        bstart4.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd4.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton5:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd5 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[4]=hourOfDay+":"+minute;
                        bstart5.setBackground(shapes1);
                        bstart5.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd5.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton6:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd6 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[5]=hourOfDay+":"+minute;
                        bstart6.setBackground(shapes1);
                        bstart6.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd6.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton7:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd7 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[6]=hourOfDay+":"+minute;
                        bstart7.setBackground(shapes1);
                        bstart7.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd7.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton8:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd8 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[7]=hourOfDay+":"+minute;
                        bstart8.setBackground(shapes1);
                        bstart8.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd8.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton9:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd9 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[8]=hourOfDay+":"+minute;
                        bstart9.setBackground(shapes1);
                        bstart9.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd9.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.buttton10:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd10 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[9]=hourOfDay+":"+minute;
                        bstart10.setBackground(shapes1);
                        bstart10.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd10.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton1:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd01 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[0]+="-"+hourOfDay+":"+minute;
                        bend1.setBackground(shapes1);
                        bend1.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd01.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton2:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd02 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[1]+="-"+hourOfDay+":"+minute;
                        bend2.setBackground(shapes1);
                        bend2.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd02.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton3:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd03 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[2]+="-"+hourOfDay+":"+minute;
                        bend3.setBackground(shapes1);
                        bend3.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd03.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton4:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd04 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[3]+="-"+hourOfDay+":"+minute;
                        bend4.setBackground(shapes1);
                        bend4.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd04.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton5:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd05 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[4]+="-"+hourOfDay+":"+minute;
                        bend5.setBackground(shapes1);
                        bend5.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd05.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton6:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd06 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[5]+="-"+hourOfDay+":"+minute;
                        bend6.setBackground(shapes1);
                        bend6.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd06.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton7:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd07 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[6]+="-"+hourOfDay+":"+minute;
                        bend7.setBackground(shapes1);
                        bend7.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd07.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton8:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd08 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[7]+="-"+hourOfDay+":"+minute;
                        bend8.setBackground(shapes1);
                        bend8.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd08.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton9:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd09 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[8]+="-"+hourOfDay+":"+minute;
                        bend9.setBackground(shapes1);
                        bend9.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd09.show(getFragmentManager(),"Timepickerdialog");
                break;
            case R.id.freebuttton10:
                com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd010 = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
                        timings[9]+="-"+hourOfDay+":"+minute;
                        bend10.setBackground(shapes1);
                        bend10.setText(hourOfDay+":"+minute);
                    }

                }, 8, 5, 5, true);
                dpd010.show(getFragmentManager(),"Timepickerdialog");
                break;

        }


    }
    /*public void Timing(View view) {
        Calendar now = Calendar.getInstance();
        com.wdullaer.materialdatetimepicker.time.TimePickerDialog dpd = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(new com.wdullaer.materialdatetimepicker.time.TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(com.wdullaer.materialdatetimepicker.time.TimePickerDialog view, int hourOfDay, int minute, int second) {
g.setText("Hr:"+hourOfDay+" Mn:"+minute+" Sec"+second);
            }

        }, 5, 5, 5, false);
        dpd.show(getFragmentManager(),"Timepickerdialog");

}*/

    @Override
    protected void onPause() {
        super.onPause();
        timingstring=timings[0]+"/"+timings[1]+"/"+timings[2]+"/"+timings[3]+"/"+timings[4]+"/"+timings[5]+"/"+timings[6]+"/"+timings[7]+"/"+timings[8]+"/"+timings[9];
        PreferenceManager.getDefaultSharedPreferences(this).edit().putString(Stringss.StringSetd,timingstring).apply();
    }
}
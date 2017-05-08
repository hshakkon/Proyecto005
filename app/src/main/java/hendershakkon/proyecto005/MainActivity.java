package hendershakkon.proyecto005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1 ;
    private EditText et1,et2 ;
    private TextView tv1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView) findViewById(R.id.tv1);
        spinner1=(Spinner)findViewById(R.id.spinner);
        String []opciones={"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter <String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    //Eete método se ejecutará cuando se presione el botón borrar
    public void borrar(View view){
        et1.setText("");
        et2.setText("");
        tv1.setText("");
        spinner1.setSelection(0);
        et1.requestFocus();
    }
    //Este método se ejecutará cuando se presione el botón operar
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        //int nro1= Integer.parseInt(valor1);
        float nro1 = Float.parseFloat(valor1);
        //int nro2= Integer.parseInt(valor2);
        float nro2= Float.parseFloat(valor2);
        String selec=spinner1.getSelectedItem().toString();
        if (selec.equals("Sumar")) {
            //int suma=nro1+nro2;
            float suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv1.setText(resu);
        } else
        if (selec.equals("Restar")) {
            //int resta=nro1-nro2;
            float resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv1.setText(resu);
        } else
        if (selec.equals("Multiplicar")) {
            //int multi=nro1*nro2;
            float multi=nro1*nro2;
            String resu=String.valueOf(multi);
            tv1.setText(resu);
        } else
        if  (selec.equals("Dividir")) {
            //int divi=nro1/nro2;
            float divi=nro1/nro2;
            String resu=String.valueOf(divi);
            tv1.setText(resu);
        }


    }
}

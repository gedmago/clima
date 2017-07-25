package juanmanuel.com.clima;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //BluetoothAdapter adaptadorBluetooth;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        adaptadorBluetooth = BluetoothAdapter.getDefaultAdapter();
        if(!adaptadorBluetooth.isEnabled()){
            adaptadorBluetooth.enable();
        }
        */

        boton=(Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();

        if(id==R.id.item1){


            Toast.makeText(this,"Item1",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.item2){
            Toast.makeText(this,"Item2",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.item3){
            Toast.makeText(this,"Item3",Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v==boton){
            Intent i =new Intent(this,Lista.class);
            startActivity(i);
        }
    }
}

package juanmanuel.com.clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}

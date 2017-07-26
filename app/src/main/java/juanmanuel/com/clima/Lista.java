package juanmanuel.com.clima;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager miLinearLayoutManager=new LinearLayoutManager(this);
    private Adapter adapter;
    private List<PronosticoTiempo> lista=new ArrayList<PronosticoTiempo>();

    private String temp;
    private String tempMax;
    private String tempMin;
    private ParserJson objetoJsonParseado;

    private String cadenaJson="{\"coord\":\n" +
            "{\"lon\":145.77,\"lat\":-16.92},\n" +
            "\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04n\"}],\n" +
            "\"base\":\"cmc stations\",\n" +
            "\"main\":{\"temp\":293.25,\"pressure\":1019,\"humidity\":83,\"temp_min\":289.82,\"temp_max\":295.37},\n" +
            "\"wind\":{\"speed\":5.1,\"deg\":150},\n" +
            "\"clouds\":{\"all\":75},\n" +
            "\"rain\":{\"3h\":3},\n" +
            "\"dt\":1435658272,\n" +
            "\"sys\":{\"type\":1,\"id\":8166,\"message\":0.0166,\"country\":\"AU\",\"sunrise\":1435610796,\"sunset\":1435650870},\n" +
            "\"id\":2172797,\n" +
            "\"name\":\"Cairns\",\n" +
            "\"cod\":200}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        adapter=new Adapter(lista);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(miLinearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        objetoJsonParseado= new ParserJson(cadenaJson);

        temp=objetoJsonParseado.getTemp();
        tempMax=objetoJsonParseado.getTempMax();
        tempMin=objetoJsonParseado.getTempMin();

        for(int i=1;i<=20;i++) {
           lista.add(new PronosticoTiempo(temp, tempMax, tempMin));
        }

        adapter.notifyDataSetChanged();

    }
}

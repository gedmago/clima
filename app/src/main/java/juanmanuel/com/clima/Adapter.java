package juanmanuel.com.clima;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<PronosticoTiempo> lista;

    public Adapter(List<PronosticoTiempo> pronosticos){
        lista=pronosticos;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista,null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {

        PronosticoTiempo pronosticoDelItem=lista.get(position);
        holder.texto1.setText("                 Temperatura: "+pronosticoDelItem.getTemp());
        holder.texto2.setText("                 Temperatura max: "+pronosticoDelItem.getTempMax());
        holder.texto3.setText("                 Temperatura min: "+pronosticoDelItem.getTempMin());

    }

    @Override
    public int getItemCount() {

        return lista.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView icono;
        private TextView texto1;
        private TextView texto2;
        private TextView texto3;

        public ViewHolder(View itemView) {
            super(itemView);

            icono=(ImageView)itemView.findViewById(R.id.imageViewItem);
            texto1=(TextView)itemView.findViewById(R.id.textViewItem1);
            texto2=(TextView)itemView.findViewById(R.id.textViewItem2);
            texto3=(TextView)itemView.findViewById(R.id.textViewItem3);
        }
    }
}

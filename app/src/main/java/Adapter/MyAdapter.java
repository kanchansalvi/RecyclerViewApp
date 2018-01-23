package Adapter;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.kanchan.recyclerviewapp.recyclerviewapp.DetailsActivity;
import com.kanchan.recyclerviewapp.recyclerviewapp.R;

import java.util.ArrayList;
import java.util.List;

import Model.ListItem;

/**
 * Created by Deepkanchan-Salvi on 12/12/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItem){
    this.context = context;
    this.listItems = listItem;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).
                  inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
      holder.name.setText(listItem.getName());
      holder.description.setText(listItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView name;
        public  TextView description;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();

            ListItem item = listItems.get(position);
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name", item.getName());
            intent.putExtra("description", item.getDescription());
            //Toast.makeText(context,item.getName(),Toast.LENGTH_LONG).show();
            context.startActivity(intent);

        }
    }
}

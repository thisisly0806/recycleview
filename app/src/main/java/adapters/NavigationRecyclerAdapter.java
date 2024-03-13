package adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

import model.Navigation;

public class NavigationRecyclerAdapter extends RecyclerView.Adapter<NavigationRecyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<Navigation> navigations;
    //Khowir tajo Viewholder
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ImvThumb1;
        ImageView ImvThumb2;
        TextView txtName1;
        TextView txtName2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImvThumb1 = itemView.findViewById(R.id.ImvThumb1);
            ImvThumb2 = itemView.findViewById(R.id.ImvThumb2);
            txtName1 = itemView.findViewById(R.id.txtName1);
            txtName2 = itemView.findViewById(R.id.txtName2);
        }
    }
    public NavigationRecyclerAdapter(Context context, ArrayList<Navigation> navigations) {
        this.context = context;
        this.navigations = navigations;
    }
//Implement ViewHolder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ImvThumb1.setImageResource(navigations.get(position).getNavThumb1());
        holder.ImvThumb2.setImageResource(navigations.get(position).getNavThumb2());
        holder.txtName1.setText(navigations.get(position).getNavIconName1());
        holder.txtName2.setText(navigations.get(position).getNavIconName2());

    }

    @Override
    public int getItemCount() {
        return navigations.size();
    }

}

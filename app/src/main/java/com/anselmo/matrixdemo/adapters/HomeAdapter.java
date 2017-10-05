package com.anselmo.matrixdemo.adapters;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anselmo.matrixdemo.R;
import com.anselmo.matrixdemo.model.HomeItem;
import com.anselmo.matrixdemo.screens.MatrixActivity;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private Activity mContext;
    private List<HomeItem> itemsList;

    public HomeAdapter(Activity mContext, List<HomeItem> itemsList) {
        this.mContext = mContext;
        this.itemsList = itemsList;
    }

    @Override
    public HomeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new HomeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(HomeHolder holder, int position) {
        HomeItem item = itemsList.get(position);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class HomeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView title;

        public HomeHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.lbl_item_placeholder);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getLayoutPosition();

            Intent intentMatrix = new Intent(mContext, MatrixActivity.class);
            intentMatrix.putExtra("position", position);
            Log.i("POSITION", "" +position);
            mContext.startActivity(intentMatrix);
        }
    }
}

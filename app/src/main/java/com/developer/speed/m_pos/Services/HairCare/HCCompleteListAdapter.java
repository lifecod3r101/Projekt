package com.developer.speed.m_pos.Services.HairCare;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R;

import java.util.List;

public class HCCompleteListAdapter extends RecyclerView.Adapter<HCCompleteListAdapter.HCCompleteListViewHolder> {
    Context hcsCompleteContext;
    List<HCCompleteListProperties> hcsCompleteList;

    public HCCompleteListAdapter(Context hcsCompleteContext, List<HCCompleteListProperties> hcsCompleteList) {
        this.hcsCompleteContext = hcsCompleteContext;
        this.hcsCompleteList = hcsCompleteList;
    }

    @NonNull
    @Override
    public HCCompleteListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater hccInflater = LayoutInflater.from(viewGroup.getContext());
        View view = hccInflater.inflate(R.layout.hair_care_service_list_complete_card, null);
        return new HCCompleteListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HCCompleteListViewHolder hcCompleteListViewHolder, int i) {
        HCCompleteListProperties hcCLProperties = hcsCompleteList.get(i);
        hcCompleteListViewHolder.hcsCompleteCode.setText(hcCLProperties.getHcServCode());
        hcCompleteListViewHolder.hcsCompleteName.setText(hcCLProperties.getHcServName());
        hcCompleteListViewHolder.hcsCompleteCost.setText(String.valueOf((hcCLProperties.getHcServCost())));
    }

    @Override
    public int getItemCount() {
        return hcsCompleteList.size();
    }

    public class HCCompleteListViewHolder extends RecyclerView.ViewHolder {
        CardView hcsCompleteCard;
        TextView hcsCompleteCode, hcsCompleteName, hcsCompleteCost;

        public HCCompleteListViewHolder(View itemView) {
            super(itemView);
            hcsCompleteCard = itemView.findViewById(R.id.complete_list_hc_service_card);
            hcsCompleteCode = itemView.findViewById(R.id.complete_list_hc_service_code);
            hcsCompleteName = itemView.findViewById(R.id.complete_list_hc_service_name);
            hcsCompleteCost = itemView.findViewById(R.id.complete_list_hc_service_cost);
        }
    }
}

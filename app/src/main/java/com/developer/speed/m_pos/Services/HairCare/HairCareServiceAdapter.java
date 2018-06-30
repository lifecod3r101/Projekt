package com.developer.speed.m_pos.Services.HairCare;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.Services.HairCare.HairCareServiceAdapter.HairCareServiceViewHolder;

import java.util.List;

public class HairCareServiceAdapter extends Adapter<HairCareServiceViewHolder> {

    Context hairCareContext;
    List<HairCareServiceProperties> hairCareServicePropertiesList;

    public HairCareServiceAdapter(Context hairCareContext, List<HairCareServiceProperties> hairCareServicePropertiesList) {
        this.hairCareContext = hairCareContext;
        this.hairCareServicePropertiesList = hairCareServicePropertiesList;
    }

    @NonNull
    @Override
    public HairCareServiceAdapter.HairCareServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater hcInflater = LayoutInflater.from(parent.getContext());
        View view = hcInflater.inflate(layout.hair_care_services_card, null);
        return new HairCareServiceAdapter.HairCareServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HairCareServiceAdapter.HairCareServiceViewHolder holder, int position) {
        HairCareServiceProperties hcsProperties = this.hairCareServicePropertiesList.get(position);
        holder.hcsCode.setText(hcsProperties.getHaircareCode());
        holder.hcsName.setText(hcsProperties.getHaircareName());
        holder.hcsPrice.setText(Double.toString(hcsProperties.getHaircareCost()));
        holder.hcsCard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.hcsCard.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.hairCareServicePropertiesList.size();
    }

    public class HairCareServiceViewHolder extends ViewHolder {
        CardView hcsCard;
        TextView hcsCode, hcsName, hcsPrice;

        public HairCareServiceViewHolder(View itemView) {
            super(itemView);
            this.hcsCard = itemView.findViewById(id.hair_care_card);
            this.hcsCode = itemView.findViewById(id.service_code_hc);
            this.hcsName = itemView.findViewById(id.service_name_hc);
            this.hcsPrice = itemView.findViewById(id.service_cost_hc);
        }
    }
}

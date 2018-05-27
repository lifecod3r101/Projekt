package com.developer.speed.m_pos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DebtRecordAdapter extends RecyclerView.Adapter<DebtRecordAdapter.DebtRecordViewHolder>
{
    public class DebtRecordViewHolder extends RecyclerView.ViewHolder
    {
        TextView debtName,debtPhone,debtDate;
        CardView debtRecordCard;
        public DebtRecordViewHolder(View itemView)
        {
            super(itemView);
            debtName=itemView.findViewById(R.id.debt_name);
            debtPhone=itemView.findViewById(R.id.debt_phone_number);
            debtDate=itemView.findViewById(R.id.debt_date);
        }
    }
    private Context debtContext;
    private List<DebtRecordProperty> myDebtInformation;
    public DebtRecordAdapter(Context debtContext,List<DebtRecordProperty>myDebtInformation)
    {
        this.debtContext=debtContext;
        this.myDebtInformation=myDebtInformation;
    }
    @NonNull
    @Override
    public DebtRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater debtSectInflater=LayoutInflater.from(debtContext);
        View view=debtSectInflater.inflate(R.layout.debt_record_recycler_layout,null);
        return new DebtRecordViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull DebtRecordViewHolder holder, int position)
    {
        DebtRecordProperty myDebtProperty=myDebtInformation.get(position);
        holder.debtName.setText(myDebtProperty.getDebtName());
        holder.debtPhone.setText(myDebtProperty.getDebtPhone());
        holder.debtDate.setText(String.valueOf(myDebtProperty.getDebtDate()));
        holder.debtRecordCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
    @Override
    public int getItemCount()
    {
        return myDebtInformation.size();
    }
}

package com.developer.speed.m_pos.Debt_Records;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Debt_Records.DebtRecordAdapter.DebtRecordViewHolder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.List;

public class DebtRecordAdapter extends RecyclerView.Adapter<DebtRecordViewHolder> {
    private final Context debtContext;
    private final List<DebtRecordProperty> myDebtInformation;

    @NonNull
    @Override
    public DebtRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater debtSectInflater = LayoutInflater.from(this.debtContext);
        View view = debtSectInflater.inflate(layout.debt_record_recycler_layout, null);
        return new DebtRecordViewHolder(view);
    }
    public DebtRecordAdapter(Context debtContext,List<DebtRecordProperty>myDebtInformation)
    {
        this.debtContext=debtContext;
        this.myDebtInformation=myDebtInformation;
    }

    @Override
    public void onBindViewHolder(@NonNull DebtRecordViewHolder holder, int position)
    {
        DebtRecordProperty myDebtProperty = this.myDebtInformation.get(position);
        holder.debtName.setText(myDebtProperty.getDebtName());
        holder.debtPhone.setText(myDebtProperty.getDebtPhone());
        holder.debtDate.setText(String.valueOf(myDebtProperty.getDebtDate()));
        holder.debtRecordCard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });
    }

    @Override
    public int getItemCount()
    {
        return this.myDebtInformation.size();
    }

    public class DebtRecordViewHolder extends ViewHolder {
        TextView debtName, debtPhone, debtDate;
        CardView debtRecordCard;

        public DebtRecordViewHolder(View itemView) {
            super(itemView);
            this.debtName = itemView.findViewById(id.debt_name);
            this.debtPhone = itemView.findViewById(id.debt_phone_number);
            this.debtDate = itemView.findViewById(id.debt_date);
        }
    }
}


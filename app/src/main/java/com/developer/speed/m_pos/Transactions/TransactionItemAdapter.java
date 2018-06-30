package com.developer.speed.m_pos.Transactions;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.Transactions.TransactionItemAdapter.TransactionItemViewHolder;

import java.util.List;

public class TransactionItemAdapter extends Adapter<TransactionItemViewHolder> {
    List<TransactionItemProperties> transactionItemPropertiesList;
    Context transactionContext;

    public TransactionItemAdapter(Context transactionContext, List<TransactionItemProperties> transactionItemPropertiesList) {
        this.transactionContext = transactionContext;
        this.transactionItemPropertiesList = transactionItemPropertiesList;
    }

    @NonNull
    @Override
    public TransactionItemAdapter.TransactionItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater transactionItemInflater = LayoutInflater.from(this.transactionContext);
        View view = transactionItemInflater.inflate(layout.transaction_item_card_layout, null);
        return new TransactionItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionItemAdapter.TransactionItemViewHolder holder, int position) {
        TransactionItemProperties transactItemProperties = this.transactionItemPropertiesList.get(position);
        holder.transactionItemCode.setText(transactItemProperties.getTransactItemCode());
        holder.transactionItemName.setText(transactItemProperties.getTransactItemName());
        holder.transactionItemTotalQuantity.setText(transactItemProperties.getTransactTotalQuantity());
        holder.transactionItemTotalCost.setText(transactItemProperties.getTransactItemCode());
    }

    @Override
    public int getItemCount() {
        return this.transactionItemPropertiesList.size();
    }

    public class TransactionItemViewHolder extends ViewHolder {
        CardView transactionItemCard;
        TextView transactionItemCode, transactionItemName, transactionItemTotalQuantity, transactionItemTotalCost;

        public TransactionItemViewHolder(View itemView) {
            super(itemView);
            this.transactionItemCard = itemView.findViewById(id.transaction_item_card);
            this.transactionItemCode = itemView.findViewById(id.transaction_item_code);
            this.transactionItemName = itemView.findViewById(id.transaction_item_name);
            this.transactionItemTotalQuantity = itemView.findViewById(id.transaction_item_total_quantity);
            this.transactionItemTotalCost = itemView.findViewById(id.transaction_item_total_cost);
        }
    }
}

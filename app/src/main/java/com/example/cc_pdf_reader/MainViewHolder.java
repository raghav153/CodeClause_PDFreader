package com.example.cc_pdf_reader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    public TextView pdf_name;
    public CardView pdf_cardView;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        pdf_name = itemView.findViewById(R.id.pdf_name);
        pdf_cardView = itemView.findViewById(R.id.pdf_cardview);
    }
}

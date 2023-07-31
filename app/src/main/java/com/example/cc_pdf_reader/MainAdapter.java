package com.example.cc_pdf_reader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter <MainViewHolder> {

    private Context context;
    private List<File> pdffiles;

    public MainAdapter(Context context, List<File> pdf_files) {
        this.context = context;
        this.pdffiles = pdf_files;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.rv_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        holder.pdf_name.setText(pdffiles.get(position).getName());
        holder.pdf_name.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return pdffiles.size();
    }
}

package com.wtiinfo.adapters2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ProductsAdapter extends BaseAdapter {

    private List<Product> products;
    private LayoutInflater layoutInflater;

    //utilitario
    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public ProductsAdapter(Context context, List<Product> products) {
        this.products = products;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.adapter_produtos, parent, false);
        Product product = products.get(position);

        TextView txtName = view.findViewById(R.id.txtname);
        TextView txtPrice = view.findViewById(R.id.txtprice);

        txtName.setText(product.getName());
        txtPrice.setText(nf.format(product.getPrice()));

        return view;
    }
}

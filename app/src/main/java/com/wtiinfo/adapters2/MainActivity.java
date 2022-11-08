package com.wtiinfo.adapters2;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private ProductsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ProductsAdapter(this, Product.getProdutos());

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Product product = (Product) adapter.getItem(position);
        Toast.makeText(this, "Produto clicado: " + product.getName(), Toast.LENGTH_LONG).show();
    }
}
package com.skill_factory.unit9.adapter

import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.skill_factory.unit9.model.Item

class ProductAdapter() : ListDelegationAdapter<List<Item>>() {

    init {
        delegatesManager.addDelegate(ProductDelegateAdapter())
        delegatesManager.addDelegate(AdDelegateAdapter())
    }

    override fun setItems(items: List<Item>?) {
        super.setItems(items)
        notifyDataSetChanged()
    }
}
package com.pipe.d.dev.recommendarch.promoModule.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.pipe.d.dev.recommendarch.BR
import com.pipe.d.dev.recommendarch.R
import com.pipe.d.dev.recommendarch.common.entities.Promo
import com.pipe.d.dev.recommendarch.databinding.ItemPromoBinding
import com.pipe.d.dev.recommendarch.promoModule.view.adapters.PromoDiff

/****
 * Project: Wines
 * From: com.cursosant.wines
 * Created by Alain Nicolás Tello on 06/02/24 at 20:23
 * All rights reserved 2024.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Coupons on my Website:
 * www.alainnicolastello.com
 ***/
class PromoListAdapter(diff: PromoDiff) : ListAdapter<Promo, RecyclerView.ViewHolder>(diff) {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_promo, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val promo = getItem(position)
        with((holder as ViewHolder)) {
            binding?.setVariable(BR.promo, promo)
            binding?.executePendingBindings()
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //val binding = ItemPromoBinding.bind(view)
        val binding = DataBindingUtil.bind<ItemPromoBinding>(view)
    }
}
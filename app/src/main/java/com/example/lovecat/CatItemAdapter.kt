package com.example.lovecat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.RequestOptions
import com.example.lovecat.data.CatModelItem
import com.example.lovecat.databinding.ItemLayoutBinding

class CatItemAdapter : ListAdapter<CatModelItem, CatItemAdapter.CatViewHolder>(object :
    DiffUtil.ItemCallback<CatModelItem>() {
    override fun areItemsTheSame(oldItem: CatModelItem, newItem: CatModelItem) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: CatModelItem, newItem: CatModelItem) =
        oldItem == newItem
}) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class CatViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.ivAlbum
        fun bind(item: CatModelItem) {
            // TODO: 고양이 사진 연결하기
            Glide.with(imageView)
                .load(item.url)
                .transition(withCrossFade())
                .thumbnail(
                    Glide.with(imageView)
                        .load(R.drawable.loading)    // loading은 GIF 파일
                )
                .into(imageView)
        }
    }
}
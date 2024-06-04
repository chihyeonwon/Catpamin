package com.example.lovecat

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.example.lovecat.api.RetrofitInstance
import com.example.lovecat.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            catButton.setOnClickListener {

                CoroutineScope(Dispatchers.Main).launch {
                    runCatching {
                        val result =
                            withContext(Dispatchers.IO) { RetrofitInstance.service.getImages(num = 4) }

                        Glide.with(this@MainActivity).load(result[0].url).thumbnail(
                            Glide.with(this@MainActivity)
                                .load(R.drawable.loading)    // loading은 GIF 파일
                        ).transition(
                            withCrossFade()
                        ).into(binding.ivAlbum1)
                        Glide.with(this@MainActivity).load(result[1].url).thumbnail(
                            Glide.with(this@MainActivity)
                                .load(R.drawable.loading)    // loading은 GIF 파일
                        ).transition(
                            withCrossFade()
                        ).into(binding.ivAlbum2)
                        Glide.with(this@MainActivity).load(result[2].url).thumbnail(
                            Glide.with(this@MainActivity)
                                .load(R.drawable.loading)    // loading은 GIF 파일
                        ).transition(
                            withCrossFade()
                        ).into(binding.ivAlbum3)
                        Glide.with(this@MainActivity).load(result[3].url).thumbnail(
                            Glide.with(this@MainActivity)
                                .load(R.drawable.loading)    // loading은 GIF 파일
                        ).transition(
                            withCrossFade()
                        ).into(binding.ivAlbum4)

                        Toast.makeText(
                            this@MainActivity,
                            "새로운 고양이 사진을 가져옵니다",
                            Toast.LENGTH_SHORT
                        ).show()
                    }.onFailure {
                        Toast.makeText(
                            this@MainActivity,
                            "고양이 이미지를 가져오는데 실패했습니다. 잠시 후 다시 이용해주세요.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}

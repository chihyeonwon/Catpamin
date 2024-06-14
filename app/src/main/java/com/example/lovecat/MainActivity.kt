package com.example.lovecat

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
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

    private val itemAdapter by lazy { CatItemAdapter() } // CatItemAdapter를 by lazy로 생성

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.list.adapter = itemAdapter

        with(binding) {

            catButton.setOnClickListener {

                lifecycleScope.launch {
                    runCatching {
                        // 10개의 고양이 사진 정보를 받아와 result 변수에 저장(Dispachers.IO에서 작업을 수행할 수 있도록 withContext를 활용)
                        val result =
                            withContext(Dispatchers.IO) { RetrofitInstance.service.getImages(num = 10) }

                        // adapter에 submitList를 이용해 result 변수에 저장된 이미지 리스트를 적용
                        itemAdapter.submitList(result)

                        Toast.makeText(
                            this@MainActivity, "새로운 고양이 사진을 가져옵니다", Toast.LENGTH_SHORT
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

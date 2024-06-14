## 1,2주차
## 고양이 앨범을 꾸며 보아요.🐱‍👤 
![2024-06-04 17;41;00](https://github.com/chihyeonwon/LoveCat/assets/58906858/5f44242f-9a8a-49c6-b105-064a77a687df)

TextView 설정은 결과물 예시를 참고하여 설정해 주세요.     
Size : 30sp   
Style : Bold     
ImageView 로 고양이 사진이 위치할 사진 위치를 설정해 주세요.    
ImageView의 id는 iv_album_1, iv_album_2, iv_album_3, iv_album_4로 지어 주세요.     
ImageView 의 설정은 결과물 예시를 참고하여 설정해 주세요.    
shape="rectangle"     
color="#FFFFFF"    
radius="10dp"     

## 고양이 이미지를 연결해 보아요.🤳       
res/drawable 폴더 아래에 아무 고양이 사진 4개를 추가해 주세요.    
JPEG, PNG, BMP 권장, 고양이 사진이 없다면 아무 사진이나 괜찮아요.   
추가한 사진을 ImageView 화면과 연결해주세요.      
  
## LoveCat 앱을 실행     
안드로이드 스튜디오 상단 toolbar의 run app 버튼을 눌러 LoveCat 앱 실행 확인      
LoveCat 프로젝트 폴더를 압축하고 제출 방법 확인하여 제출해 주세요.         

## 결과물 예시
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/6a21a2b5-bfab-42a7-a147-b8e5452d4ee4)

## 숙제 제출 방법
1. LoveCat 프로젝트 폴더를 압축해서 제출해 주세요.    
2. 용량이 너무 클 경우 안드로이드 스튜디오 > Build > Clean Project 후 압축해 주셔도 됩니다.    
3. 압축 파일의 이름을 [강의 제목_이름]으로 변경한 후 제출해주세요.      
    - 예시 : 안드로이드 첫 걸음_황성희.zip       

## 제출 시 주의 사항 
1. 반드시 코드를 모두 작성하고, 제출 전에 코드 정렬을 진행해 주세요.     
        - 코드 정렬    
        1. Windows : `Ctrl + Alt + L`   
        2. macOS : `Option + Cmd + L`   
2. xml 파일 이름과 id 이름은 스네이크 케이스를 따라주세요.    
    - 스네이크 케이스란 모든 단어를 소문자로 표기하고, 단어를 언더바(_) 로 연결하는 방법을 의미해요.    
    - 예시 : `activity_main.xml` , `@+id/iv_cat`   
3. 클래스와 변수명은 카멜 케이스를 따라주세요.🐱‍🐉     
    - 카멜 케이스(camelCase)란 첫 단어를 소문자로 시작하고, 이후의 각 단어의 첫 글자는 대문자로 표기하는 방법을 의미합니다.    
    각 단어 사이에 공백이나 언더바(_)를 사용하지 않습니다.    
    - 예시 : `teamSparta` , `iLoveYou`     

## 레이아웃 완성
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/86e3ed66-e465-4914-ba50-c6884f58a574)
```
걸린시간 5분.
```
  
## 2주차 숙제 시작하기 
#### 1. 지난 숙제인 LoveCat 프로젝트에 고양이 서버 연결을 위해 환경을 준비해 보아요.     
🐈고양이 사진을 제공하는 “https://thecatapi.com/”의 고양이 사진을 직접 연동해 볼게요!          
     
Android Studio의 Recent에서 LoveCat 프로젝트를 다시 열어보아요.         
서버 연결을 위해선 Retrofit 라이브러리가 필요해요. build.gradle.kts(Moule:app) 파일에 Retrofit 라이브러리를 추가해 보아요. 혹시 잊어버리신 분은 아래 2주차 강의 자료 링크를 참고해 보세요.     

## 📕2주차 강의 자료 소통하는 서비스, Retrofit의 힘! - 2주차     
AndroidManifest.xml 파일에 인터넷 사용 권한을 추가해 주세요.      
API를 생성해 보아요. https://thecatapi.com/에 접속해서 “Get Your API Key”메뉴에 들어가서 “무료” 계정에 가입해고 API를 발급받으세요. (API키는 가입한 Email 계정에서 확인 가능)     
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/268bac32-6113-4f16-a219-6567b19814d1)

## 숙제 요구 사항
#### 2. Cat API와 연동하기     
RetrofitInstance.kt와 CatService.kt를 만들어주세요.    
RetrofitInstance.kt      
BASE_URL을 "https://api.thecatapi.com/" 로 설정해 주세요.     
CatService.kt     
API와 연결하기 위한 코드를 작성해주세요.     
API_KEY는 회원 가입 후 E-mail로 전달받은 Key를 입력해 주세요.     
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/ceb9b535-e3bf-4f88-8416-26438b3b849b)

data 폴더를 만들어 Json to Kotlin 플러그인을 활용해 CatModel.kt을 만들어 주세요.    
변환할 Json 포멧    
```json
[
  {
    "id": "ebv",
    "url": "https://cdn2.thecatapi.com/images/ebv.jpg",
    "width": 176,
    "height": 540
  }
]
```

#### 3. 서버에서 새로운 고양이 그림을 받아올 버튼 연결하기
activity_main.xml에 Button을 추가해 주세요.       
- id : “cat_button”     
- MainActivity.kt의 onCreate 함수 마지막에 cat_button의 setOnClickListener를 추가해 주세요.    
- setOnClickListener 안에 Retrofit을 통해 Image를 받아오도록 아래 굵은 코드를 추가해 주세요      
```kotlin
binding.catButton.setOnClickListener {
     lifecycleScope.launch {
         RetrofitInstance.service.getImages(num = 4)
     }
}
```

#### 이미지 연결을 위한 Glide 세팅, 사용법   
🐈 Glide : 이후 수업에서 다룹니다.       
Glide는 안드로이드에서 이미지를 빠르고 효율적으로 불러올 수 있게 도와주는 라이브러리로 사용 방법도 간단하고,      
확장성도 넓어서 이미 메이저하게 사용되고 있는 라이브러리입니다.     

서버에서 받아온 result를 ImageView에 연결하기 위해 Glide 라이브러리를 build.gradle.kts(Moule:app) 마지막에 추가해 주세요.    
```kotlin
implementation("com.github.bumptech.glide:glide:4.14.0")
annotationProcessor("com.github.bumptech.glide:compiler:4.14.0")
```

Glide를 활용해 result에 있는 이미지를 ImageView에 연결해 보세요.
```kotlin
    Glide.with(this@MainActivity).load(result[0].url).into(binding.ivAlbum1)
    Glide.with(this@MainActivity).load(result[1].url).into(binding.ivAlbum2)
    Glide.with(this@MainActivity).load(result[2].url).into(binding.ivAlbum3)
    Glide.with(this@MainActivity).load(result[3].url).into(binding.ivAlbum4)
```
[선택] 좀 더 자연스러운 사용자 UI 제공을 위해 Glide에 withCrossFade 옵션을 추가해 보세요. 
```kotlin
Glide.with(this@MainActivity).load(result[0].url)
                        .transition(withCrossFade()).into(binding.ivAlbum1)
```
## 서버에서 이미지 데이터 가져오는 고양이 앨범
![2024-06-04 17;41;00](https://github.com/chihyeonwon/LoveCat/assets/58906858/0b995ac0-e878-4c0e-baae-47cd81a5da9b)

## 4주차 문제
고양이 리스트 보여주기

[지시사항]
#### 1. 숙제 시작하기 - 한번에 많은 고양이 사진을 서버로부터 받아 오세요.    
- 지난 번 숙제 열기 : Android Studio의 Recent에서 LoveCat 프로젝트를 다시 열어보아요.      
- catButton 클릭시, CatService.kt의 getImages 함수 안의 num 인자를 변경하여 한번에 “10”개의 고양이 사진 정보를 받아와 result 변수에 저장하세요.     
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/e3895d82-3c0c-4c13-9a64-ed1078d532c8)
      
숙제 요구 사항      
#### 2. 10마리의 고양이 사진을 리스트로 화면에 출력해 주세요.       
- activity_main.xml의 기존 4개의 고양이 앨범 ImageView를 삭제하세요.      
- 기존의 고양이 앨범 TextView와 Button은 알맞은 위치로 이동해 주세요.      
- 나머지 적절한 공간에 RecyclerView를 추가해 보아요      
- id는 “list”로 지으세요.    
- 넓이를 가득 채우게 설정해 주세요.      
- app:layoutManager를 “androidx.recyclerview.widget.GridLayoutManager”로 설정해 주세요.     
- app:spanCount(가로에 보일 아이템의 갯수)를 “2”로 변경해 주세요.     
        
#### 3. RecyclerView와 Adapter를 연결해 주세요.      
- 이제 RecyclerView와 고양이 10마리를 이어줄 CatItemAdapter.kt 파일을 만들어 주세요.      
- ListAdapter의 골격이 되는 하단 코드를 CatItemAdapter.kt에 추가해 주세요. (빨간 줄은 Alt+Enter로 import 하세요)     
```kotlin
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
        }
    }
}
```
- 고양이 앨범을 출력할 앨범 Item_layout.xml을 layout 폴더 안에 추가해 주세요.    
- ImageView의 id는 “iv_album”로 지어주세요.
- ImageView에는 지난 과제에서 적용했던 round_background, clipToOutline, elevation, scaleType 등 다양한 속성들을 활용해 꾸며 주세요.
- CatItemAdapter 안의 CatViewHolder의 bind 함수를 완성해 주세요.
- Glide를 활용하여 imageView에 cat 이미지를 load해 주세요.
- 다양한 transition effect도 활용해 보세요.
#### [참조] by lazy
- by lazy는 초기화를 필요한 순간까지 지연시키며, 이는 메모리 절약과 성능 최적화에 도움을 줍니다. 해당 속성은 처음 접근할 때 단 한 번만 초기화되고, 이후에는 재사용됩니다.
      
#### 4. RecyclerView와 Adapter를 연결해 보아요.
- 기존의 imageView에 4개의 고양이 사진을 출력하는 코드는 삭제해 주세요.
- MainActivity안에서 CatItemAdapter를 by lazy로 생성해 itemAdapter 변수에 담아 주세요.
- MainActivity의 onCreate 메서드 안에서 binding.list의 adapter에 방금 만든 변수 itemAdapter를 연결해 주세요.
- cat_button의 setOnClickListener 안에서 Retrofit을 통해 Image를 10개씩 받아오도록 num값을 수정해 주세요.
      
#### 5. 효율성을 위해 코루틴을 적용해 보세요.
- Image를 서버에서 받아올 때 코루틴의 Dispachers.IO에서 작업을 수행할 수 있도록 withContext를 활용해 보세요.
- 서버에서 받아온 이미지 리스트를 adapter의 submitList를 활용해 itemAdapter에 적용해 주세요.

#### 4주차 과제 완성 고양이 리스트 (서버에서 데이터 받아서 리사이클러뷰 에 뿌리기)
![2024-06-15 03;17;57](https://github.com/chihyeonwon/LoveCat/assets/58906858/4173c127-3bc9-47e1-b4a8-12c4e8ea0958)
#### minSdk 30 -> 31 로 변경 (ImageView의 clipToOutline 속성이 31 이상부터 가능하기 때문)
![2024-06-15 04;03;02](https://github.com/chihyeonwon/LoveCat/assets/58906858/bc188d50-6222-4625-b410-baab741ce413)

## ** 참고자료 ** 
[Gson @SerializedName 어노테이션에 대한 고찰](https://velog.io/@yeonank/Gson-SerializedName-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98%EC%9D%B4-%EB%B6%99%EC%9D%80-%ED%81%B4%EB%9E%98%EC%8A%A4%EB%8A%94-%EC%96%B4%EB%96%BB%EA%B2%8C-%EC%83%9D%EC%84%B1%ED%95%B4%EC%95%BC-%ED%95%A0%EA%B9%8C)     
[DiffUtil, ListAdpater.submitList()](https://velog.io/@l2hyunwoo/Android-RecyclerView-DiffUtil-ListAdapter)        










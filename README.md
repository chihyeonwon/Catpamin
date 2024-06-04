## 고양이 앨범을 꾸며 보아요.🐱‍👤   
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
  
## 숙제 시작하기 - 지난 숙제인 LoveCat 프로젝트에 고양이 서버 연결을 위해 환경을 준비해 보아요.     
🐈고양이 사진을 제공하는 “https://thecatapi.com/”의 고양이 사진을 직접 연동해 볼게요!      
     
Android Studio의 Recent에서 LoveCat 프로젝트를 다시 열어보아요.      
서버 연결을 위해선 Retrofit 라이브러리가 필요해요. build.gradle.kts(Moule:app) 파일에 Retrofit 라이브러리를 추가해 보아요. 혹시 잊어버리신 분은 아래 2주차 강의 자료 링크를 참고해 보세요.     

## 📕2주차 강의 자료 소통하는 서비스, Retrofit의 힘! - 2주차     
AndroidManifest.xml 파일에 인터넷 사용 권한을 추가해 주세요.      
API를 생성해 보아요. https://thecatapi.com/에 접속해서 “Get Your API Key”메뉴에 들어가서 “무료” 계정에 가입해고 API를 발급받으세요. (API키는 가입한 Email 계정에서 확인 가능)     
![image](https://github.com/chihyeonwon/LoveCat/assets/58906858/268bac32-6113-4f16-a219-6567b19814d1)

## 숙제 요구 사항
2. Cat API와 연동하기     
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






















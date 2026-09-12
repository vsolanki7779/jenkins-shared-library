def call(String Image_name , String Tag_name){
  echo "Deloying the Container..."
  sh "docker run -d -p 8000:8000 ${Image_name}:${Tag_name}"
  echo "Deployment Success"
}

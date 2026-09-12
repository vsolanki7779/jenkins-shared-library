def call(String Image_name,String Tag_name){
  echo "Building the Image:"
  sh "docker build -t ${Image_name}:${Tag_name} ."
  echo "Build Image Successfull!!"
}

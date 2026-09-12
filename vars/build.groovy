def build(String Image_name){
  echo "Building the Image:"
  sh "docker build -t Image_name ."
  echo "Build Image Successfull!!"
}

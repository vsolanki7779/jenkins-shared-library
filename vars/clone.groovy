def call(String URL , String BRANCH){
   echo "Cloning Code..."
   git url: URL , branch: BRANCH
   echo "Cloning Code Successfull..."
}


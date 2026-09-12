def call(String Image_name , String Tag_name){
    echo "Pushing Image to DockerHub"
    withCredentials([usernamePassword('credentialsId':'docker-hub-cred',
    passwordVariable:'dockerHubPass',
    usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker image tag ${Image_name}:${Tag_name} ${env.dockerHubUser}/${Image_name}:${Tag_name}"
    sh "docker push ${env.dockerHubUser}/${Image_name}:${Tag_name}"}
    echo "Push Image Successfull"
}


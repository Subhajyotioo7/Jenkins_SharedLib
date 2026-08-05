// Define function
//def call(String ProjectName, String ImageTag){
//  sh "docker build -t ${ProjectName}:${ImageTag} ."
//}
def call(String ImageName, String ImageTag, String DockerHubUser){
    sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}

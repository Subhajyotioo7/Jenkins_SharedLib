// Define function
def call(String ProjectName, String ImageTag){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}

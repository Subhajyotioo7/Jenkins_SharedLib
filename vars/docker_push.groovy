// vars/docker_push.groovy
def call(String dockerhubuser, String Project, String ImageTag) {
    withCredentials([usernamePassword(credentialsId: 'dockerHubCreds', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
    }
}

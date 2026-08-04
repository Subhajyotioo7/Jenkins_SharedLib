// vars/docker_push.groovy
def call(String dockerhubuser, String Project, String ImageTag) {
    withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'DOCKERHUB_USER', passwordVariable: 'DOCKERHUB_PASS')]) {
        sh "docker login -u ${DOCKERHUB_USER} -p ${DOCKERHUB_PASS}"
        sh "docker push ${DOCKERHUB_USER}/${Project}:${ImageTag}"
    }
}

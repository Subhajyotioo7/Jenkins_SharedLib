def call(){
    script {
        timeout(time: 5, unit: 'MINUTES') {
            def qg = waitForQualityGate()
            if (qg.status != 'OK') {
                echo "⚠️ WARNING: SonarQube Quality Gate failed with status: ${qg.status}"
                echo "Pipeline will continue anyway (non-blocking mode)."
                currentBuild.result = 'UNSTABLE'
            } else {
                echo "✅ SonarQube Quality Gate passed."
            }
        }
    }
}

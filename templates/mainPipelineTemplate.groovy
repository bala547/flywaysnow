void call() {
     stage('Git Checkout') {
        checkoutRepo()
     }
     stage('Install Flyway') {
        installFlyway()
     }
     stage('Run Flyway Migrations') {
        runFlywayMigrations()
     }
}

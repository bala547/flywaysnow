pipeline {
    agent any
    environment {
        SNOWFLAKE_URL = "https://ni02885.ap-southeast-1.snowflakecomputing.com"
        SNOWFLAKE_USER = "bala547"
        SNOWFLAKE_PASSWORD = "BALUvarun3."
        FLYWAY_VERSION = "10.17.3" 
        JAVA_TOOL_OPTIONS = "--add-opens=java.base/java.nio=ALL-UNNAMED"
    }

    libraries{
    checkoutRepo.groovy
    installFlyway.groovy
    runFlywayMigrations.groovy   
    }
}

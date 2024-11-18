pipeline {
    agent any
    environment {
        SNOWFLAKE_URL = "${SNOWFLAKE_URL}"
        SNOWFLAKE_USER = "${SNOWFLAKE_USERNAME}"
        SNOWFLAKE_PASSWORD = "${SNOWFLAKE_PASSWORD}"
        FLYWAY_VERSION = "10.17.3" 
        JAVA_TOOL_OPTIONS = "--add-opens=java.base/java.nio=ALL-UNNAMED"
    }

    template = 'mainPipelineTemplate.groovy'
}

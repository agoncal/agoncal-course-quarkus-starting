#!/usr/bin/env bash
mvn -U io.quarkus:quarkus-maven-plugin:create \
        -DprojectGroupId=org.agoncal.quarkus.starting \
        -DprojectArtifactId=rest-book \
        -DclassName="org.agoncal.quarkus.starting.BookResource" \
        -Dpath="/api/books" \
        -Dextensions="resteasy-jsonb"

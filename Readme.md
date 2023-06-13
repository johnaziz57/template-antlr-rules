
Used this command to add `antlr` to maven local repo

```
mvn install:install-file \
-Dfile='/Users/john/Desktop/antlr-4.13.0-complete.jar' \
-DgroupId=org.antlr \
-DartifactId=antlr4-runtime \
-Dversion=4.13.0 \
-Dpackaging=jar \
-DgeneratePom=true
```
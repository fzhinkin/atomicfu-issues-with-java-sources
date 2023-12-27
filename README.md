When `atomicfu` is applied to a project containing both Kotlin and Java sources, classes compiled from the Java sources are missing from the resulting Jar (or runtime classpath).

How to reproduce the issue:

```shell
./gradlew -PatomicFuVersion=0.23.1 clean run
```

With versions prior to `0.21.0` everything seems to work find:
```shell
./gradlew -PatomicFuVersion=0.20.2 clean run
```

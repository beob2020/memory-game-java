#!/usr/bin/env bash

if ls *.class 1> /dev/null 2>&1; then
  echo "Cleaning Directory......"
  rm *.class
  export DISPLAY=:1.0
  (pkill java || true)
  echo "Compiling..."
  javac src/Main.java
  echo "Executing Program..."
  java -Dsun.java2d.xrender=false Main
else
  export DISPLAY=:1.0
  (pkill java || true)
  echo "Compiling..."
  javac src/Main.java
  echo "Executing Program..."
  java -Dsun.java2d.xrender=false Main
fi
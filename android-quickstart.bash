#!/bin/bash -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

pushd "$DIR" > /dev/null

 mvn archetype:generate \
  -DarchetypeArtifactId=android-quickstart \
  -DarchetypeGroupId=de.akquinet.android.archetypes \
  -DarchetypeVersion=1.0.11 \
  -DgroupId=com.github.hborders.android.maven \
  -DartifactId=android-maven-talk-apk \
  -Dandroid-plugin-version=3.8.2 \
  -Dplatform=19


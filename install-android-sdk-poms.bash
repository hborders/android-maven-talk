#!/bin/bash -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

pushd "$DIR"/tools/maven-android-sdk-deployer > /dev/null

mvn install -P 4.4

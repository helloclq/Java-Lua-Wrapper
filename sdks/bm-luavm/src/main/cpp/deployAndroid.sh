#!/usr/bin/env bash

cd $(dirname $0)
SCRIPT_DIR=$(pwd)

# export VIDEOBUILD="true"

cd $SCRIPT_DIR/android/jni
ndk-build

cd $SCRIPT_DIR/androidproj
./deploy.sh klsf

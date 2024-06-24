#!/usr/bin/env bash

rm ./bm-output/my_app.apks
echo "converting aab to apks..."
./bundletool build-apks --connected-device --bundle=./bm-output/app-release.aab --output=./bm-output/my_app.apks
echo "installing..."
./bundletool install-apks --apks=./bm-output/my_app.apks

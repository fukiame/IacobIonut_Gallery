#!/bin/bash
sed -n '/<uses-permission android:name="android.permission.INTERNET"\/>/!p' app/src/main/AndroidManifest.xml > app/src/main/AndroidManifest2.xml
rm app/src/main/AndroidManifest.xml
mv app/src/main/AndroidManifest2.xml app/src/main/AndroidManifest.xml
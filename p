#!/bin/bash
if [ ! -d gen.antlr3-smali ]; then
	git clone https://github.com/JesusFreke/smali gen.antlr3-smali
	cp -r smali.patch/* gen.antlr3-smali
	cd !$
	gradle build -x test -x checkstyleMain
fi
cp /usr/local/share/fast.proto .
rm -rf core/src/main/java/fast*
protoc -I=. --java_out=core/src/main/java fast.proto
flatc --proto fast.proto
sed -i -e 's/namespace fast/namespace fast_/g' fast.fbs
sed -i -e 's/fast\./fast_./g' fast.fbs
sed -i -e 's/\[ubyte\]/string/g' fast.fbs
flatc --java -o core/src/main/java fast.fbs
gradle build -x test -x checkstyleMain
gumtree=gumtree-$(date '+%Y%m%d')-2.1.0-SNAPSHOT
cp dist/build/distributions/$gumtree.zip gumtree.zip
unzip -o gumtree.zip
#sudo cp -r $gumtree/* /usr/local/
#sudo cp gumtree /usr/local/bin
#gumtree diff DuplicateVirtualMethods.smali DuplicateVirtualMethods.smali 
#gumtree-20181125-2.1.0-SNAPSHOT/bin/gumtree diff ~/d1_both-v1.c ~/d1_both-v2.c
#fast test/Hello1.java test/Hello1.java.pb
#fast test/Hello2.java test/Hello2.java.pb
#$gumtree/bin/gumtree diff test/Hello1.java.pb test/Hello2.java.pb
#$gumtree/bin/gumtree diff test/Hello1.java test/Hello2.java

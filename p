#!/bin/bash
if [ ! -d gen.antlr3-smali ]; then
	git clone https://github.com/JesusFreke/smali gen.antlr3-smali
	cp -r smali.patch/* gen.antlr3-smali
	cd !$
	gradle build -x test -x checkstyleMain
fi
gradle build -x test -x checkstyleMain
gumtree=gumtree-$(date '+%Y%m%d')-2.1.0-SNAPSHOT
unzip -o dist/build/distributions/$gumtree.zip
#sudo cp -r $gumtree/* /usr/local/
#sudo cp gumtree /usr/local/bin
#gumtree diff DuplicateVirtualMethods.smali DuplicateVirtualMethods.smali 
#gumtree-20181125-2.1.0-SNAPSHOT/bin/gumtree diff ~/d1_both-v1.c ~/d1_both-v2.c
fast Hello1.java Hello1.java.pb
fast Hello2.java Hello2.java.pb
$gumtree/bin/gumtree diff Hello1.java.pb Hello2.java.pb

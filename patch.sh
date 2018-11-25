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

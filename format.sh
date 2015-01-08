#!/bin/bash
for f in `find . -name "pom.xml"`
do
 tidy -xml -wrap 120 -i -m $f
done

/bin/rm -rf output

mkdir -p output/classes
mkdir -p output/mlib

javac -d output/classes `find one -name *.java`
jar -cf output/mlib/one.jar -C output/classes .

/bin/rm -rf output/classes

javac -d output/classes -p output/mlib `find two -name *.java`
jar -cf output/mlib/two.jar -C output/classes .

/bin/rm -rf output/classes

javac -d output/classes -p output/mlib `find first -name *.java`
jar -cf output/mlib/first.jar -C output/classes .

/bin/rm -rf output/classes

java -p output/mlib -m first/com.agiledeveloper.first.First

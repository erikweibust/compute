/bin/rm -rf output;
mkdir -p output/mlib;
mkdir -p output/classes;

javac -d output/classes `find compute -name *.java`;
jar -c -f output/mlib/compute.jar --module-version 1.1.1 -C output/classes .;
/bin/rm -rf output/classes/*;

javac -d output/classes -p output/mlib `find user -name *.java`;
jar -c -f output/mlib/user.jar --main-class com.agiledeveloper.user.User --module-version 2.0.1 -C output/classes .;
/bin/rm -rf output/classes/*;

java -p output/mlib -m com.agiledeveloper.user

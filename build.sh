/bin/rm -rf output;
mkdir -p output/mlib;
mkdir -p output/classes;

javac -d output/classes `find compute -name *.java`;
jar -c -f output/mlib/compute.jar -C output/classes .;

/bin/rm -rf output/classes/*;

jar -f output/mlib/compute.jar -d;

javac -d output/classes -p output/mlib `find user -name *.java`;
jar -c -f output/mlib/user.jar --main-class com.agiledeveloper.user.User -C output/classes .;

/bin/rm -rf output/classes/*;
jar -f output/mlib/user.jar -d;

java -p output/mlib -m com.agiledeveloper.user

/bin/rm -rf output;
mkdir -p output/mlib;
mkdir -p output/classes;

javac -d output/classes `find compute -name *.java`;
jar -c -f output/mlib/compute.jar -C output/classes .;
/bin/rm -rf output/classes/*;

javac -d output/classes -p output/mlib `find user -name *.java`;
jar -c -f output/mlib/user.jar --main-class com.agiledeveloper.user.User -C output/classes .;
/bin/rm -rf output/classes/*;

javac -d output/classes -p output/mlib `find user2 -name *.java`;
jar -c -f output/mlib/user2.jar --main-class com.agiledeveloper.seconduser.User -C output/classes .;
/bin/rm -rf output/classes/*;

echo "... user1...."
java -p output/mlib -m com.agiledeveloper.user
echo "... user2...."
java -p output/mlib -m com.agiledeveloper.seconduser

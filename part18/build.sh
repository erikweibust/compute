/bin/rm -rf output
#mkdir -p output/classes
mkdir -p output/mlib

/bin/rm -rf output/classes
javac -d output/classes `find util -iname *.java`
jar -cf output/mlib/util.jar -C output/classes .

/bin/rm -rf output/classes
javac -d output/classes -classpath output/mlib/util.jar `find user -iname *.java`
jar -cf output/mlib/user.jar -C output/classes .

echo "---- all in the classpath"
java -classpath output/mlib/util.jar:output/mlib/user.jar com.agiledeveloper.user.User

echo "---- all in the modulepath"
java -p output/mlib -m user/com.agiledeveloper.user.User

echo "---- user in the modulepath; and util in the classpath"
#mp -> cp
#user -> used
#user -> util

java -p output/mlib/user.jar -classpath output/mlib/util.jar -m user/com.agiledeveloper.user.User

echo "---- util in the modulepath; and user in the classpath"
#mp -> cp
#used <- used
#util <- user

java -p output/mlib/util.jar -classpath output/mlib/user.jar com.agiledeveloper.user.User

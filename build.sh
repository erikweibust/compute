/bin/rm -rf output;
mkdir -p output/mlib;
mkdir -p output/classes;

javac -d output/classes `find compute -name *.java`;
jar -v -c -f output/mlib/compute.jar -C output/classes .;

/bin/rm -rf output/classes/*;

jar -f output/mlib/compute.jar -d;

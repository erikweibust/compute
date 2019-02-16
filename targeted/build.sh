/bin/rm -rf agiledeveloper

jlink --module-path $JMODS:../output/mlib --output agiledeveloper --add-modules com.agiledeveloper.third --launcher=myprecious=com.agiledeveloper.third

./agiledeveloper/bin/java -m com.agiledeveloper.third

./agiledeveloper/bin/myprecious

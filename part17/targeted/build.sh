/bin/rm -rf agiledeveloper

jlink --module-path $JMODS:../output/mlib --output agiledeveloper --add-modules first,jdk.rmic

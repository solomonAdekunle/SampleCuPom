set projectLocation=%projectLocation\supercasino-desktop%
set classpath=%projectLocation%\lib\*
set execution=mvn integration-test
%execution%
pause
del build\libs\*.jar
call gradlew build
if exist build\libs\*.jar goto fileexist
else goto notexist
goto end

:fileexist
copy build\libs\*.jar project\

goto end

:notexist
echo File does not exist - compilation error

:end

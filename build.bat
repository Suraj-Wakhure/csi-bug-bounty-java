@echo off
set JFLAGS=-g
set JC=javac
set JVM=java

if "%~1"=="" goto build
if "%~1"=="build" goto build
if "%~1"=="clean" goto clean
if "%~1"=="run" goto run

echo Unknown target: %~1
goto :eof

:build
echo Building...
%JC% %JFLAGS% src\*.java utils\*.java
goto :eof

:clean
echo Cleaning...
del /Q src\*.class utils\*.class 2>nul
goto :eof

:run
call :build
%JVM% src.Main
goto :eof

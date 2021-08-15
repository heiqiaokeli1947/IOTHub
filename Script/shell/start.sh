#!/bin/bash

JAR_NAME="/opt/IOTHub/IOTHub.jar"
LISTEN_PORT="8002"

echo "start IOTHub..."

echo "wait system ready:20s..."
sleep 20


function killExistProcess(){
	port=`lsof -i:${LISTEN_PORT}|grep :${LISTEN_PORT}|awk -F":" '{print $2}'|awk '{print $1}'`
	echo "find port result:${port}"

	pid=`lsof -i:${LISTEN_PORT}|grep :${LISTEN_PORT}|awk '{print $2}'`
	echo "find pid result:${pid}"

	if [ ! -n "$pid" ]; then
		echo "no exist process which listen port:${LISTEN_PORT}"
	else
		echo "kill PID:${pid}"
		kill -9 ${pid}
	fi
}


function startPIOTHub(){
	echo "start jar..."
	nohup java -jar ${JAR_NAME} >/dev/null  &
	
	echo "sleep 50 wait start finish..."
	sleep 50
	newPid=`lsof -i:${LISTEN_PORT}|grep :${LISTEN_PORT}|awk '{print $2}'`
	echo "find pid result:${newPid}"
	
	if [ ! -n "$newPid" ]; then
		echo "start failed."
	else
		echo "start success!PID:${newPid}"
	fi
}

echo "kill exist process..."
killExistProcess

echo "sleep 20s then kill again..."
sleep 20
killExistProcess

echo "start new process..."
startPIOTHub

echo "start IOTHub finish."
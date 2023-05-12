#! /bin/bash

REPOSITORY=/home/ubuntu/app/step2
PROJECT_NAME=zip/build/libs

cd $REPOSITORY/$PROJECT_NAME

echo "> 현재 구동 중인 애플리케이션 pid 확인"
CURRENT_PID=$(pgrep -f .jar)

echo "현재 구동 중인 애플리케이션 pid: $CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
  echo "> 현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다."
else
  echo "> kill -15 $CURRENT_PID"
  kill -15 "$CURRENT_PID"
  sleep 5
fi

echo "> 새 애플리케이션 배포"

cd "$REPOSITORY"/"$PROJECT_NAME"
pwd

echo "> $JAR_NAME 실행"
nohup java -jar *.jar &

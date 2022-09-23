package com.example.git

1. git bash 에서 환경설정 하기
    Step 1 : 유저이름 설정
             git config --global user.name "your_name"
    Step 2 : 유저 이메일 설정하기
            git config --global user.email "your_email"
    Step 3 : 정보 확인하기
            git config --list

2. Github에 처음 코드 업로드하기
    Step 0 : 초기화
            git init
    Step 1 : 추가할 파일 더하기
            git add .
            .(점) 은 모든 파일이라는 뜻, 선택적으로 올리고 싶으면 add뒤에 파일 이름 붙여주면 됨 (예. git add index.html)
    Step 2 : 상태 확인 (선택사항)
            git status
    Step 3 : 히스토리 만들기
            git commit -m "first commit"
    Step 4 : Github repository랑 내 로컬 프로젝트랑 연결
            git remote add origin https://github.com/yuniKam/first-yuni.k-project.git
    Step ex : 잘 연결됬는지 확인 (선택사항)
            git remote -v
            내가 연결한 주소값이 잘 뜨면 성공!
    Step 5 : Github로 올리기
            git push origin master
            master 자리에는 branch이름이 들어가면 됨 branch이름이 main라하면 git push origin main 이라고 써야함

3.Github에 계속 업데이트 하는법
    Step 1 : 추가할 파일 더하기
            git add .
    Step 2 : 히스토리 만들기
            git commit -m "first commit"
    Step 3 : Github로 올리기
            git push origin master
            내 컴퓨터에 소스코드를 업데이트를 하고 싶으면 이 세개의 스텝만 계속 반복하면 됨.
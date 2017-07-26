## github 시작 
**1. [gitHub](https://github.com) 가입**

**2. [git](https://git-scm.com/downloads) 다운로드 및 설치**

**3. github 로그인 후 New repository 생성**

**4. README.md 만들기**

* 내용이 test인 README.md 파일을 생성

```echo "#test" >> README.md ```

* 현재 경로에 git저장소를 생성

```git init```

* 현재상태 알아보기

```git status```

* stage영역(저장소와 로컬 사이)에 README.md파일을 넣을 준비

```git add README.md```

* stage영역에 있는 README.md파일을 커밋영역에 넣기 

```git commit -m "커밋내용"```

* 저장소와 로컬을 연결

```git remote add origin https://github.com/rtkjahn/Mine.git```

* 저장소로 push

```git push -u origin master```

**5. project를 저장소로 보내기


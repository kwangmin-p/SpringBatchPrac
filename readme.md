### Docker Container 실행
docker-compose up -d

### Java 빌드 및 실행
1. #### java 빌드
- /build/libs 에 jar 파일 생성   
./gradlew bootJar   


2. java 명령어를 통해 빌드 및 실행  
java -jar build/libs/ReviewBotPlugin-1.0-SNAPSHOT.jar --spring.batch.job.names=hellojob

### Java 실행방법
1. OS 스케줄러로 배치 프로그램 실행
2. Quartz 스케줄러 이용 (Quartz(Trigger 역할) + Spring Batch 프레임워크를 함께 사용해 어플리케이션을 개발)
- 어플리케이션 내부에서 스케줄링하므로 Batch 실행이 빠르다
- 스케줄링 데이터가 DB에 저장되어 Admin을 따로 만들어야 한다
3. Jenkins 를 이용
- 마스터에서 슬레이브로 명령을 전달해 배치 프로그램을 실행시킨다.
- 젠킨스에서 지원하는 스케줄링 기능을 통해 배치 프로그램을 실행시킬 수 있다.
- 젠킨스 Admin에서 실행 결과를 볼 수 있다.
4. Spring Cloud Data Flow 이용
- Spring Cloud Data Flow를 활용해 Job을 실행시킨다.
- Kubernetes 클러스터를 구 축해야 한다.
- Admin이 제공되고, Job의 실행을 연결할 수 있는 등 다양한 기능을 제공한다.


# FirebaseFCM
--
Firebase 클라우드 메시징(FCM)은 메시지를 무료로 안정적으로 전송할 수 있는 교차 플랫폼 메시징 솔루션입니다.

FCM을 사용하면 새 이메일이나 기타 데이터를 동기화할 수 있음을 클라이언트 앱에 알릴 수 있습니다. 알림 메시지를 전송하여 사용자를 유지하고 재참여를 유도할 수 있습니다. 채팅 메시지와 같은 사용 사례에서는 메시지로 최대 4KB의 페이로드를 클라이언트 앱에 전송할 수 있습니다.

##주요기능

>1. 알림메시지 또는 데이터 메시지 전송
>
>	사용자에게 표시되는 알림 메시지를 전송합니다. 또는 데이터 메시지를 전송하고 애플리케이션 코드에서 임의로 처리합니다
>2. 강역한 메시지 타겟팅
>
>	단일 기기, 기기 그룹, 주제를 구독한 기기 등 3가지 방식으로 클라이언트 앱에 메세지를 배포할 수 있습니다
>3. 클라이언트 앱에서 메시지 전송
>	
>	FCM의 신뢰성 높고 배터리 효율적인 연결 채널을 통해 기기에서 다시 서버로 확인, 채팅 및 기타 메시지를 보낼 수 있습니다

##구현경로
1. FCM SDK 설정

	플랫폼에 맞는 설정 안내에 따라 앱에서 Firebase 및 FCM을 설정
	
2. 클라이언트 앱 개발

	클라이언트 앱에 메시지 처라, 주제 구독 로직 또는 기타 부가 기능을 추가합니다. 개발 중에 알림 콘솔에서 칸편하게 테스트 메시지를 보낼 수 있습니다
	
3. 앱 서버 개발

	FCM과 상호작용하는 데 사용할 서버 프로토콜을 결정하고, 인증 로직을 추가하고, 전송 요청을 제작하고, 응답을 처리하는 등의 작업을 수행합니다. 클라이언트 애플리케이션에서 업스트림 메시징을 사용하려면 XMPP를 사용해야 한다는 점에 유의하세요.
	

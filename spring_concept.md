# 스프링 용어 정리

## 1. IoC(Inversion of Control) 
* 제어의 역행
* 객체 생성을 자바 코드로 직접 처리하는 것이 아니라 컨테이너가 대신 처리함.
* 객체와 객체 사이의 의존관계 역시 컨테이너가 처리.
* 소스에 의존관계가 명시되지 않으므로 결합도가 떨어져서 유지보수가 편리해짐.

## 2. AOP(Aspect Oriented Programming)
* 관점지향 프로그래밍.
* 비즈니스 메소드를 개발할 때, 핵심 비즈니스 로직과 각 비즈니스 메소드마다 반복해서 등장하는 공통 로직을 분리함으로써 응집도가 높게 개발할 수 있도록 지원함.
* 공통으로 사용하는 기능들을 외부의 독립된 클래스로 분리함.
* 해당 기능을 프로그램의 코드에 직접 명시하지 않고 선언적으로 처리하여 적용하는 것이 기본 개념.
* 공통기능을 분리하여 관리할 수 있으므로 응집도가 높은 비즈니스 컴포넌트를 만들 수 있을 뿐만 아니라 유지보수를 혁신적으로 향상시킬 수 있음

### 컨테이너(Container)
* 특정 객체의 생성과 관리를 담당하며 객체 운용에 필요한 다양한 기능을 제공함.
* 일반적으로 서버 안에 포함되어 배포 및 구동됨.
* 대표적인 컨테이너로 Servlet 객체를 생성하고 관리하는 'Servlet 컨테이너'와 EJB 객체를 생성하고 관리하는 'EJB 컨테이너'가 있음.

### 스프링 컨테이너의 종류
* BeanFactory와 이를 상속한 ApplicationContext 두 가지 유형의 컨테이너를 제공함.
* BeanFactory 
	- 스프링 설정 파일에 등록된 <bean> 객체를 생성하고 관리하는 가장 기본적인 컨테이너 기능 제공.
	- 컨테이너가 구동될 때 <bean> 객체를 생성하는 것이 아니라, 클라이언트의 요청에 의해서만 <bean> 객체가 생성되는 지연 로딩 방식을 사용함. 
	- 일반적인 스프링 프로젝트에서 BeanFactory를 사용할 일은 없음.
	
* ApplicationContext
	- BeanFactory가 제공하는 <bean> 객체 관리 기능 외에도 트랜잭션 관리나 메시지 기반의 다국어 처리 등 다양한 기능을 지원함.
	- 컨테이너가 구동되는 시점에 <bean>에 등록된 클래스들을 객체 생성하는 즉시 로딩 방식으로 동작함.
	- 웹 애플리케이션 개발도 지워하므로 대부분의 스프링 프로젝트에 사용함. 
	* 구현 클래스(GenericXmlAplicationContext, XmlWebApplicationContext)
		* GenericXmlApplicationContext
			- 파일 시스템이나 클래스 경로에 있는 XML 설정 파일을 로딩하여 구동하는 컨테이너
		* XmlWebApplicationContext
			- 웹 기반의 스프링 애플리케이션을 개발할 때 사용하는 컨테이너

### <bean> 엘리먼트 속성
* (1) init-method 속성
	- 객체를 생성한 후에 멤버변수 초기화 작업이 필요할 때 사용.
	- <bean id = "tv" class="polymorphism.SamsungTV" init-method="initMethod" />
	- 스프링 컨테이너는 <bean>에 등록된 클래스 객체를 생성한 후에 init-method 속성으로 지정
	initMethod() 메소드를 호출함.
* (2) destory-method 속성
	- <bean> 엘리먼트에서 destroy-method 속성을 이용하여 스프링 컨테이너가 객체를 삭제하기 직전에 호출될
	임의의 메소드를 지정할 수 있음.
	- <bean id="tv" class="polymorphism.SamsungTV" destroy-method="destroyMethod" />
* (3) lazy-init 속성
	- ApplicationContext를 이용하여 컨테이너를구동하면 컨테이너가 구동되는 시점에 스프링설정 파일에 등록된
	<bean>들을 생성하는 즉시 로딩 방식으로 동작함
	- 그런데 어떤 <bean>은 자주 사용되지도 않으면서 메모리를 많이 차지하여 시스템에 부담을 주는 경우도 있음.
	- 따라서 스프링에서는 컨테이너가 구동되는 시점이 아닌 해당 <bean>이 사용되는 시점에 객체를 생성하도록
	lazy-init 속성을 제공함.
	- 특정 <bean>을 등록할 때, lazy-init="true"로 설정하면 스프링 컨테이너는 해당 <bean>을 미리
	생성하지 않고 클라이언트가 요청하는 시점에 생성함.
	- 메모리 관리를 더 효율적으로 할 수 있음.
	- <bean id="tv" class="polyporphism.SamsungTV" lazy-init="true" />
* (4) scope 속성
	- 클래스로부터 객체를 생성하는 쪽에서 자동으로 싱글톤 객체로 생성해주는 것이 가장 바람직하며, 스프링에서는
	 이런 기능을 컨테이너가 제공함.
	 - 스프링 컨테이너는 컨테이너가 생성한 bean을 어느 범위에서 사용할 수 있는지를 지정할 수 있음. 
	 - scope 속성 값은 기본이 싱글톤 -> 해당 bean이 스프링 컨테이너에 의해 단 하나만 생성 되어 운영되도록 	함.
	- <bean id="tv" class="polymorphism.SamsungTV" scope="singleton" />
	- scpoe 속성을 "prototype"으로 지정할 수 잇는데 이렇게 지정하면 스프링 컨테이너는 해당 <bean>이
	요청될 때마다 매번 새로운 객체를 생성하여 반환함.
	- <bean id="tv" class="polymorphism.SamsungTV" scope="prototype" />
	








															[출처:스프링퀵스타트]
{
 "cells": [
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "# 스프링 용어 정리\n",
    "\n",
    "## 1. IoC(Inversion of Control) \n",
    "* 제어의 역행\n",
    "* 객체 생성을 자바 코드로 직접 처리하는 것이 아니라 컨테이너가 대신 처리함.\n",
    "* 객체와 객체 사이의 의존관계 역시 컨테이너가 처리.\n",
    "* 소스에 의존관계가 명시되지 않으므로 결합도가 떨어져서 유지보수가 편리해짐.\n",
    "\n",
    "## 2. AOP(Aspect Oriented Programming)\n",
    "* 관점지향 프로그래밍.\n",
    "* 비즈니스 메소드를 개발할 때, 핵심 비즈니스 로직과 각 비즈니스 메소드마다 반복해서 등장하는 공통 로직을 분리함으로써 응집도가 높게 개발할 수 있도록 지원함.\n",
    "* 공통으로 사용하는 기능들을 외부의 독립된 클래스로 분리함.\n",
    "* 해당 기능을 프로그램의 코드에 직접 명시하지 않고 선언적으로 처리하여 적용하는 것이 기본 개념.\n",
    "* 공통기능을 분리하여 관리할 수 있으므로 응집도가 높은 비즈니스 컴포넌트를 만들 수 있을 뿐만 아니라 유지보수를 혁신적으로 향상시킬 수 있음\n",
    "\n",
    "### 컨테이너(Container)\n",
    "* 특정 객체의 생성과 관리를 담당하며 객체 운용에 필요한 다양한 기능을 제공함.\n",
    "* 일반적으로 서버 안에 포함되어 배포 및 구동됨.\n",
    "* 대표적인 컨테이너로 Servlet 객체를 생성하고 관리하는 'Servlet 컨테이너'와 EJB 객체를 생성하고 관리하는 'EJB 컨테이너'가 있음.\n",
    "\n",
    "                                                   [출처:스프링퀵스타트]"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.8.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 4
}

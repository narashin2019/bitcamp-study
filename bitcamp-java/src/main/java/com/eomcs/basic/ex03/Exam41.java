package com.eomcs.basic.ex03;

//# 문자의 리터럴 
//- 작은 따옴표 ''를 사용하여 문자를 표현한다.

  public class Exam41 {
    public static void main(String[] args) {
   
      // 직접 문자를 작성할 수 있다.
      // => '문자'
      System.out.println('A');
      System.out.println('가');

      // 문자에 해당하는 UCS-2 코드 값으로 문자를 지정할 수 있다.
      // => [\ u][UCS-2 코드] (그냥 저장하면 문자열됨)
      System.out.println('\u4eba');  // 
      System.out.println('\u0041');  // A 문자, A의 유니코드=0041
      System.out.println('\u0030');  // 0 문자
      System.out.println('\u0025');  // % 문자
      System.out.println('\uac00');  // 가 문자
    
      //키보드로 직접 입력할 수 없는 문자를 표현할 때는 그 문자에 대해 정의된 값을 지정한다.
      //키보드에선 칠 수 없지만 문자코드가 정해져있는 문자의 경우 위에 처럼 출력 가능.
      //문자에 대해 정의된 값을 '문자 코드(character code)'라 부른다.
      //코드값 앞에 \ u 문자를 붙인다. 
      //사람을 뜻하는 '인'이라는 한자를 출력해 보자.
      //    System.out.println('\u4eba');
      //키보드로 입력 가능한 문자도 문자 코드로 지정할 수 있다.
      //    System.out.println('\u0041');
      //    System.out.println('\uac00');

    }
  }




/*
문자를 저장하려면 2진수로 바꿀 수 있어야 함
문자 -> 2진수, 2진수로 바꿀 때 규칙이 필요

"Character Set" : 문자에 대해 코드 값 정의한 표

1. ASCII (7bit)
미국정보교환표준부호(영어: American Standard Code for Information Interchange)

  character code
A->1000001        } 2^7=128개
B->1000010	      } 영어 대소문자
C->1000011	      } 숫자
...		            } 특수문자
a->1100001	      } 약 90여개 문자에 대해 코드 값(2진수) 정의
b->1100010	      } 128개까지 정의 가능하나 90몇개 씀
c->1100011	      } 
...	              } 
0->0110000	      } 
1->0110001	      } 
2->0110010	      }      


2. ISO-8859-1(ISO-latin-1) (8bit)
ASCII+서유럽문자 = 200여개(8bit=256개 이지만 다 안씀)
여러분의 컴퓨터
한글만해도 만천자인데..

A->01000001       
B->01000010	
C->01000011	 
...		 


3. EUC-KR (16bit)
각각의 나라가 정함
영어는 ISO-8859-1 (8bit) 그대로 표현
한글은 2byte 코드 값으로 정의

완성된 글자에 코드값 정해짐

가-> 0xB0A1 (1011000010100001)	}  2350자 정도 (근데 한글 출판사 유통 문자 만천자 넘음)
각-> 0xB0A2		                	}  일부 한글은 타이핑이 안됨
...			                      	}
똘-> 0xB6CA			                }
똠-> x				                  }
똡-> x				                  }
똣-> x				                  }
똥-> 0xB6CB			                }

EUC-KR (16bit)은 똠 똡 똣...등 쓸수 없음, 없는 문자는 처리 불가
pc os <= window3.x
메모장에서 희안하게 안쳐져!! 또ㅁ


4. 조합형(16bit)
아래하 한글, 한글에서만 돌아감, 다른 응용프로그램에서는 못 씀.
https://yunhyeon.tistory.com/183

초성		  중성 	  	종성
ㄱ 00010	ㅏ  		  ㄱ
ㄴ 00100	ㅑ	    	ㄴ
ㄷ		    ㅓ		   ㄷ
ㄹ	    	ㅕ		    ㄹ

녁 -> (한글을 첫비트 1로 시작)1ㄴ00100ㅕ01011ㄱ00010 = 0x9162

65536개의 코드 중에서 절반을 한글에 사용
-> 국제 표준이 아님. hwp에서만 사용. 유닉스 리눅스에서 이 조합형 제공 x



-----
(open document 등장)

ms에서 작성한 것을 다른 프로그램으로 열수있게 하라!

.doc -> .docx  ] XML포맷으로 되어 있음   vs. .odf
.ppt -> .pptx  ]
.wls -> .wlsx  ]

ECMA제출해서 두개(.docx, .odf)가 다 국제 표준으로 인정 받음 
--------------------


5. MS949 (=CP949; 2바이트)
-> EUCKR + 알파(8000자)
총 11172자
PC OS >= windows95 이상부터 
ms 운영체제의 독자적인 규칙
응용소프트웨어에서 11172자 표현가능해짐
메모장에서 똠방갹 됨

가 -> 0xB0A1
나 -> 0xB0A2

똘 -> 0xB6CA
똠 -> 0x8C63
똡 -> 0x8C64 
똥 -> 0xB6CB

-> 국제 표준X, ms표준/ 맥, 유닉스, 리눅스에서 못쓴다. 추가설치 해야함. 


6. Unicode -> JVM

국제 표준 인코딩 규칙이다.
총 653355
//- UCS-2(Universal Coded Character Set)의 경우 영어, 한글 모두 2바이트로 인코딩한다.
//- MS949의 모든 한글 문자가 포함되어 있다.
//- A(0x0041), B(0x0042), +(0x002b), 가(0xac00), 각(0xac01), ...
//- 기존의 EUC-KR과 MS949 코드와 호환되지 않는다.
//- JVM은 내부에서 문자열을 다룰 때 UCS-2를 사용한다. 
//  즉 영어, 한글 모두 2바이트 유니코드로 다룬다.
//- 한글문자: 11172자 + 옛한글 + 한국전용한자
코드표에 규칙을 정함. 비트값이 1이면 이 코드표, 두번쨰 코드가 2면 이 코드표 이런식으로 조합.
한글도 코드 재정의함. ac00 <- a1b1


7. UTF-8 -> file, 통신
기존에 유니코드를 모르는 컴퓨터는 프로그램 다 업그레이드 해야하는데 그 비용 누가 감당함?
-> 유니코드 변형 포맷 만듬

-영어는 그대로 1byte(8bit)사용
A -> 0x41
B -> 0x42

-그외 문자는 규칙에 따라 2~4byte로 변환
한글은 3byte *****
000800~00FFFF : 한글은 이 사이에 소속
1110xxxx 10xxxxxx 10xxxxxx 형식으로 바꿈

가  
      A    C    0    0 (ucs2)
-> 1010 1100 0000 0000 2진수로 바꿈
-> 11101010 10110000 10000000 (utf8) 형식에 위에 값넣음
-> E   A     B    0    8   0 = EAB080 (3byte)


8. utf16
2바이트로 표현가능한것들은 그대로 하고 그외만 3~4바이트로 표현
한글은 유니코드에서 2바이트였기때문에 그대로 2바이트.
ucs2의 플러스 알파
유니코드 = utf16이라고 생각해도 됨
영어도 2바이트
------------------------
파일을 JVM으로 읽을 때 한글은 utf8인(3바이트) 것을 유니코드(2바이트)로 바꿔야해.
=파일 입출력 때 배움.


------------------------------------------------
wer browger	            web server
                        자바는 이쪽, 즉 우리가 할 처리.
File/Network <--변환--- JVM
	           ---변환--->

[utf-8]	               [ucs-2]

A 41     	               A 0041
가 EAB080 	             가 AC00

----------------------------------------------


구글 크롬 ucs-2 를 utf8로 또 url encoding 또함.
웹브라우저에서 웹서버로 전송할떄 url encoding 또함.

----------------
   
문자                        ucs-2 character set                 UTF-8 character set                         URL Data
A ---------encoding-------> 0041 (2byte) --------encoding-----> 41 ------------url encoding-------------->  A
 <----------decoding-------                                        <-----------url decoding--------------

가 ---------encoding -----> AC00-----------------encoding-----> EAB0B0 --------url encoding--------------> %EA%B0%B0


-----------------------

   encoding: 규칙에 따라 값을 가공
   규칙
값 -----> 값'
   <-----
    decoding : 규칙에 따라 원래 값으로 복원

--------------------------

한글 폰트 만드는게 어려운 이유,
한글 폰트 유료가 많은 이유,
고품질의 공짜가 나올 수 없는 이유 (윤폰트 산돌폰트): 

-> 영어 폰트파일은 90몇자. 반면 한글 폰트 파일은 11172자 만들어야함
무료는 바탕 궁서 명조 고딕 돋움 굴림 맑은고딕 이게 끝..


벡터폰트 vector font 트루타입폰트 글자확대 시 계단현상없음 요즘은 웬만한 운영체제 다 벡터폰트
레스터폰트 raster font 글자 확대 시 계단 현상 있음

utf도 유니코드의 한 형태이다. 

utf16은 ucs-2의 한 종류
*/
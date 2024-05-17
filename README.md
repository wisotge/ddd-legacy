# Step 3

- [x] 비즈니스 오브젝트에 대한 테스트 코드를 모두 구현한다.
# Step 2
- 포스(Pos) 애플리케이션을 구현한다.
- [x] 메뉴 그룹
  - [x] 메뉴 그룹 전체를 조회한다.
  - [x] 메뉴 그룹 추가한다.
    - [x] 메뉴 그룹은 id와 이름을 가진다.
    - [x] 메뉴 그룹명은 빈값일 수 없다.
- 메뉴
  - [x] 메뉴 저장한다.
      - [x] 메뉴 이름
        - [x] 빈 값이거나, 비속어를 사용할 수 없다.
    - [x] 가격
          - [x] 빈값이거나 음수일수 없다.
        - [x] 수정할 수 있다.
        - [x] 재고의 원가를 모두 합친 가격을 초과해야 한다.
      - [x] 메뉴그룹
        - [x] 항상 존재한다.
    - [x] 노출여부 (pos 사용자에게 메뉴를 노출할지 여부)
      - [x] 존재하지 않는 메뉴이면 안된다.
        - [x] 노출/비노출로 설정할 수 있다.
    - [x] 현재 상품 수
      - [x] 상품의 id
      - [x] 상품 수량
    - [x] 메뉴 상품
        - [x] 수는 음수일 수 없다.
      - [x] 존재하는 상품만 메뉴에 등록 가능하다.
      - [x] 메뉴의 가격은 메뉴를 만드는데 필요한 상품들 원가 총합를 넘을 수 없다. 
  - [x] 메뉴 전체를 조회한다.
- 상품
  - [x] 상품 생성시 상품 이름과 가격을 저장한다.
    - [x] 상품의 가격은 반드시 존재해야하며 음수일 수 없다.
  - [x] 상품 가격을 수정한다.
    - [x] 변경하려는 가격은 반드시 존재해야하며 음수일 수 없다.
    - [x] 변경하려는 상품은 반드시 존재한다.
    - [x] 상품이 속한 메뉴의 가격이 메뉴 원가를 넘을 경우, 메뉴는 비노출처리된다.
  - [x] 상품 목록을 조회한다.
- 테이블 주문
  - [x] 주문 테이블을 추가 한다.
    - [x] 주문 테이블의 이름은 null이나 빈 값일 수 없다.
    - [x] 테이블명, 손님수를 입력후, '미사용중'으로 상태값을 변경한다.
  - [x] 좌석에 손님을 앉힌다.
    - [x] '사용중'으로 상태값을 변경한다.
    - [x] 존재하지 않는 좌석일 경우 손님을 앉힐 수 없다.
  - [x] 테이블당 손님 수를 수정한다.
    - [x] 변경할 손님 수는 음수일 수 없다.
    - [x] 존재하지 않는 주문 테이블이면 안된다.
    - [x] 주문 테이블의 상태가 '미사용' 중이면 안된다.
  - [x] 주문 테이블을 초기화한다.
    - [x] 주문의 상태는 '완료' 상태이어야 한다.
    - [x] 손님 수 0명, 사용여부 '미사용'으로 초기화한다.
  - [x] 주문 테이블 목록 전체를 조회한다.
- 주문 
  - [x] 주문을 생성한다.
    - [x] 여러개의 메뉴를 주문할 수 있다.
      - [x] 주문 아이템의 메뉴는 무조건 존재해야한다.
    - [x] POS기에서 비노출된 상품은 주문할 수 없다.
    - [x] 주문 총 금액은 메뉴를 합산한 금액과 일치한다.
    - [x] 주문 초기 상태는 '대기'이다.
    - [x] 배달 주문일 경우 주소를 주문 정보에 입력한다.
      - [x] 배달 주문은 주소가 반드시 존재해야한다.
    - [x] 테이블 주문을 한다.
      - [x] 주문 테이블은 존재해야 한다.
      - [x] 주문 테이블의 상태는 '사용중' 이어야 한다.
    - [x] 주문의 주문 타입이 존재하지 않으면 안된다.
    - [x] 주문 아이템이 존재하지 않으면 안된다.
  - [x] 주문을 승낙한다.
    - [x] 배달 주문이면 라이더를 호출한다.
    - [x] 주문 상태를 '주문수락'으로 변경한다.
  - [x] 주문된 음식을 손님에게 서빙한다.
    - [x] '주문 수락 완료' 상태가 아닐 경우 에러ㅏ
    - [x] 주문 상태를 '서빙완료'로 변경한다.
  - [x] 주문된 음식을 손님에게 배송하기 시작한다.
    - [x] 배달 음식만 가능하다.
    - [x] '서빙완료'(SERVED) 상태가 아니면 안된다.
    - [x] 주문 상태를 '배달중'으로 변경한다.
  - [x] 주문된 음식을 손님에게 배송 완료한다.
    - [x] 존재하는 주문이어야 한다.
    - [x] '배송중'인 음식만 가능하다.
    - [x] '배달완료'로 상태 변경한다.
  - [x] 주문 처리 완료한다
    - [x] '매장 내 식사 주문', '포장 주문'의 경우 '서빙완료' 상태이어야만 한다.
    - [x] '배달 주문'의 경우 '배달완료' 상태이어야만 한다.
    - [x] '매장 내 식사 주문'일 경우, 해당 테이블의 손님 수를 0으로 리셋하고, 사용가능으로 상태값을 초기화한다.
    - [x] '주문 처리 완료' 상태가 된다.
  - [x] 전체 주문을 조회한다.

# Step 1
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환  
- [x] 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다.  
커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.  
예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

# Step 0
- [x] 자동차 이름과 자동차 위치로 자동차를 생성한다.
- [x] 자동차 이름은 5글자를 넘을 경우 예외 발생한다.
- [x] 자동차는 움직임 값이 4 이상일때만 움직인다.
- [x] 자동차는 멈춘다.
- [x] 자동차는 0-9 사이의 숫자로 랜덤하게 움직인다.

package test;

import org.omg.CORBA.UShortSeqHelper;

public class AccountTest {
    // TODO: 2020-03-05 클래스 이름은 Account
    // TODO: 2020-03-05 기능은 세가지 1.잔고 조회 2.입금 3.출금

    public void testAccount() throws Exception {
        Account account = new Account();
        if (account == null) {
            throw new Exception("계좌생성 실패");
        }
    }

    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        try {
            test.testAccount(); //테스트 케이스 실행
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

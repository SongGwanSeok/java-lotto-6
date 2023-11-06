package lotto.model;

import static lotto.model.Input.POSITIVE_NUMBER_PATTERN;

public class Money {

    public static final int CURRENT_UNIT = 1000;

    private final int money;

    public Money(String input) {
        isPositiveNumber(input);
        money = Integer.parseInt(input);
        isModEqualZero();
    }

    public int getMoney() {
        return money;
    }

    public int getPurchaseLottoCount() {
        return money / CURRENT_UNIT;
    }

    private void isPositiveNumber(String target) {
        if (!target.matches(POSITIVE_NUMBER_PATTERN)) {
            throw new IllegalArgumentException("[ERROR] 양의 정수만 입력하세요.");
        }
    }

    private void isModEqualZero() {
        if (money % CURRENT_UNIT != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 " + CURRENT_UNIT + "으로 나누어 떨어져야 합니다.");
        }
    }
}

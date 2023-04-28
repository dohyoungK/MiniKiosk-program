package app.discount.discountPolicy;

import app.discount.DiscountPolicy;

public class FixedAmountDiscountPolicy implements DiscountPolicy {

//    할인 금액
    private int discountAmount;

//    생성자
    public FixedAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

//    할인 적용 금액 계산
    public int calculateDiscountedPrice(int price) {
        return price - discountAmount;
    }
}

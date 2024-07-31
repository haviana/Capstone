package amigos.com.car;

import java.math.BigDecimal;

public record Car(String regNumber, BigDecimal rentalPricePerDay, String brand, boolean isEletric) {
}

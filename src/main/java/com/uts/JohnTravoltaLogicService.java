package com.uts;
import org.springframework.stereotype.Service;

@Service
public class JohnTravoltaLogicService {

	public String evaluate(String inputName) {
		if (inputName == null || inputName.trim().isEmpty()) {
			return "Nama tidak boleh kosong.";
		}

		String normalized = inputName.trim().toLowerCase();
		if (normalized.contains("john travolta")) {
			return "John Travolta adalah aktor film, bukan pembuat Spring Framework. Pembuat yang dibahas di README adalah Rod Johnson.";
		}

		return "Input '" + inputName.trim() + "' tidak cocok dengan logic John Travolta. Coba isi dengan 'John Travolta'.";
	}
}

public String hitungAkarKuadrat(double a, double b, double c) {
    if (a == 0) {
        return "Bukan persamaan kuadrat (nilai 'a' tidak boleh 0).";
    }

    double d = (b * b) - (4 * a * c);
    
    if (d > 0) {
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        return String.format("Diskriminan > 0. Memiliki 2 akar nyata yang berbeda: x1 = %.2f dan x2 = %.2f", x1, x2);
    } else if (d == 0) {
        double x = -b / (2 * a);
        return String.format("Diskriminan = 0. Memiliki akar kembar: x1 = x2 = %.2f", x);
    } else {
        return "Diskriminan < 0. Akar imajiner (tidak memiliki akar nyata).";
    }
}
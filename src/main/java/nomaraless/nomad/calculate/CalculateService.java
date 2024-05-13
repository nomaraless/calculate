package nomaraless.nomad.calculate;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculateService {
    public String calculate() {
        return "Добро пожаловать в калькулятор. Введите значения";
    }
    public String plus(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return ("nnn");;
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x + y;
        return String.valueOf(c);
    }

    public String minus(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return "Отсутствуют данные";
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x - y;
        return String.valueOf(c);
    }
    public String multyply(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return "Отсутствуют данные";
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x * y;
        return String.valueOf(c);
    }
    public String divide(String a, String b) {
        if (StringUtils.isEmpty(a) || StringUtils.isEmpty(b)) return "Отсутствуют данные";
        if (a.equals("0") || b.equals("0")) {
            return "На ноль делить нельзя";
        }
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b);
        double c = x / y;
        return String.valueOf(c);
    }
}

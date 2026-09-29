package com.uts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JohnVoltaController {

    private final JohnTravoltaLogicService johnTravoltaLogicService;

    public JohnVoltaController(JohnTravoltaLogicService johnTravoltaLogicService) {
        this.johnTravoltaLogicService = johnTravoltaLogicService;
    }

    // --- Rute Program 1 (Gaji John Travolta) ---
    @GetMapping({"/", "/john-volta"})
    public ModelAndView showJohnVoltaPage() {
        return new ModelAndView("john-travolta");
    }

    @PostMapping("/john-volta")
    public ModelAndView processJohnTravoltaInput(
            @RequestParam("jamKerja") int jamKerja,
            @RequestParam("pengeluaran") double pengeluaran) {

        ModelAndView modelAndView = new ModelAndView("john-travolta");

        // Kembalikan nilai ke view agar tidak hilang dari form
        modelAndView.addObject("jamKerja", jamKerja);
        modelAndView.addObject("pengeluaran", pengeluaran);

        // Panggil logic perhitungan gaji
        String hasil = johnTravoltaLogicService.hitungGajiTravolta(jamKerja, pengeluaran);
        modelAndView.addObject("resultMessage", hasil);

        return modelAndView;
    }

    // --- Rute Program 2 (Persamaan Kuadrat) ---
    @GetMapping("/persamaan-kuadrat")
    public ModelAndView showPersamaanKuadratPage() {
        return new ModelAndView("persamaan-kuadrat");
    }

    @PostMapping("/persamaan-kuadrat")
    public ModelAndView processPersamaanKuadrat(
            @RequestParam("a") double a,
            @RequestParam("b") double b,
            @RequestParam("c") double c) {

        ModelAndView modelAndView = new ModelAndView("persamaan-kuadrat");
        modelAndView.addObject("a", a);
        modelAndView.addObject("b", b);
        modelAndView.addObject("c", c);

        String hasil = johnTravoltaLogicService.hitungAkarKuadrat(a, b, c);
        modelAndView.addObject("resultMessage", hasil);

        return modelAndView;
    }
}
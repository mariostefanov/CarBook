package com.example.rentalcars.web;

import com.example.rentalcars.exception.ObjectNotFoundException;
import com.example.rentalcars.model.dto.AddOfferDTO;
import com.example.rentalcars.service.BrandService;
import com.example.rentalcars.service.OfferService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.UUID;

@Controller
public class OfferController {

    private final OfferService offerService;

    private final BrandService brandService;

    public OfferController(OfferService offerService, BrandService brandService) {
        this.offerService = offerService;
        this.brandService = brandService;
    }

    @GetMapping("offers/add")
    public String addOffer(Model model) {
        if (!model.containsAttribute("addOfferModel")) {
            model.addAttribute("addOfferModel", new AddOfferDTO());
        }
        model.addAttribute("brands", brandService.getAllBrands());
        return "offer-add";
    }

    @PostMapping("offers/add")
    public String addOffer(@Valid AddOfferDTO addOfferModel,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes,
                           @AuthenticationPrincipal UserDetails userDetails) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("addOfferModel", addOfferModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addOfferModel",
                    bindingResult);

            return "redirect:/offers/add";
        }

        offerService.addOffer(addOfferModel, userDetails);

        return "redirect:/";
    }

    @GetMapping("offers/all")
    public String allOffers(
            Model model,
            @PageableDefault(
                    sort = "pricePerDay",
                    direction = Sort.Direction.ASC,
                    page = 0,
                    size = 6)
            Pageable pageable) {
        model.addAttribute("offers", offerService.getAllOffers(pageable));
        return "car";
    }


    @GetMapping("/offers/{id}/details")
    public String getOfferDetail(@PathVariable("id") UUID uuid, Model model) {
        var offerDto =
                offerService.findOfferByUUID(uuid)
                        .orElseThrow(() -> new ObjectNotFoundException("Offer with UUID " + uuid + " not found!"));

        model.addAttribute("offer", offerDto);
        return "car-single";
    }
}

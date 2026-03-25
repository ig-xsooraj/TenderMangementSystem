package com.fresco.tenderManagement.controller;

import com.fresco.tenderManagement.model.BiddingModel;
import com.fresco.tenderManagement.service.BiddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bidding")
public class BiddingController {

    @Autowired
    private BiddingService biddingService;

    @PostMapping("/add")
    public ResponseEntity<Object> postBidding(@RequestBody BiddingModel biddingModel) {
        return biddingService.postBidding(biddingModel);
    }

    @GetMapping("/list")
    public ResponseEntity<Object> getBidding(@RequestParam double bidAmount) {
        return biddingService.getBidding(bidAmount);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Object> updateBidding(@PathVariable int id, @RequestBody BiddingModel biddingModel) {
        return biddingService.updateBidding(id, biddingModel);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteBidding(@PathVariable int id) {
        return biddingService.deleteBidding(id);
    }
}
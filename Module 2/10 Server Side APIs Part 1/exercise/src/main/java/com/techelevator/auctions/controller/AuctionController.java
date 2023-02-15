package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(value = "title_like", defaultValue = "") String title,
                              @RequestParam(value = "currentBid_lte", defaultValue = "0") double bid){
        List<Auction> filteredList = new ArrayList<>();

        if (!title.isEmpty() && bid > 0){
            filteredList = dao.searchByTitleAndPrice(title, bid);
        } else if ( !title.isEmpty() ) {
            filteredList = dao.searchByTitle(title);
        } else if (bid > 0){
            filteredList = dao.searchByPrice(bid);
        } else if (title.isEmpty()) {
            filteredList = dao.list();
        } else {
            filteredList = dao.searchByTitle(title);
        }

        return filteredList;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id){
        return dao.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction){

        try {
            dao.create(auction);
        } catch (RestClientResponseException e) {
            e.getResponseBodyAsString();
        }

        return auction;
    }

    public List<Auction> searchByPrice(double currentBid_lte){
        return null;
    }

    public List<Auction> searchByTitleAndPrice(String title, double currentBid){
        return null;
    }

}

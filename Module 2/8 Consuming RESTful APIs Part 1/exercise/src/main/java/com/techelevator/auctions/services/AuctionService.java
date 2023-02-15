package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;
import com.techelevator.auctions.model.Auction;


public class AuctionService {

    public static String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        Auction[] auctionsFromAPI = restTemplate.getForObject(API_BASE_URL, Auction[].class);
        return auctionsFromAPI;
    }

    public Auction getAuction(int id) {
        return restTemplate.getForObject(API_BASE_URL + id, Auction.class);
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        Auction[] auctionsFromAPI = restTemplate.getForObject(API_BASE_URL + "?title=" + title, Auction[].class);
        return auctionsFromAPI;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        Auction[] auctionsFromAPI = restTemplate.getForObject(API_BASE_URL + "?currentBid_lte=" + price, Auction[].class);
        return auctionsFromAPI;
    }

}

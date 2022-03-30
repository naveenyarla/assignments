package com.example.clearinghouse.service;

import com.example.clearinghouse.model.Portfolio;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SearchService {

    List<Portfolio> portfolios = PortfolioDataLoader.loadPortfolios();

    public List<Portfolio> getPortfolioOrForm(Portfolio portfolio){

        portfolios.stream()
                .filter(p ->
                        (p.getZipCode().equals(portfolio.getZipCode())) ||
                        (p.getState().equals(portfolio.getState())) ||
                        (p.getCity().equals(portfolio.getCity())) ||
                        (p.getBankType().equals(portfolio.getBankType())) ||
                        (p.getBankName().equals(portfolio.getBankName()))
                ).collect(Collectors.toList());

        return portfolios;
    }

    public List<Portfolio> getPortfolioWithAndForm(Portfolio portfolio){

         return portfolios.stream()
                    .filter(p ->
                        (p.getCity().equals(portfolio.getCity().trim())) &&
                                (p.getState().equals(portfolio.getState().trim()))
                    ).collect(Collectors.toList());

    }
}

package com.example.clearinghouse.service;

import com.example.clearinghouse.model.Portfolio;
import lombok.SneakyThrows;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service

public class PortfolioDataLoader {

    static Pattern pattern = Pattern.compile(",");

    static List<Portfolio> portfolios;

    @SneakyThrows
    public static List<Portfolio> loadPortfolios(){

        try{
            ClassPathResource resource = new ClassPathResource("ProgrammingAssignment.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
                    portfolios = reader.lines().skip(1).map(
                    line -> {
                        String[] info = pattern.split(line);
                        return new Portfolio(
                                info[0].trim(),
                                info[1].trim(),
                                info[2].trim(),
                                info[3].trim(),
                                info[4].trim(),
                                info[5].trim()
                        );

                    }).collect(Collectors.toList());

        }catch (IOException e){
            System.out.println("Sample Exception"+ e.getMessage());
        }
          return portfolios;
    }

    public static List<String> getCities(){
        return portfolios.stream().map(e -> e.getCity()).distinct().collect(Collectors.toList());
    }
    public static List<String> getSates(){
        return portfolios.stream().map(e -> e.getState()).distinct().collect(Collectors.toList());
    }
    public static List<String> getZipCodes(){
        return portfolios.stream().map(e -> e.getZipCode()).distinct().collect(Collectors.toList());
    }
    public static List<String> getBankNames(){
        return portfolios.stream().map(e -> e.getBankName()).distinct().collect(Collectors.toList());
    }
    public static List<String> getBankTypes(){
        return portfolios.stream().map(e -> e.getBankType()).distinct().collect(Collectors.toList());
    }
}

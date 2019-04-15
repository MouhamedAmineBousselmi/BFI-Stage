package com.example.BanqueSI.metier;

import com.example.BanqueSI.EnumRetour.OperationRetour;
import com.example.BanqueSI.dao.ChangeRepository;
import com.example.BanqueSI.entities.Change;
import com.example.BanqueSI.entities.ChangeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.fx.FxQuote;
import yahoofinance.quotes.fx.FxSymbols;

import javax.persistence.RollbackException;
import java.io.IOException;
import java.util.Date;

/**
 * Created by amino on 13/07/2017
 */
@Service
public class ChangeMetierImpl implements ChangeMetier {

    @Autowired
    private ChangeRepository changeRepository;

    @Override
    public OperationRetour AchatDevise(Change c) {
        OperationRetour operationRetour;
        c.setChangeType(ChangeType.ACHAT);
        c.setDateChange(new Date());
        if(c.getMontant() == 0){
            operationRetour = OperationRetour.EMPTY_FORM;
            throw new RollbackException(OperationRetour.EMPTY_FORM.toString());
        }
        changeRepository.save(c);
        operationRetour = OperationRetour.CHANGE_SAVED;
        return operationRetour;
    }

    @Override
    public OperationRetour VenteDevise(Change c) {
        OperationRetour operationRetour;
        c.setChangeType(ChangeType.VENTE);
        c.setDateChange(new Date());

        if(c.getMontant() == 0){
            operationRetour = OperationRetour.EMPTY_FORM;
            throw new RollbackException(OperationRetour.EMPTY_FORM.toString());
        }
        changeRepository.save(c);
        operationRetour = OperationRetour.CHANGE_SAVED;
        return operationRetour;
    }

    @Override
    public double convertisseurDevise(double montant) throws IOException {
        FxQuote usdeur = YahooFinance.getFx(FxSymbols.USDEUR);
        if(usdeur.getPrice() == null){
            throw new RollbackException(OperationRetour.TAUX_DEVISE_SERVICE_NOT_FOUND.toString());
        }
        return Double.parseDouble(usdeur.toString().substring(9,16))*montant;
    }
    @Override
    public double convertisseurDeviseR(double montant) throws IOException {
        FxQuote usdeur = YahooFinance.getFx(FxSymbols.USDEUR);
        if(usdeur.getPrice() == null){
            throw new RollbackException(OperationRetour.TAUX_DEVISE_SERVICE_NOT_FOUND.toString());
        }
        double result = montant/Double.parseDouble(usdeur.toString().substring(9,16));
        return result;
    }

}
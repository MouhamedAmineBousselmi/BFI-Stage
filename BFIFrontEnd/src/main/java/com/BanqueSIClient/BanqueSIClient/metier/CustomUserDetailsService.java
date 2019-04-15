package com.BanqueSIClient.BanqueSIClient.metier;

import com.BanqueSIClient.BanqueSIClient.DTO.ClientDTO;
import com.example.BanqueSI.WebServices.clientWebService.ClientPortServiceStub;
import org.apache.axis2.AxisFault;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fan.jin on 2016-10-31
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            ClientPortServiceStub serviceStub = new ClientPortServiceStub();
            ClientPortServiceStub.LoadClientByUsernameRequest request = new ClientPortServiceStub.LoadClientByUsernameRequest();
            request.setUsername(username);
            ClientPortServiceStub.LoadClientByUsernameResponse response = serviceStub.loadClientByUsername(request);

            ClientDTO clientDTO = new ClientDTO();

            clientDTO.setCodeClient(response.getEmployeAuth().getCodeClient());
            clientDTO.setUsername(response.getEmployeAuth().getNomClient());
            clientDTO.setPassword(response.getEmployeAuth().getPassword());
            clientDTO.setAgence(response.getEmployeAuth().getAgence());
            return clientDTO;
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return  null;
    }
}

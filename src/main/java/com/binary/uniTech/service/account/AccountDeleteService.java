package com.binary.uniTech.service.account;

import com.binary.uniTech.entity.Account;
import com.binary.uniTech.repository.AccountRepository;
import com.binary.uniTech.request.account.AccountDeleteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
@RequiredArgsConstructor
public class AccountDeleteService {
    private final AccountRepository accountRepository;

    public void deleteAll(){
        accountRepository.deleteAll();
    }

    public void deleteByAccountNumber(AccountDeleteRequest deleteRequest){
        accountRepository.deleteByAccountNumber(deleteRequest.getAccountNumber());
    }

}

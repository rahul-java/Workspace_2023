package in.ashokit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPK;
import in.ashokit.repository.AccountRepository;

@Service
public class AccountService {

	private AccountRepository accRepo;

	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}

	public void getDataUsingPK() {

		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("Savings");
		pk.setHolderName("TCS");

		Optional<Account> findById = accRepo.findById(pk);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
	}

	public void saveAccData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVINGS");
		pk.setHolderName("TCS");

		Account acc = new Account();
		acc.setBranchName("Ameerpet");
		acc.setMinBal(5000.00);

		acc.setAccPk(pk); // setting pk class obj to entity obj

		accRepo.save(acc);
	}
}

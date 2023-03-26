package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {

	@Autowired
	@Qualifier("oracleDao")
	private ReportDao reportDao;

	public void generateReport() {
		reportDao.findData();
		System.out.println("generating report....");
	}
}
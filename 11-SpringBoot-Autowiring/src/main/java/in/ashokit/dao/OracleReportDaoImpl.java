package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl :: Constructor");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from oracle db...");
		return "Report data";
	}
}
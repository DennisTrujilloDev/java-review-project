package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

  private TaxPayer[] taxPayers = new TaxPayer[100];
  List<TaxPayer> taxPayersList = new ArrayList<>();
//  private int currentIndex = 0;

//  public int getCurrentIndex() {
//    return currentIndex;
//  }

  public void register(TaxPayer taxPayer) {
    taxPayersList.add(taxPayer);
//    taxPayers[currentIndex++] = taxPayer;
  }

  public double computeTotalMonthlyTaxToCollect() {
    double totalMonthlyTax = 0.0;
    for (TaxPayer taxPayer: taxPayers){
      totalMonthlyTax += taxPayer.computeMonthlyTaxToPay();
    }
    return totalMonthlyTax;
  }
}

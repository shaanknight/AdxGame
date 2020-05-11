package adx.variants.thirtydaysgame;

import java.util.HashSet;
import java.util.Set;

import adx.exceptions.AdXException;
import adx.structures.Campaign;
import adx.structures.SimpleBidEntry;
import adx.util.Logging;
import adx.structures.MarketSegment;

/**
 * An example of a simple agent playing the TwoDays game.
 * 
 * @author Enrique Areyan Viqueira
 */
public class TwentyfiveAgent extends ThirtyDaysThirtyCampaignsAgent {

  public TwentyfiveAgent(String host, int port) {
    super(host, port);
  }

  @Override
  protected ThirtyDaysBidBundle getBidBundle(int day) {
    try {
      Campaign c = null;
      if (day <= 30) {
        Logging.log("[-] Bid for campaign " + day + " which is: " + this.setCampaigns[day - 1]);
        c = this.setCampaigns[day - 1];
      } 
      else {
        throw new AdXException("[x] Bidding for invalid day " + day + ", bids in this game are only for day 1 or 2.");
      }
      // Bidding only on the exact market segment of the campaign.
      Set<SimpleBidEntry> bidEntries = new HashSet<SimpleBidEntry>();
      double val = 0;
      double arr[] = new double[] {1836.0, 517.0, 1795.0, 808.0, 1980.0, 256.0, 2401.0, 407.0};
      for(MarketSegment m2 : MarketSegment.values())
      {
        if(MarketSegment.marketSegmentSubset(c.getMarketSegment(),m2)) {
          if(m2 == MarketSegment.MALE_YOUNG_LOW_INCOME)
            val += arr[0];
          if(m2 == MarketSegment.MALE_YOUNG_HIGH_INCOME)
            val += arr[1];
          if(m2 == MarketSegment.MALE_OLD_LOW_INCOME)
            val += arr[2];
          if(m2 == MarketSegment.MALE_OLD_HIGH_INCOME)
            val += arr[3];
          if(m2 == MarketSegment.FEMALE_YOUNG_LOW_INCOME)
            val += arr[4];
          if(m2 == MarketSegment.FEMALE_YOUNG_HIGH_INCOME)
            val += arr[5];
          if(m2 == MarketSegment.FEMALE_OLD_LOW_INCOME)
            val += arr[6];
          if(m2 == MarketSegment.FEMALE_OLD_HIGH_INCOME)
            val += arr[7];
        }
      }
      for(MarketSegment m2 : MarketSegment.values())
      {
        if(MarketSegment.marketSegmentSubset(c.getMarketSegment(),m2)) {
          if(m2 == MarketSegment.MALE_YOUNG_LOW_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[0]/val)*c.getBudget()));
          if(m2 == MarketSegment.MALE_YOUNG_HIGH_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[1]/val)*c.getBudget()));
          if(m2 == MarketSegment.MALE_OLD_LOW_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[2]/val)*c.getBudget()));
          if(m2 == MarketSegment.MALE_OLD_HIGH_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[3]/val)*c.getBudget()));
          if(m2 == MarketSegment.FEMALE_YOUNG_LOW_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[4]/val)*c.getBudget()));
          if(m2 == MarketSegment.FEMALE_YOUNG_HIGH_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[5]/val)*c.getBudget()));
          if(m2 == MarketSegment.FEMALE_OLD_LOW_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[6]/val)*c.getBudget()));
          if(m2 == MarketSegment.FEMALE_OLD_HIGH_INCOME)
            bidEntries.add(new SimpleBidEntry(m2, 1.01*c.getBudget() / (double) c.getReach(), (arr[7]/val)*c.getBudget()));
        }
      }
      Logging.log("[-] bidEntries = " + bidEntries);
      //return new TwoDaysBidBundle(day, c.getId(), c.getBudget(), bidEntries);
      //return new ThirtyDaysBidBundle(day, c.getId(), 4.256, bidEntries);
      return new ThirtyDaysBidBundle(day, c.getId(), c.getBudget(), bidEntries);
    } catch (AdXException e) {
      Logging.log("[x] Something went wrong getting the bid bundle: " + e.getMessage());
    }
    return null;
  }

  /**
   * Agent's main method.
   * 
   * @param args
   */
  public static void main(String[] args) {
	  TwentyfiveAgent agent = new TwentyfiveAgent("localhost", 9898);
    agent.connect("agent25");
  }

}

Game Theory Project


Submitted by:- 
Tanmay Kumar Sinha(20171200)
Sayantan Jana(20171185)
Yash Chaurasia(20171116)

We have implemented the following strategy:-

1.) Spending limit for each segment is divided into eight parts, depending on the distribution.
2.) The bid amount is 0.8 * budget/reach

First we observed that bidding 1*budget/reach is the equilibrium strategy for a single auction. But, upon trying out different strategies, we found that, in the long run, bidding 0.8 * budget/reach is the optimal strategy( assuming that multiple people bid 1).

We ran extensive simulations and the following sample results were found(agent18 is our agent, and the others are different agents with varying parameters).


  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent17  #  9698.71  ###
  ###      agent18  #  8621.71  ###
  ###      agent23  #  8551.31  ###
  ###      agent11  #  6177.68  ###
  ###      agent16  #  5906.92  ###
  ###      agent24  #  4464.35  ###
  ###      agent19  #  2785.27  ###
  ###      agent21  # -1743.58  ###
  ###      agent22  # -2625.99  ###
  ###       agent4  # -5231.85  ###
  ###########################################

    ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent18  # 12979.18  ###
  ###      agent24  #  8749.63  ###
  ###       agent4  #  8565.59  ###
  ###      agent19  #  5575.86  ###
  ###      agent23  #  5083.70  ###
  ###      agent17  #  4487.79  ###
  ###      agent16  #  3182.74  ###
  ###      agent21  #  2318.56  ###
  ###      agent11  #  2279.11  ###
  ###      agent22  # -2166.09  ###
  ###########################################


  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent18  #  9999.51  ###
  ###      agent22  #  5851.38  ###
  ###      agent16  #  5648.85  ###
  ###      agent17  #  5417.57  ###
  ###       agent4  #  5306.86  ###
  ###      agent23  #  2656.95  ###
  ###      agent19  #  2126.68  ###
  ###      agent11  #   324.86  ###
  ###      agent21  #    48.29  ###
  ###      agent24  #  -987.59  ###
  ###########################################


  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent18  # 19395.70  ###
  ###      agent24  # 12795.24  ###
  ###      agent23  #  9001.28  ###
  ###      agent19  #  5654.91  ###
  ###      agent17  #  4777.03  ###
  ###      agent16  #  2215.63  ###
  ###      agent22  #  1124.51  ###
  ###       agent4  #   591.48  ###
  ###      agent21  #  -491.18  ###
  ###      agent11  # -1227.76  ###
  ###########################################


  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent18  # 20020.27  ###
  ###       agent4  # 11408.57  ###
  ###      agent24  #  9608.41  ###
  ###      agent19  #  6556.96  ###
  ###      agent22  #  5531.72  ###
  ###      agent21  #  2832.17  ###
  ###      agent17  #  2339.51  ###
  ###      agent16  #  1824.27  ###
  ###      agent23  #   527.78  ###
  ###      agent11  #  -401.06  ###
  ###########################################


  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent18  # 11470.25  ###
  ###      agent17  # 10748.57  ###
  ###       agent4  #  5658.93  ###
  ###      agent22  #  4759.95  ###
  ###      agent23  #  4347.66  ###
  ###      agent21  #  3052.51  ###
  ###      agent19  #  2163.88  ###
  ###      agent24  #  1315.05  ###
  ###      agent11  #   368.36  ###
  ###      agent16  #  -792.80  ###
  ###########################################

  
  ################# RESULT ##################
  ####      Agent   #  Profit   ###
  ###########################################
  ###      agent16  # 11163.54  ###
  ###      agent18  #  7754.15  ###
  ###      agent19  #  5084.62  ###
  ###      agent22  #  3745.59  ###
  ###      agent23  #  3449.47  ###
  ###      agent17  #  3065.48  ###
  ###       agent4  #  1101.02  ###
  ###      agent11  #   457.20  ###
  ###      agent24  #   206.80  ###
  ###      agent21  # -4029.66  ###
  ###########################################
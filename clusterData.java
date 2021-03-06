 === Run information ===

Scheme:       weka.classifiers.bayes.NaiveBayes 
Relation:     vote
Instances:    435
Attributes:   17
              handicapped-infants
              water-project-cost-sharing
              adoption-of-the-budget-resolution
              physician-fee-freeze
              el-salvador-aid
              religious-groups-in-schools
              anti-satellite-test-ban
              aid-to-nicaraguan-contras
              mx-missile
              immigration
              synfuels-corporation-cutback
              education-spending
              superfund-right-to-sue
              crime
              duty-free-exports
              export-administration-act-south-africa
              Class
Test mode:    10-fold cross-validation

=== Classifier model (full training set) ===

Naive Bayes Classifier

                                              Class
Attribute                                  democrat republican
                                             (0.61)     (0.39)
===============================================================
handicapped-infants
  n                                            103.0      135.0
  y                                            157.0       32.0
  [total]                                      260.0      167.0

water-project-cost-sharing
  n                                            120.0       74.0
  y                                            121.0       76.0
  [total]                                      241.0      150.0

adoption-of-the-budget-resolution
  n                                             30.0      143.0
  y                                            232.0       23.0
  [total]                                      262.0      166.0

physician-fee-freeze
  n                                            246.0        3.0
  y                                             15.0      164.0
  [total]                                      261.0      167.0

el-salvador-aid
  n                                            201.0        9.0
  y                                             56.0      158.0
  [total]                                      257.0      167.0

religious-groups-in-schools
  n                                            136.0       18.0
  y                                            124.0      150.0
  [total]                                      260.0      168.0

anti-satellite-test-ban
  n                                             60.0      124.0
  y                                            201.0       40.0
  [total]                                      261.0      164.0

aid-to-nicaraguan-contras
  n                                             46.0      134.0
  y                                            219.0       25.0
  [total]                                      265.0      159.0

mx-missile
  n                                             61.0      147.0
  y                                            189.0       20.0
  [total]                                      250.0      167.0

immigration
  n                                            140.0       74.0
  y                                            125.0       93.0
  [total]                                      265.0      167.0

synfuels-corporation-cutback
  n                                            127.0      139.0
  y                                            130.0       22.0
  [total]                                      257.0      161.0

education-spending
  n                                            214.0       21.0
  y                                             37.0      136.0
  [total]                                      251.0      157.0

superfund-right-to-sue
  n                                            180.0       23.0
  y                                             74.0      137.0
  [total]                                      254.0      160.0

crime
  n                                            168.0        4.0
  y                                             91.0      159.0
  [total]                                      259.0      163.0

duty-free-exports
  n                                             92.0      143.0
  y                                            161.0       15.0
  [total]                                      253.0      158.0

export-administration-act-south-africa
  n                                             13.0       51.0
  y                                            174.0       97.0
  [total]                                      187.0      148.0



Time taken to build model: 0.01 seconds

=== Stratified cross-validation ===
=== Summary ===

Correctly Classified Instances         392               90.1149 %
Incorrectly Classified Instances        43                9.8851 %
Kappa statistic                          0.7949
Mean absolute error                      0.0995
Root mean squared error                  0.2977
Relative absolute error                 20.9815 %
Root relative squared error             61.1406 %
Total Number of Instances              435     

=== Detailed Accuracy By Class ===

                 TP Rate  FP Rate  Precision  Recall   F-Measure  MCC      ROC Area  PRC Area  Class
                 0.891    0.083    0.944      0.891    0.917      0.797    0.973     0.984     democrat
                 0.917    0.109    0.842      0.917    0.877      0.797    0.973     0.957     republican
Weighted Avg.    0.901    0.093    0.905      0.901    0.902      0.797    0.973     0.973     

=== Confusion Matrix ===

   a   b   <-- classified as
 238  29 |   a = democrat
  14 154 |   b = republican

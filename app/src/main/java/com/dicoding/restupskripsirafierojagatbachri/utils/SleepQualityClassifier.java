package com.dicoding.restupskripsirafierojagatbachri.utils;

public class SleepQualityClassifier {
    public static double[] score(double[] input) {
        double[] var0;
        if (input[0] <= 435.0) {
            if (input[8] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var0 = new double[] {0.15966844803141023, 0.0332642600065438, 0.8070672919620461};
                        } else {
                            var0 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var0 = new double[] {0.0, 0.7854077253218885, 0.21459227467811154};
                        } else {
                            var0 = new double[] {0.0, 0.21708185053380785, 0.7829181494661922};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var0 = new double[] {0.0, 0.9617773530817009, 0.03822264691829909};
                        } else {
                            var0 = new double[] {0.0, 0.3885350318471337, 0.6114649681528662};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var0 = new double[] {0.0, 0.6039603960396039, 0.39603960396039606};
                        }
                    }
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[0] <= 285.0) {
                            var0 = new double[] {0.0, 0.6559139784946237, 0.34408602150537637};
                        } else {
                            var0 = new double[] {0.4667623146819703, 0.43758967001434723, 0.09564801530368244};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var0 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var0 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[7] <= 0.5) {
                    var0 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                } else {
                    var0 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var0 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var1;
        if (input[9] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var1 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var1 = new double[] {0.0, 0.17888563049853376, 0.8211143695014663};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var1 = new double[] {0.345059218667138, 0.05391550291674031, 0.6010252784161217};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var1 = new double[] {0.0, 0.5567144719687093, 0.4432855280312908};
                        } else {
                            var1 = new double[] {0.0, 0.1788856304985337, 0.8211143695014663};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            var1 = new double[] {0.9070631970260223, 0.0, 0.0929368029739777};
                        } else {
                            var1 = new double[] {0.6466431095406361, 0.0, 0.35335689045936397};
                        }
                    }
                } else {
                    var1 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var1 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[12] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var1 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        } else {
                            var1 = new double[] {0.0, 0.9242424242424242, 0.07575757575757575};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var1 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var1 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            }
        }
        double[] var2;
        if (input[9] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var2 = new double[] {0.0, 0.16591115140525833, 0.8340888485947416};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var2 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var2 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var2 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        } else {
                            var2 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var2 = new double[] {0.0, 0.8934753661784288, 0.10652463382157122};
                        } else {
                            var2 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var2 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var2 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[3] <= 0.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.9320882852292021, 0.06791171477079795};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var2 = new double[] {0.0, 0.7176470588235294, 0.2823529411764706};
                        } else {
                            var2 = new double[] {0.0, 0.820627802690583, 0.17937219730941706};
                        }
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    var2 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                } else {
                    var2 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                }
            }
        }
        double[] var3;
        if (input[0] <= 435.0) {
            if (input[0] <= 285.0) {
                if (input[8] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var3 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var3 = new double[] {0.0, 0.3952483801295897, 0.6047516198704104};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 0.9242424242424243, 0.07575757575757575};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var3 = new double[] {0.4914400805639476, 0.3071500503524673, 0.2014098690835851};
                    } else {
                        if (input[5] <= 0.5) {
                            var3 = new double[] {0.0, 0.3788819875776398, 0.6211180124223603};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var3 = new double[] {0.08009190874774333, 0.05005744296733958, 0.869850648284917};
                        } else {
                            var3 = new double[] {0.7454175152749491, 0.0, 0.2545824847250509};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var3 = new double[] {0.0, 0.7349397590361446, 0.2650602409638554};
                        } else {
                            var3 = new double[] {0.46900528592023066, 0.1465641518500721, 0.3844305622296973};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var3 = new double[] {0.0, 0.363817097415507, 0.6361829025844931};
                        } else {
                            var3 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                var3 = new double[] {0.0, 0.0, 1.0};
            } else {
                var3 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var4;
        if (input[12] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var4 = new double[] {0.07221071322876589, 0.6318437407517017, 0.2959455460195324};
                        } else {
                            var4 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var4 = new double[] {0.0, 0.26031294452347087, 0.7396870554765291};
                        } else {
                            var4 = new double[] {0.0, 0.8383185125303153, 0.1616814874696847};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var4 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        } else {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[3] <= 0.5) {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 0.9242424242424242, 0.07575757575757575};
                        }
                    } else {
                        var4 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    var4 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[0] <= 435.0) {
                if (input[0] <= 285.0) {
                    if (input[2] <= 0.5) {
                        var4 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var4 = new double[] {0.09048766920081587, 0.056554793250509924, 0.8529575375486743};
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var4 = new double[] {0.0, 0.1900311526479751, 0.8099688473520249};
                        } else {
                            var4 = new double[] {0.44852941176470584, 0.0, 0.5514705882352942};
                        }
                    }
                }
            } else {
                var4 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
            }
        }
        double[] var5;
        if (input[11] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {0.46052217678515256, 0.28782636049072036, 0.2516514627241271};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var5 = new double[] {0.0, 0.21708185053380782, 0.7829181494661922};
                        } else {
                            var5 = new double[] {0.13990825688073397, 0.0, 0.8600917431192661};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var5 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var5 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var5 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[6] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[3] <= 0.5) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 0.820627802690583, 0.17937219730941706};
                        }
                    }
                } else {
                    var5 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var5 = new double[] {0.0, 0.4326241134751774, 0.5673758865248227};
                        } else {
                            var5 = new double[] {0.0, 0.6559139784946236, 0.34408602150537637};
                        }
                    } else {
                        var5 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var5 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        if (input[0] <= 360.0) {
                            var5 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        } else {
                            var5 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        }
                    }
                }
            }
        }
        double[] var6;
        if (input[4] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var6 = new double[] {0.4107744107744108, 0.0, 0.5892255892255893};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var6 = new double[] {0.08892128279883381, 0.0, 0.9110787172011662};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var6 = new double[] {0.0, 0.8422090729783038, 0.15779092702169625};
                    } else {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.0, 0.7873955960516325, 0.2126044039483675};
                        } else {
                            var6 = new double[] {0.0, 0.31389365351629506, 0.6861063464837049};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[8] <= 0.5) {
                        var6 = new double[] {0.8026315789473685, 0.0, 0.19736842105263158};
                    } else {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var6 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                if (input[12] <= 0.5) {
                    var6 = new double[] {0.0, 1.0, 0.0};
                } else {
                    var6 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var6 = new double[] {0.0, 0.1601049868766404, 0.8398950131233596};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var6 = new double[] {0.0, 0.8934753661784288, 0.10652463382157124};
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[12] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var7 = new double[] {0.0, 0.9786096256684492, 0.021390374331550808};
                        } else {
                            var7 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                        }
                    } else {
                        if (input[0] <= 435.0) {
                            var7 = new double[] {0.0, 0.4452554744525547, 0.5547445255474454};
                        } else {
                            var7 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                } else {
                    var7 = new double[] {0.8026315789473685, 0.0, 0.19736842105263158};
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.9869519832985386, 0.0, 0.013048016701461378};
                        } else {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var7 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var7 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        var7 = new double[] {0.38740407515215664, 0.24212754697009795, 0.37046837787774545};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var7 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var7 = new double[] {0.0, 0.14489311163895485, 0.8551068883610451};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var7 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var7 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var8;
        if (input[0] <= 435.0) {
            if (input[9] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var8 = new double[] {0.07343315025205026, 0.06884357836129713, 0.8577232713866526};
                        } else {
                            var8 = new double[] {0.21532578320341228, 0.3140167671716429, 0.47065744962494477};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var8 = new double[] {0.0, 0.3885350318471337, 0.6114649681528663};
                        } else {
                            var8 = new double[] {0.0, 0.6466431095406361, 0.353356890459364};
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var8 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                    } else {
                        if (input[0] <= 360.0) {
                            var8 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var8 = new double[] {0.9360613810741687, 0.0, 0.06393861892583119};
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[12] <= 0.5) {
                            var8 = new double[] {0.0, 0.9143468950749465, 0.08565310492505354};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var8 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                    } else {
                        if (input[3] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.8840579710144928, 0.11594202898550726};
                        }
                    }
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[3] <= 0.5) {
                    var8 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var8 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                }
            } else {
                var8 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
            }
        }
        double[] var9;
        if (input[10] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var9 = new double[] {0.21305391835843698, 0.06657934948701157, 0.7203667321545515};
                        } else {
                            var9 = new double[] {0.5202558635394456, 0.0, 0.4797441364605544};
                        }
                    } else {
                        var9 = new double[] {0.0, 0.7176470588235294, 0.2823529411764706};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var9 = new double[] {0.0, 0.2531120331950208, 0.7468879668049793};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var9 = new double[] {0.0, 0.912718204488778, 0.08728179551122195};
                        } else {
                            var9 = new double[] {0.15701415701415702, 0.39253539253539255, 0.4504504504504505};
                        }
                    } else {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var9 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var9 = new double[] {0.0, 0.5335276967930029, 0.466472303206997};
                        }
                    } else {
                        var9 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                }
            }
        } else {
            if (input[0] <= 360.0) {
                if (input[8] <= 0.5) {
                    var9 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var9 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                }
            } else {
                if (input[2] <= 0.5) {
                    var9 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var9 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        double[] var10;
        if (input[11] <= 0.5) {
            if (input[2] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var10 = new double[] {0.973404255319149, 0.0, 0.026595744680851057};
                        } else {
                            var10 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
                        }
                    } else {
                        var10 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var10 = new double[] {0.17921410209327948, 0.03733627126943322, 0.7834496266372872};
                        } else {
                            var10 = new double[] {0.0, 0.13232104121475055, 0.8676789587852495};
                        }
                    } else {
                        var10 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    var10 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                } else {
                    if (input[6] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        }
                    } else {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[9] <= 0.5) {
                            var10 = new double[] {0.0, 0.9581151832460733, 0.041884816753926704};
                        } else {
                            var10 = new double[] {0.0, 0.9690042619139869, 0.03099573808601317};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var10 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[1] <= 0.5) {
                            var10 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var10 = new double[] {0.0, 0.363817097415507, 0.6361829025844931};
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    var10 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                } else {
                    var10 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                }
            }
        }
        double[] var11;
        if (input[0] <= 435.0) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var11 = new double[] {0.0, 0.3096446700507614, 0.6903553299492386};
                        } else {
                            var11 = new double[] {0.15803108808290153, 0.0, 0.8419689119170984};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var11 = new double[] {0.3068217541653568, 0.09588179817667399, 0.5972964476579693};
                        } else {
                            var11 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        if (input[7] <= 0.5) {
                            var11 = new double[] {0.0, 0.8422090729783038, 0.15779092702169625};
                        } else {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var11 = new double[] {0.0, 0.7065637065637065, 0.2934362934362934};
                        } else {
                            var11 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    var11 = new double[] {0.964080459770115, 0.0, 0.03591954022988506};
                } else {
                    var11 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var11 = new double[] {0.9725123694337549, 0.0, 0.027487630566245192};
            } else {
                if (input[3] <= 0.5) {
                    var11 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var11 = new double[] {0.2706600110926234, 0.507487520798669, 0.2218524681087077};
                }
            }
        }
        double[] var12;
        if (input[8] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var12 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var12 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var12 = new double[] {0.0, 0.12175648702594812, 0.8782435129740519};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var12 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        } else {
                            var12 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var12 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var12 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    } else {
                        var12 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var12 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var12 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        }
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 435.0) {
                if (input[0] <= 285.0) {
                    if (input[4] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var12 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        } else {
                            var12 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        }
                    } else {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var12 = new double[] {0.43326427937259543, 0.27079017460787214, 0.2959455460195324};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var12 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var12 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var12 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        double[] var13;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var13 = new double[] {0.0, 0.545085296506905, 0.45491470349309504};
                        } else {
                            var13 = new double[] {0.13196322336398053, 0.16495402920497568, 0.7030827474310438};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var13 = new double[] {0.0, 0.9481865284974094, 0.05181347150259066};
                        } else {
                            var13 = new double[] {0.0, 0.5495495495495496, 0.4504504504504504};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var13 = new double[] {0.08884034225377753, 0.055525213908610954, 0.8556344438376114};
                        } else {
                            var13 = new double[] {0.5495495495495496, 0.0, 0.4504504504504505};
                        }
                    } else {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var13 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[0] <= 285.0) {
                        if (input[4] <= 0.5) {
                            var13 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        } else {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 0.17888563049853373, 0.8211143695014663};
                        }
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[2] <= 0.5) {
                    var13 = new double[] {0.964080459770115, 0.0, 0.03591954022988506};
                } else {
                    var13 = new double[] {0.32795698924731187, 0.0, 0.6720430107526882};
                }
            } else {
                if (input[0] <= 360.0) {
                    var13 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                } else {
                    if (input[0] <= 435.0) {
                        var13 = new double[] {0.8798076923076924, 0.0, 0.1201923076923077};
                    } else {
                        var13 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        }
        double[] var14;
        if (input[8] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 0.8840579710144928, 0.11594202898550723};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var14 = new double[] {0.0, 0.8663324979114453, 0.1336675020885547};
                        } else {
                            var14 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var14 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var14 = new double[] {0.0, 0.6288659793814434, 0.37113402061855666};
                        } else {
                            var14 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var14 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var14 = new double[] {0.0, 0.3034825870646766, 0.6965174129353233};
                        } else {
                            var14 = new double[] {0.0, 0.1900311526479751, 0.809968847352025};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var14 = new double[] {0.23371647509578544, 0.0, 0.7662835249042145};
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var14 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                }
            }
        } else {
            if (input[1] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var14 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var14 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var14 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                    } else {
                        var14 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    var14 = new double[] {0.2584745762711864, 0.0, 0.7415254237288136};
                }
            }
        }
        double[] var15;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[4] <= 0.5) {
                            var15 = new double[] {0.17256011315417255, 0.14380009429514382, 0.6836397925506837};
                        } else {
                            var15 = new double[] {0.0, 0.7176470588235294, 0.2823529411764706};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var15 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var15 = new double[] {0.09983633387888705, 0.0, 0.900163666121113};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var15 = new double[] {0.0, 0.820627802690583, 0.17937219730941706};
                        } else {
                            var15 = new double[] {0.0, 0.6192893401015228, 0.38071065989847713};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var15 = new double[] {0.0, 0.13232104121475055, 0.8676789587852495};
                        } else {
                            var15 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var15 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var15 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var15 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[0] <= 405.0) {
                        var15 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                    } else {
                        var15 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var15 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                }
            } else {
                if (input[2] <= 0.5) {
                    var15 = new double[] {0.9651000465332713, 0.0, 0.034899953466728716};
                } else {
                    var15 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                }
            }
        }
        double[] var16;
        if (input[4] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var16 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var16 = new double[] {0.0, 0.5861049519586106, 0.4138950480413895};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var16 = new double[] {0.0, 0.26406926406926406, 0.7359307359307359};
                        } else {
                            var16 = new double[] {0.13232104121475052, 0.0, 0.8676789587852494};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[1] <= 0.5) {
                            var16 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var16 = new double[] {0.7648902821316614, 0.0, 0.23510971786833856};
                        }
                    } else {
                        var16 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var16 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 435.0) {
                        if (input[5] <= 0.5) {
                            var16 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                        } else {
                            var16 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    } else {
                        var16 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var16 = new double[] {0.5188729399255715, 0.16214779372674112, 0.3189792663476874};
                    } else {
                        if (input[11] <= 0.5) {
                            var16 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var16 = new double[] {0.0, 0.5495495495495495, 0.45045045045045046};
                        }
                    }
                } else {
                    var16 = new double[] {0.0, 0.40397350993377484, 0.5960264900662252};
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[0] <= 285.0) {
                            var16 = new double[] {0.0, 0.9771167048054921, 0.022883295194508};
                        } else {
                            var16 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var16 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var16 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                    } else {
                        if (input[7] <= 0.5) {
                            var16 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        } else {
                            var16 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var17;
        if (input[10] <= 0.5) {
            if (input[0] <= 285.0) {
                if (input[6] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var17 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var17 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var17 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        } else {
                            var17 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        var17 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        var17 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[0] <= 435.0) {
                            var17 = new double[] {0.10940477524941147, 0.30770093038896984, 0.5828942943616187};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var17 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var17 = new double[] {0.1961414790996784, 0.0, 0.8038585209003215};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var17 = new double[] {0.14586758332087876, 0.13675085936332387, 0.7173815573157973};
                        } else {
                            var17 = new double[] {0.0, 0.5241242564441507, 0.4758757435558494};
                        }
                    } else {
                        var17 = new double[] {0.0, 0.9014778325123153, 0.0985221674876847};
                    }
                }
            }
        } else {
            if (input[7] <= 0.5) {
                if (input[1] <= 0.5) {
                    var17 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var17 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
                }
            } else {
                var17 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var18;
        if (input[11] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var18 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var18 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    var18 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var18 = new double[] {0.0, 0.24629878869448182, 0.7537012113055181};
                        } else {
                            var18 = new double[] {0.6515353805073432, 0.0814419225634179, 0.267022696929239};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[0] <= 405.0) {
                            var18 = new double[] {0.5941558441558442, 0.0, 0.4058441558441559};
                        } else {
                            var18 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var18 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var18 = new double[] {0.0, 0.8840579710144928, 0.11594202898550725};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var18 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var18 = new double[] {0.0, 0.9195979899497487, 0.08040201005025126};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var18 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var18 = new double[] {0.0, 0.727427597955707, 0.272572402044293};
                        } else {
                            var18 = new double[] {0.0, 0.3788819875776398, 0.6211180124223602};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    var18 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                } else {
                    if (input[5] <= 0.5) {
                        var18 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var18 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var19;
        if (input[3] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var19 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var19 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    if (input[7] <= 0.5) {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                var19 = new double[] {0.0, 0.9581151832460733, 0.04188481675392669};
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[1] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var19 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var19 = new double[] {0.0, 0.9384615384615385, 0.061538461538461535};
                        } else {
                            var19 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var19 = new double[] {0.0, 0.5551061678463094, 0.4448938321536906};
                        } else {
                            var19 = new double[] {0.12190856857356981, 0.22857856607544344, 0.6495128653509867};
                        }
                    } else {
                        var19 = new double[] {0.8299319727891156, 0.0, 0.17006802721088435};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var19 = new double[] {0.0, 0.31389365351629506, 0.6861063464837049};
                        } else {
                            var19 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var19 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        } else {
                            var19 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var19 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        } else {
                            var19 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        }
                    } else {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var20;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var20 = new double[] {0.0, 0.47780678851174935, 0.5221932114882507};
                        } else {
                            var20 = new double[] {0.0, 0.6703296703296703, 0.3296703296703296};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var20 = new double[] {0.064269722112472, 0.04016857632029501, 0.8955617015672329};
                        } else {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var20 = new double[] {0.0, 0.7034596375617793, 0.2965403624382208};
                        } else {
                            var20 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var20 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        } else {
                            var20 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[1] <= 0.5) {
                            var20 = new double[] {0.0, 0.8026315789473685, 0.19736842105263158};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var20 = new double[] {0.0, 0.8840579710144928, 0.11594202898550725};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var20 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var20 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[3] <= 0.5) {
                    var20 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[6] <= 0.5) {
                        var20 = new double[] {0.9070631970260223, 0.0, 0.0929368029739777};
                    } else {
                        var20 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                    }
                }
            } else {
                var20 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
            }
        }
        double[] var21;
        if (input[12] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[8] <= 0.5) {
                        var21 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    } else {
                        if (input[3] <= 0.5) {
                            var21 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var21 = new double[] {0.8951781970649895, 0.0, 0.10482180293501048};
                        }
                    }
                } else {
                    if (input[0] <= 405.0) {
                        var21 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                    } else {
                        var21 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var21 = new double[] {0.0, 0.9320882852292021, 0.06791171477079795};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var21 = new double[] {0.056266574426380715, 0.5978323532802952, 0.3459010722933241};
                        } else {
                            var21 = new double[] {0.0, 0.6559139784946236, 0.3440860215053763};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var21 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var21 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var21 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        } else {
                            var21 = new double[] {0.0, 0.5495495495495496, 0.45045045045045046};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var21 = new double[] {0.0, 0.2120509849362688, 0.7879490150637312};
                        } else {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    var21 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var21 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var22;
        if (input[8] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[0] <= 435.0) {
                        if (input[6] <= 0.5) {
                            var22 = new double[] {0.0, 0.14489311163895488, 0.8551068883610452};
                        } else {
                            var22 = new double[] {0.1439669584029895, 0.029993116333956148, 0.8260399252630544};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var22 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                        } else {
                            var22 = new double[] {0.9070631970260223, 0.0, 0.0929368029739777};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.0, 0.9320882852292021, 0.06791171477079795};
                        } else {
                            var22 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var22 = new double[] {0.0, 0.20962199312714777, 0.7903780068728523};
                        } else {
                            var22 = new double[] {0.0, 0.6622436670687576, 0.33775633293124246};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var22 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var22 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        var22 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.0, 0.8728139904610493, 0.1271860095389507};
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var22 = new double[] {0.9799196787148594, 0.0, 0.020080321285140562};
                    } else {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.44750114626318205, 0.13984410820724438, 0.4126547455295736};
                        } else {
                            var22 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        var22 = new double[] {0.8798076923076924, 0.0, 0.1201923076923077};
                    } else {
                        var22 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    var22 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                } else {
                    var22 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var23;
        if (input[0] <= 435.0) {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[6] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var23 = new double[] {0.0, 0.7806215722120659, 0.21937842778793418};
                        } else {
                            var23 = new double[] {0.0, 0.981609195402299, 0.01839080459770115};
                        }
                    } else {
                        var23 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var23 = new double[] {0.2865531415149736, 0.5372871403405756, 0.17615971814445097};
                        } else {
                            var23 = new double[] {0.03754423757501153, 0.5162332666564088, 0.44622249576857975};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var23 = new double[] {0.9446902654867256, 0.0, 0.05530973451327433};
                        } else {
                            var23 = new double[] {0.3933897621926642, 0.12293430068520758, 0.4836759371221282};
                        }
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var23 = new double[] {0.06784373696649522, 0.04240233560405952, 0.8897539274294453};
                        } else {
                            var23 = new double[] {0.21328671328671328, 0.0, 0.7867132867132868};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var23 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var23 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        var23 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    } else {
                        var23 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    var23 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[6] <= 0.5) {
                        var23 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var23 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                }
            } else {
                var23 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var24;
        if (input[8] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[5] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var24 = new double[] {0.0, 0.17478510028653294, 0.8252148997134671};
                        } else {
                            var24 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var24 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    var24 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[3] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var24 = new double[] {0.0, 0.9014778325123153, 0.0985221674876847};
                        } else {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var24 = new double[] {0.0, 0.9296600234466589, 0.07033997655334114};
                        } else {
                            var24 = new double[] {0.0, 0.6559139784946236, 0.34408602150537637};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var24 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var24 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var24 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var24 = new double[] {0.6385345109584559, 0.09977101733725875, 0.2616944717042852};
                        } else {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var24 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var24 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                }
            } else {
                if (input[2] <= 0.5) {
                    var24 = new double[] {0.9887438090950021, 0.0, 0.011256190904997748};
                } else {
                    var24 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        return mulVectorNumber(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine0(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14), var15), var16), var17), var18), var19), var20), var21), var22), var23), var24), 0.01);
    }
    public static double[] subroutine0(double[] input) {
        double[] var0;
        if (input[0] <= 435.0) {
            if (input[0] <= 285.0) {
                if (input[4] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var0 = new double[] {0.0, 0.8422090729783038, 0.15779092702169625};
                        } else {
                            var0 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var0 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        } else {
                            var0 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var0 = new double[] {0.07934314283391596, 0.12397366067799369, 0.7966831964880904};
                        } else {
                            var0 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var0 = new double[] {0.0, 0.7020988490182803, 0.2979011509817197};
                        } else {
                            var0 = new double[] {0.0, 0.6354166666666666, 0.36458333333333337};
                        }
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var0 = new double[] {0.49268046441191315, 0.15396264512872287, 0.35335689045936397};
                        } else {
                            var0 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var0 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    var0 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var0 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
            }
        }
        double[] var1;
        if (input[8] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var1 = new double[] {0.0, 0.8206278026905829, 0.17937219730941706};
                        } else {
                            var1 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[0] <= 285.0) {
                            var1 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var1 = new double[] {0.0, 0.26406926406926406, 0.735930735930736};
                        }
                    }
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[10] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var1 = new double[] {0.0, 0.45864661654135336, 0.5413533834586466};
                        } else {
                            var1 = new double[] {0.11121239744758435, 0.0, 0.8887876025524156};
                        }
                    } else {
                        var1 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var1 = new double[] {0.8591549295774649, 0.0, 0.14084507042253522};
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[5] <= 0.5) {
                        var1 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.9165275459098498, 0.0, 0.08347245409015025};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var1 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    var1 = new double[] {0.4464775846294602, 0.2790484903934126, 0.2744739249771272};
                } else {
                    if (input[1] <= 0.5) {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var2;
        if (input[0] <= 435.0) {
            if (input[11] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var2 = new double[] {0.09744408945686901, 0.24361022364217258, 0.6589456869009584};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 315.0) {
                            var2 = new double[] {0.6153846153846154, 0.38461538461538464, 0.0};
                        } else {
                            var2 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        var2 = new double[] {0.6612466124661247, 0.0, 0.33875338753387535};
                    } else {
                        var2 = new double[] {0.8299319727891157, 0.0, 0.17006802721088438};
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var2 = new double[] {0.0, 0.820627802690583, 0.179372197309417};
                        } else {
                            var2 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var2 = new double[] {0.0, 0.9744408945686901, 0.025559105431309907};
                        } else {
                            var2 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[2] <= 0.5) {
                            var2 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var2 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    } else {
                        var2 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[7] <= 0.5) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var2 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                }
            } else {
                var2 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
            }
        }
        double[] var3;
        if (input[10] <= 0.5) {
            if (input[2] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var3 = new double[] {0.0, 0.5665634674922602, 0.43343653250773995};
                        } else {
                            var3 = new double[] {0.0, 0.9519807923169267, 0.04801920768307321};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var3 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[0] <= 435.0) {
                        if (input[9] <= 0.5) {
                            var3 = new double[] {0.0828101136942135, 0.05175632105888344, 0.8654335652469032};
                        } else {
                            var3 = new double[] {0.0, 0.7806215722120659, 0.21937842778793418};
                        }
                    } else {
                        var3 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[4] <= 0.5) {
                            var3 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var3 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        } else {
                            var3 = new double[] {0.0, 0.4157740993184031, 0.584225900681597};
                        }
                    }
                } else {
                    var3 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[3] <= 0.5) {
                    var3 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var3 = new double[] {0.7648902821316614, 0.0, 0.23510971786833856};
                }
            } else {
                var3 = new double[] {0.9669749009247028, 0.0, 0.03302509907529723};
            }
        }
        double[] var4;
        if (input[11] <= 0.5) {
            if (input[0] <= 435.0) {
                if (input[8] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var4 = new double[] {0.0, 0.1268191268191268, 0.8731808731808732};
                        } else {
                            var4 = new double[] {0.37888198757763975, 0.0, 0.6211180124223603};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var4 = new double[] {0.0, 0.1940615058324496, 0.8059384941675503};
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var4 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var4 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var4 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    var4 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var4 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[3] <= 0.5) {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var4 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var4 = new double[] {0.0, 0.6853932584269663, 0.31460674157303375};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var4 = new double[] {0.10321489001692048, 0.5160744500846024, 0.38071065989847724};
                        } else {
                            var4 = new double[] {0.0, 0.6559139784946237, 0.34408602150537637};
                        }
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[9] <= 0.5) {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var4 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var4 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var5;
        if (input[1] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {0.0, 0.7922077922077922, 0.20779220779220778};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var5 = new double[] {0.06958505632396977, 0.2174533010124055, 0.7129616426636248};
                        } else {
                            var5 = new double[] {0.0, 0.13232104121475055, 0.8676789587852495};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var5 = new double[] {0.8702983138780803, 0.0, 0.12970168612191957};
                    } else {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var5 = new double[] {0.7619047619047619, 0.2380952380952381, 0.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var5 = new double[] {0.6832341617080855, 0.10675533776688835, 0.21001050052502626};
                        } else {
                            var5 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                } else {
                    var5 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var5 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                    } else {
                        if (input[5] <= 0.5) {
                            var5 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var5 = new double[] {0.0, 0.33701657458563533, 0.6629834254143646};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var5 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                    } else {
                        var5 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var5 = new double[] {0.0, 0.8026315789473685, 0.19736842105263158};
                        } else {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var5 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var5 = new double[] {0.0, 0.6039603960396039, 0.39603960396039606};
                        }
                    } else {
                        var5 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var6;
        if (input[0] <= 435.0) {
            if (input[9] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[8] <= 0.5) {
                            var6 = new double[] {0.0, 0.571619812583668, 0.42838018741633194};
                        } else {
                            var6 = new double[] {0.4384546271338725, 0.2740341419586703, 0.28751123090745734};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var6 = new double[] {0.08564408564408563, 0.10705510705510704, 0.8073008073008073};
                        } else {
                            var6 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.41709401709401706, 0.10427350427350426, 0.47863247863247865};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var6 = new double[] {0.0, 0.29373996789727125, 0.7062600321027287};
                        } else {
                            var6 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var6 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var6 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var6 = new double[] {0.0, 0.9682539682539683, 0.031746031746031744};
                        } else {
                            var6 = new double[] {0.0, 0.8840579710144928, 0.11594202898550726};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var6 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[5] <= 0.5) {
                    var6 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                } else {
                    var6 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var7;
        if (input[0] <= 435.0) {
            if (input[0] <= 285.0) {
                if (input[3] <= 0.5) {
                    var7 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.35032304379038043, 0.2189519023689878, 0.4307250538406317};
                        } else {
                            var7 = new double[] {0.0, 0.9014778325123153, 0.09852216748768472};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.8663324979114453, 0.1336675020885547};
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var7 = new double[] {0.14703223862609222, 0.20216932811087682, 0.6507984332630309};
                        } else {
                            var7 = new double[] {0.4992965852410794, 0.11702263716587799, 0.3836807775930426};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var7 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        } else {
                            var7 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var7 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var7 = new double[] {0.0, 0.07429963459196103, 0.925700365408039};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var7 = new double[] {0.0, 0.6810207336523126, 0.3189792663476874};
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[5] <= 0.5) {
                    var7 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var7 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                }
            } else {
                var7 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var8;
        if (input[8] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var8 = new double[] {0.0, 0.09228441754916793, 0.9077155824508321};
                        } else {
                            var8 = new double[] {0.09572381326010199, 0.1196547665751275, 0.7846214201647705};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var8 = new double[] {0.0, 0.3638170974155069, 0.6361829025844931};
                        } else {
                            var8 = new double[] {0.0, 0.2760180995475113, 0.7239819004524887};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var8 = new double[] {0.9512670565302144, 0.0, 0.04873294346978557};
                        } else {
                            var8 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    } else {
                        var8 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    var8 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[0] <= 360.0) {
                        if (input[7] <= 0.5) {
                            var8 = new double[] {0.0, 0.542566709021601, 0.45743329097839897};
                        } else {
                            var8 = new double[] {0.0, 0.488, 0.512};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var8 = new double[] {0.32795698924731187, 0.0, 0.6720430107526882};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[5] <= 0.5) {
                        var8 = new double[] {0.2716645017628503, 0.28298385600296905, 0.4453516422341807};
                    } else {
                        if (input[4] <= 0.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        var8 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var8 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    var8 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                } else {
                    var8 = new double[] {0.9873545776428934, 0.0, 0.01264542235710673};
                }
            }
        }
        double[] var9;
        if (input[0] <= 435.0) {
            if (input[10] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var9 = new double[] {0.2123585726718886, 0.2654482158398608, 0.5221932114882507};
                        } else {
                            var9 = new double[] {0.0, 0.5383570943652412, 0.4616429056347589};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var9 = new double[] {0.0, 0.11275415896487985, 0.88724584103512};
                        } else {
                            var9 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var9 = new double[] {0.0, 0.9581151832460733, 0.0418848167539267};
                        } else {
                            var9 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var9 = new double[] {0.0, 0.9519807923169269, 0.04801920768307322};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var9 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var9 = new double[] {0.7648902821316614, 0.0, 0.23510971786833856};
                        } else {
                            var9 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var9 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                var9 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
            } else {
                var9 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var10;
        if (input[0] <= 435.0) {
            if (input[11] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[10] <= 0.5) {
                            var10 = new double[] {0.09015333456493625, 0.2817291705154259, 0.6281174949196379};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.3279569892473118, 0.0, 0.6720430107526881};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var10 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
                        } else {
                            var10 = new double[] {0.2706600110926234, 0.507487520798669, 0.2218524681087077};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var10 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var10 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 0.7043879907621248, 0.29561200923787523};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var10 = new double[] {0.0, 0.31389365351629506, 0.686106346483705};
                        } else {
                            var10 = new double[] {0.0, 0.363817097415507, 0.6361829025844931};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var10 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        if (input[0] <= 285.0) {
                            var10 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var10 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[3] <= 0.5) {
                    var10 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[5] <= 0.5) {
                        var10 = new double[] {0.0, 0.3952483801295896, 0.6047516198704104};
                    } else {
                        var10 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var10 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var10 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
                }
            }
        }
        double[] var11;
        if (input[0] <= 435.0) {
            if (input[8] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var11 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var11 = new double[] {0.0, 0.94919021911718, 0.05080978088281995};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var11 = new double[] {0.0, 0.2223572296476306, 0.7776427703523695};
                        } else {
                            var11 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var11 = new double[] {0.168391994478951, 0.21048999309868877, 0.6211180124223603};
                        } else {
                            var11 = new double[] {0.0, 0.06770255271920089, 0.9322974472807991};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var11 = new double[] {0.0, 0.07429963459196103, 0.925700365408039};
                        } else {
                            var11 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var11 = new double[] {0.5030927835051546, 0.12577319587628866, 0.37113402061855677};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var11 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var11 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    } else {
                        var11 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var11 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var11 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var12;
        if (input[9] <= 0.5) {
            if (input[0] <= 435.0) {
                if (input[10] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.04357921057331665, 0.5992141453831041, 0.3572066440435792};
                        } else {
                            var12 = new double[] {0.0, 0.37888198757763975, 0.6211180124223603};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var12 = new double[] {0.0, 0.03349807797913235, 0.9665019220208677};
                        } else {
                            var12 = new double[] {0.15059404412899244, 0.04706063879031014, 0.8023453170806975};
                        }
                    }
                } else {
                    var12 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var12 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    } else {
                        var12 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var12 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[3] <= 0.5) {
                    var12 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var12 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var12 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var12 = new double[] {0.0, 0.9242424242424242, 0.07575757575757575};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var12 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var12 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                    }
                } else {
                    var12 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                }
            }
        }
        double[] var13;
        if (input[0] <= 435.0) {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[9] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var13 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var13 = new double[] {0.0, 0.7806215722120659, 0.2193784277879342};
                        }
                    } else {
                        var13 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var13 = new double[] {0.8702983138780803, 0.0, 0.12970168612191957};
                        } else {
                            var13 = new double[] {0.0, 0.6493425172197871, 0.3506574827802129};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var13 = new double[] {0.0, 0.4586466165413534, 0.5413533834586467};
                        } else {
                            var13 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                        }
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[1] <= 0.5) {
                            var13 = new double[] {0.1525953721075672, 0.19074421513445905, 0.6566604127579738};
                        } else {
                            var13 = new double[] {0.0, 0.24629878869448185, 0.7537012113055183};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var13 = new double[] {0.0, 0.08232118758434548, 0.9176788124156546};
                        } else {
                            var13 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var13 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                    } else {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var13 = new double[] {1.0, 0.0, 0.0};
            } else {
                var13 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
            }
        }
        double[] var14;
        if (input[9] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var14 = new double[] {0.814540059347181, 0.0, 0.18545994065281898};
                        } else {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var14 = new double[] {0.9764595103578155, 0.0, 0.02354048964218456};
                        } else {
                            var14 = new double[] {0.9070631970260223, 0.0, 0.0929368029739777};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var14 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var14 = new double[] {0.0, 0.45615227736233843, 0.5438477226376615};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var14 = new double[] {0.0, 0.5495495495495496, 0.4504504504504504};
                        } else {
                            var14 = new double[] {0.0, 0.8356164383561644, 0.16438356164383564};
                        }
                    }
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[1] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var14 = new double[] {0.0, 0.3034825870646766, 0.6965174129353233};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var14 = new double[] {0.0, 0.2250922509225092, 0.7749077490774908};
                        } else {
                            var14 = new double[] {0.7648902821316614, 0.0, 0.23510971786833856};
                        }
                    }
                } else {
                    var14 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var14 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[4] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var14 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                    } else {
                        if (input[2] <= 0.5) {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    var14 = new double[] {0.0, 0.9481865284974094, 0.05181347150259066};
                }
            }
        }
        double[] var15;
        if (input[1] <= 0.5) {
            if (input[2] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var15 = new double[] {0.06591922193705255, 0.12359854113197355, 0.8104822369309739};
                        } else {
                            var15 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 405.0) {
                            var15 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        } else {
                            var15 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 435.0) {
                        var15 = new double[] {0.7960848287112562, 0.0, 0.2039151712887439};
                    } else {
                        var15 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[4] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var15 = new double[] {0.2123585726718886, 0.2654482158398608, 0.5221932114882507};
                        } else {
                            var15 = new double[] {0.0, 0.5335276967930029, 0.466472303206997};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var15 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var15 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var15 = new double[] {0.6153846153846154, 0.38461538461538464, 0.0};
                    } else {
                        var15 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var15 = new double[] {0.3433395872420263, 0.0, 0.6566604127579738};
                        } else {
                            var15 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                        }
                    } else {
                        var15 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var15 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                    } else {
                        if (input[8] <= 0.5) {
                            var15 = new double[] {0.0, 0.33701657458563533, 0.6629834254143647};
                        } else {
                            var15 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        if (input[2] <= 0.5) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var15 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    }
                }
            }
        }
        double[] var16;
        if (input[10] <= 0.5) {
            if (input[4] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var16 = new double[] {0.0, 0.18616480162767038, 0.8138351983723295};
                        } else {
                            var16 = new double[] {0.22648514851485146, 0.0, 0.7735148514851485};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var16 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var16 = new double[] {0.6765249537892791, 0.0, 0.32347504621072093};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var16 = new double[] {0.08504705472289996, 0.5315440920181248, 0.3834088532589752};
                        } else {
                            var16 = new double[] {0.0, 0.1900311526479751, 0.8099688473520249};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var16 = new double[] {0.0, 0.8728139904610492, 0.1271860095389507};
                        } else {
                            var16 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var16 = new double[] {0.0, 0.6703296703296704, 0.3296703296703297};
                        } else {
                            var16 = new double[] {0.0, 0.8786959818043973, 0.12130401819560271};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var16 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var16 = new double[] {0.0, 0.40397350993377484, 0.5960264900662252};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var16 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        var16 = new double[] {0.0, 0.363817097415507, 0.6361829025844931};
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var16 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[6] <= 0.5) {
                    if (input[0] <= 360.0) {
                        var16 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    } else {
                        var16 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                } else {
                    var16 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                }
            }
        }
        double[] var17;
        if (input[2] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var17 = new double[] {0.8648648648648649, 0.13513513513513514, 0.0};
                        } else {
                            var17 = new double[] {0.9629995066600888, 0.0, 0.0370004933399112};
                        }
                    } else {
                        var17 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var17 = new double[] {0.0, 0.727427597955707, 0.27257240204429306};
                        } else {
                            var17 = new double[] {0.0527396520047552, 0.42850967253863603, 0.5187506754566088};
                        }
                    } else {
                        var17 = new double[] {0.8667850799289522, 0.0, 0.13321492007104796};
                    }
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[0] <= 360.0) {
                        if (input[4] <= 0.5) {
                            var17 = new double[] {0.22522210684204452, 0.10557286258220838, 0.6692050305757472};
                        } else {
                            var17 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var17 = new double[] {0.0, 0.1601049868766404, 0.8398950131233596};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var17 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var17 = new double[] {0.0, 0.8840579710144928, 0.11594202898550725};
                        } else {
                            var17 = new double[] {0.0, 0.9320882852292021, 0.06791171477079795};
                        }
                    } else {
                        var17 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var17 = new double[] {0.8798076923076924, 0.0, 0.1201923076923077};
                }
            } else {
                if (input[4] <= 0.5) {
                    var17 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[9] <= 0.5) {
                        var17 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    } else {
                        var17 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            }
        }
        double[] var18;
        if (input[9] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[0] <= 435.0) {
                        if (input[3] <= 0.5) {
                            var18 = new double[] {0.6082621082621082, 0.0, 0.3917378917378918};
                        } else {
                            var18 = new double[] {0.43845462713387245, 0.0, 0.5615453728661276};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var18 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var18 = new double[] {0.9705362404242782, 0.0, 0.029463759575721865};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var18 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    } else {
                        if (input[0] <= 360.0) {
                            var18 = new double[] {0.14382552313586794, 0.08989095195991748, 0.7662835249042146};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var18 = new double[] {0.18087472201630836, 0.22609340252038548, 0.5930318754633062};
                        } else {
                            var18 = new double[] {0.0, 0.7703788748564868, 0.22962112514351318};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var18 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var18 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[4] <= 0.5) {
                            var18 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        } else {
                            var18 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var18 = new double[] {0.0, 0.47780678851174935, 0.5221932114882506};
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[2] <= 0.5) {
                    var18 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                } else {
                    var18 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var18 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var18 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        } else {
                            var18 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var18 = new double[] {0.0, 1.0, 0.0};
                }
            }
        }
        double[] var19;
        if (input[12] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var19 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var19 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var19 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var19 = new double[] {0.5941558441558442, 0.0, 0.4058441558441559};
                        } else {
                            var19 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var19 = new double[] {0.0, 0.6175478065241845, 0.38245219347581544};
                        } else {
                            var19 = new double[] {0.3933897621926642, 0.12293430068520758, 0.4836759371221282};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var19 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var19 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        var19 = new double[] {0.0, 0.9195979899497487, 0.08040201005025126};
                    }
                }
            }
        } else {
            if (input[0] <= 360.0) {
                if (input[2] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var19 = new double[] {0.20307948397836031, 0.38077403245942565, 0.4161464835622139};
                        } else {
                            var19 = new double[] {0.0, 0.20265780730897007, 0.7973421926910298};
                        }
                    } else {
                        var19 = new double[] {0.5161290322580645, 0.48387096774193555, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var19 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var19 = new double[] {0.20392812369410782, 0.1274550773088174, 0.6686167989970748};
                        } else {
                            var19 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var19 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                }
            }
        }
        double[] var20;
        if (input[9] <= 0.5) {
            if (input[7] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[11] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var20 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                        } else {
                            var20 = new double[] {0.36847885777045586, 0.0, 0.6315211422295443};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var20 = new double[] {0.07464056286326094, 0.46650351789538086, 0.45885591924135827};
                        } else {
                            var20 = new double[] {0.0, 0.3034825870646766, 0.6965174129353233};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var20 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var20 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var20 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[0] <= 435.0) {
                        if (input[3] <= 0.5) {
                            var20 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var20 = new double[] {0.0, 0.41309255079006774, 0.5869074492099323};
                        }
                    } else {
                        var20 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var20 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var20 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[1] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var20 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                    } else {
                        if (input[5] <= 0.5) {
                            var20 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var20 = new double[] {0.0, 0.7530864197530863, 0.24691358024691354};
                        }
                    } else {
                        var20 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                    }
                }
            }
        }
        double[] var21;
        if (input[9] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var21 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        } else {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var21 = new double[] {0.04319348557266773, 0.05399185696583466, 0.9028146574614976};
                        } else {
                            var21 = new double[] {0.27293064876957496, 0.0, 0.7270693512304252};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var21 = new double[] {0.0, 0.41780821917808214, 0.5821917808219178};
                        } else {
                            var21 = new double[] {0.15188297541238718, 0.47463429816370994, 0.3734827264239029};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var21 = new double[] {0.0, 0.8962834917891098, 0.10371650821089023};
                        } else {
                            var21 = new double[] {0.0, 0.12175648702594812, 0.8782435129740519};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var21 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[8] <= 0.5) {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var21 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var21 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[3] <= 0.5) {
                    var21 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[12] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var21 = new double[] {0.0, 0.8840579710144928, 0.11594202898550726};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    var21 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[5] <= 0.5) {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var21 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var22;
        if (input[0] <= 435.0) {
            if (input[4] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[11] <= 0.5) {
                            var22 = new double[] {0.15752098127824407, 0.19690122659780507, 0.6455777921239509};
                        } else {
                            var22 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.0, 0.16591115140525836, 0.8340888485947415};
                        } else {
                            var22 = new double[] {0.0, 0.07429963459196103, 0.925700365408039};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var22 = new double[] {0.9165275459098498, 0.0, 0.08347245409015025};
                        } else {
                            var22 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var22 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var22 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
                        }
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var22 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        } else {
                            var22 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.0, 0.9437412095639944, 0.056258790436005617};
                        } else {
                            var22 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var22 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[1] <= 0.5) {
                            var22 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var22 = new double[] {0.0, 0.8356164383561644, 0.16438356164383564};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                var22 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
            } else {
                var22 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var23;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var23 = new double[] {0.4107744107744108, 0.0, 0.5892255892255892};
                    } else {
                        if (input[6] <= 0.5) {
                            var23 = new double[] {0.12384215201116608, 0.0387006725034894, 0.8374571754853445};
                        } else {
                            var23 = new double[] {0.0, 0.05540417801998182, 0.9445958219800181};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var23 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var23 = new double[] {0.0, 0.4739988045427376, 0.5260011954572625};
                        } else {
                            var23 = new double[] {0.0, 0.47286821705426346, 0.5271317829457365};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var23 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var23 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var23 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                    } else {
                        var23 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[0] <= 360.0) {
                        var23 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    } else {
                        var23 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                } else {
                    var23 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var23 = new double[] {0.8638344226579521, 0.0, 0.13616557734204793};
            }
        }
        double[] var24;
        if (input[1] <= 0.5) {
            if (input[0] <= 435.0) {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var24 = new double[] {0.058915851744537, 0.699625739466377, 0.2414584087890861};
                        } else {
                            var24 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var24 = new double[] {0.15235716515766468, 0.2856696846706213, 0.5619731501717141};
                        } else {
                            var24 = new double[] {0.0, 0.2223572296476306, 0.7776427703523694};
                        }
                    }
                } else {
                    var24 = new double[] {0.866785079928952, 0.0, 0.133214920071048};
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var24 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                    } else {
                        var24 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var24 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var24 = new double[] {0.11610754223173922, 0.21770164168451106, 0.6661908160837497};
                    } else {
                        if (input[3] <= 0.5) {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var24 = new double[] {0.0, 0.7365532381997805, 0.2634467618002196};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        if (input[2] <= 0.5) {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var24 = new double[] {0.0, 0.9581151832460734, 0.0418848167539267};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var24 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var24 = new double[] {0.0, 0.1601049868766404, 0.8398950131233596};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    var24 = new double[] {0.161964819117159, 0.5061400597411219, 0.3318951211417192};
                } else {
                    var24 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(subroutine1(input), var0), var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14), var15), var16), var17), var18), var19), var20), var21), var22), var23), var24);
    }
    public static double[] subroutine1(double[] input) {
        double[] var0;
        if (input[11] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[3] <= 0.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 435.0) {
                        if (input[0] <= 360.0) {
                            var0 = new double[] {0.6612466124661247, 0.0, 0.33875338753387535};
                        } else {
                            var0 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[0] <= 435.0) {
                            var0 = new double[] {0.0497806793838621, 0.09333877384474146, 0.8568805467713965};
                        } else {
                            var0 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var0 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var0 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var0 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[0] <= 360.0) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[3] <= 0.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.9682539682539684, 0.031746031746031744};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var0 = new double[] {0.0, 0.6786155747836836, 0.32138442521631644};
                        } else {
                            var0 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        }
                    }
                } else {
                    var0 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var0 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var0 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                    }
                } else {
                    var0 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var1;
        if (input[11] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var1 = new double[] {0.18795737578636534, 0.19578893311079723, 0.6162536911028373};
                        } else {
                            var1 = new double[] {0.0687517610594534, 0.08593970132431673, 0.8453085376162299};
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[10] <= 0.5) {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[10] <= 0.5) {
                    var1 = new double[] {0.42141623488773744, 0.1755900978698906, 0.4029936672423719};
                } else {
                    if (input[1] <= 0.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var1 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        } else {
                            var1 = new double[] {0.0, 0.36381709741550705, 0.6361829025844931};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var1 = new double[] {0.0, 0.9552572706935123, 0.0447427293064877};
                        } else {
                            var1 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        }
                    }
                } else {
                    var1 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var1 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        } else {
                            var1 = new double[] {0.0, 0.9384615384615385, 0.061538461538461535};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var1 = new double[] {0.0, 0.8640226628895185, 0.1359773371104816};
                        } else {
                            var1 = new double[] {0.0, 0.6703296703296704, 0.3296703296703297};
                        }
                    }
                } else {
                    var1 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                }
            }
        }
        double[] var2;
        if (input[8] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var2 = new double[] {0.0, 0.1217564870259481, 0.8782435129740518};
                        } else {
                            var2 = new double[] {0.0, 0.17888563049853373, 0.8211143695014663};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var2 = new double[] {0.0, 0.14489311163895485, 0.8551068883610451};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var2 = new double[] {0.0, 0.973404255319149, 0.026595744680851064};
                        } else {
                            var2 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var2 = new double[] {0.0, 0.9242424242424242, 0.07575757575757575};
                        } else {
                            var2 = new double[] {0.0, 0.2531120331950208, 0.7468879668049793};
                        }
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    var2 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var2 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var2 = new double[] {0.986522911051213, 0.0, 0.013477088948787063};
                    } else {
                        if (input[10] <= 0.5) {
                            var2 = new double[] {0.21328671328671328, 0.0, 0.7867132867132868};
                        } else {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    var2 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[12] <= 0.5) {
                        var2 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                    } else {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var3;
        if (input[1] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var3 = new double[] {0.0, 0.1940615058324496, 0.8059384941675504};
                        } else {
                            var3 = new double[] {0.3193717277486911, 0.0, 0.680628272251309};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var3 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[4] <= 0.5) {
                            var3 = new double[] {0.15188297541238718, 0.47463429816370994, 0.3734827264239029};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[8] <= 0.5) {
                        var3 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                    } else {
                        var3 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var3 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var3 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[9] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var3 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                    } else {
                        if (input[5] <= 0.5) {
                            var3 = new double[] {0.0, 0.932088285229202, 0.06791171477079795};
                        } else {
                            var3 = new double[] {0.0, 0.6559139784946236, 0.3440860215053763};
                        }
                    }
                } else {
                    var3 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var3 = new double[] {0.0, 0.5258620689655172, 0.47413793103448276};
                        } else {
                            var3 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var3 = new double[] {0.0, 0.08701854493580598, 0.9129814550641939};
                        } else {
                            var3 = new double[] {0.4914400805639476, 0.3071500503524673, 0.2014098690835851};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var3 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var3 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    }
                }
            }
        }
        double[] var4;
        if (input[12] <= 0.5) {
            if (input[2] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[8] <= 0.5) {
                        var4 = new double[] {0.8798076923076924, 0.0, 0.1201923076923077};
                    } else {
                        var4 = new double[] {0.9884259259259259, 0.0, 0.011574074074074073};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var4 = new double[] {0.0, 0.5861049519586105, 0.4138950480413895};
                        } else {
                            var4 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var4 = new double[] {0.0, 0.8663324979114453, 0.1336675020885547};
                        } else {
                            var4 = new double[] {0.0, 0.2026578073089701, 0.7973421926910299};
                        }
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[0] <= 360.0) {
                        var4 = new double[] {0.0, 0.9384615384615385, 0.06153846153846153};
                    } else {
                        var4 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var4 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 0.9014778325123153, 0.0985221674876847};
                        }
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var4 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        if (input[7] <= 0.5) {
                            var4 = new double[] {0.15786068578822515, 0.06577528574509382, 0.776364028466681};
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var4 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        } else {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var4 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var4 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        }
                    }
                }
            } else {
                var4 = new double[] {0.3279569892473118, 0.0, 0.6720430107526881};
            }
        }
        double[] var5;
        if (input[0] <= 435.0) {
            if (input[6] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var5 = new double[] {0.03835573371060283, 0.647253006366423, 0.31439125992297406};
                        } else {
                            var5 = new double[] {0.0, 0.9412196914033799, 0.058780308596620125};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var5 = new double[] {0.0, 0.29922915206727396, 0.700770847932726};
                        } else {
                            var5 = new double[] {0.21328671328671328, 0.0, 0.7867132867132868};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        var5 = new double[] {0.7454175152749491, 0.0, 0.2545824847250509};
                    } else {
                        var5 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[10] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var5 = new double[] {0.08579465541490856, 0.0, 0.9142053445850915};
                        } else {
                            var5 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var5 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var5 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                } else {
                    var5 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[7] <= 0.5) {
                    var5 = new double[] {0.30634023854362835, 0.19146264908976773, 0.5021971123666039};
                } else {
                    var5 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var5 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var6;
        if (input[1] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var6 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        if (input[0] <= 435.0) {
                            var6 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var6 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[12] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var6 = new double[] {0.0, 0.6466431095406361, 0.35335689045936397};
                        } else {
                            var6 = new double[] {0.6466431095406361, 0.0, 0.35335689045936397};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var6 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var6 = new double[] {0.7400346620450606, 0.0, 0.25996533795493937};
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.0, 0.28909952606635075, 0.7109004739336493};
                        } else {
                            var6 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        } else {
                            var6 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        var6 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                    } else {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var6 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[6] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var6 = new double[] {0.0, 0.7641857037582904, 0.2358142962417096};
                        } else {
                            var6 = new double[] {0.0, 0.3788819875776398, 0.6211180124223603};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var6 = new double[] {0.0, 0.12175648702594812, 0.8782435129740519};
                        } else {
                            var6 = new double[] {0.0, 0.4326241134751774, 0.5673758865248227};
                        }
                    }
                }
            }
        }
        double[] var7;
        if (input[4] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.0, 0.1286015460295151, 0.8713984539704849};
                        } else {
                            var7 = new double[] {0.16331994645247652, 0.0, 0.8366800535475234};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var7 = new double[] {0.0, 0.4778067885117493, 0.5221932114882507};
                        } else {
                            var7 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 0.8840579710144928, 0.11594202898550726};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var7 = new double[] {0.9510095815514535, 0.01651058301304607, 0.03247983543550047};
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var7 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[3] <= 0.5) {
                    if (input[5] <= 0.5) {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var7 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var7 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var7 = new double[] {0.0, 0.8728139904610493, 0.1271860095389507};
                        } else {
                            var7 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var7 = new double[] {0.0, 0.2026578073089701, 0.7973421926910299};
                        } else {
                            var7 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var7 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                }
            }
        }
        double[] var8;
        if (input[4] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[10] <= 0.5) {
                        var8 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    } else {
                        var8 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var8 = new double[] {0.5474943904263276, 0.2281226626776365, 0.2243829468960359};
                        } else {
                            var8 = new double[] {0.0, 0.732977303070761, 0.26702269692923897};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var8 = new double[] {0.8798076923076924, 0.0, 0.1201923076923077};
                        } else {
                            var8 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        }
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var8 = new double[] {0.2584745762711864, 0.0, 0.7415254237288136};
                        } else {
                            var8 = new double[] {0.07296650717703348, 0.0, 0.9270334928229665};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var8 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var8 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                } else {
                    var8 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[1] <= 0.5) {
                    var8 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                } else {
                    if (input[0] <= 285.0) {
                        if (input[9] <= 0.5) {
                            var8 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        } else {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var8 = new double[] {0.0, 0.5665634674922602, 0.43343653250773995};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[9] <= 0.5) {
                        var8 = new double[] {0.0, 0.6958174904942965, 0.3041825095057034};
                    } else {
                        var8 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var9;
        if (input[9] <= 0.5) {
            if (input[1] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.2571127502634352, 0.321390937829294, 0.4214963119072708};
                        }
                    } else {
                        var9 = new double[] {0.9803998431987456, 0.0, 0.019600156801254414};
                    }
                } else {
                    if (input[12] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var9 = new double[] {0.2706600110926234, 0.5074875207986689, 0.22185246810870768};
                        } else {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var9 = new double[] {0.06948597465470596, 0.30400113911433857, 0.6265128862309555};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var9 = new double[] {0.6765249537892791, 0.0, 0.32347504621072093};
                        } else {
                            var9 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[11] <= 0.5) {
                            var9 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        } else {
                            var9 = new double[] {0.0, 0.8728139904610492, 0.1271860095389507};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var9 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        }
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var9 = new double[] {0.0, 0.7176470588235294, 0.28235294117647064};
                    } else {
                        var9 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    var9 = new double[] {0.0, 0.3788819875776398, 0.6211180124223603};
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var9 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var9 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[0] <= 285.0) {
                            var9 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var9 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var10;
        if (input[0] <= 435.0) {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[9] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var10 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var10 = new double[] {0.7203542725930786, 0.05002460226340824, 0.22962112514351324};
                        } else {
                            var10 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var10 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var10 = new double[] {0.0, 0.5090819833087874, 0.49091801669121254};
                        }
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    var10 = new double[] {0.1625041625041625, 0.3046953046953047, 0.5328005328005329};
                } else {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var10 = new double[] {0.0, 0.07615480649188516, 0.9238451935081149};
                        } else {
                            var10 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var10 = new double[] {0.0, 0.06218144750254841, 0.9378185524974516};
                        } else {
                            var10 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    var10 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                } else {
                    if (input[6] <= 0.5) {
                        var10 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var10 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    var10 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var10 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var11;
        if (input[4] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var11 = new double[] {0.1656764556102529, 0.15532167713461212, 0.6790018672551351};
                        } else {
                            var11 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var11 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                        } else {
                            var11 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[0] <= 405.0) {
                            var11 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var11 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[0] <= 435.0) {
                            var11 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var11 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var11 = new double[] {0.0, 0.9014778325123153, 0.0985221674876847};
                        } else {
                            var11 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var11 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var11 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var11 = new double[] {0.0, 0.13232104121475055, 0.8676789587852495};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var11 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var11 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        var11 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var11 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[7] <= 0.5) {
                        var11 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                    } else {
                        var11 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var11 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        var11 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            }
        }
        double[] var12;
        if (input[8] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.0, 0.8090185676392574, 0.1909814323607427};
                        } else {
                            var12 = new double[] {0.0, 0.17888563049853373, 0.8211143695014663};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var12 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        var12 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var12 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var12 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.22051513782196114, 0.6891098056936286, 0.0903750564844103};
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var12 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var12 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[0] <= 360.0) {
                            var12 = new double[] {0.0, 0.33701657458563533, 0.6629834254143646};
                        } else {
                            var12 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[3] <= 0.5) {
                    var12 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[1] <= 0.5) {
                        var12 = new double[] {0.0, 0.40397350993377484, 0.5960264900662252};
                    } else {
                        if (input[0] <= 285.0) {
                            var12 = new double[] {0.2721695482431679, 0.17010596765197994, 0.5577244841048522};
                        } else {
                            var12 = new double[] {0.5941558441558442, 0.0, 0.40584415584415584};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    var12 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var12 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        double[] var13;
        if (input[2] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var13 = new double[] {0.0, 0.4986376021798365, 0.5013623978201635};
                        } else {
                            var13 = new double[] {0.0, 0.9143468950749465, 0.08565310492505353};
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var13 = new double[] {0.050319653536811726, 0.06289956692101466, 0.8867807795421737};
                        } else {
                            var13 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        }
                    } else {
                        var13 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    var13 = new double[] {0.7360482654600302, 0.0, 0.26395173453996984};
                } else {
                    var13 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[0] <= 360.0) {
                    if (input[4] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var13 = new double[] {0.32795698924731187, 0.0, 0.6720430107526882};
                        } else {
                            var13 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var13 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        } else {
                            var13 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var13 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[6] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var13 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var13 = new double[] {0.0, 0.9437412095639943, 0.05625879043600562};
                        }
                    } else {
                        var13 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var13 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    } else {
                        var13 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var14;
        if (input[10] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[5] <= 0.5) {
                            var14 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var14 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var14 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        } else {
                            var14 = new double[] {0.09652853328058551, 0.2111561665512808, 0.6923153001681338};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var14 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var14 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var14 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var14 = new double[] {0.0, 0.4467046379170057, 0.5532953620829943};
                        } else {
                            var14 = new double[] {0.10801239486498451, 0.40504648074369193, 0.4869411243913237};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var14 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var14 = new double[] {0.0, 0.5846645367412141, 0.41533546325878595};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var14 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var14 = new double[] {0.0, 0.9384615384615385, 0.06153846153846153};
                        } else {
                            var14 = new double[] {0.0, 0.9552572706935123, 0.044742729306487684};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var14 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[2] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var14 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var14 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var14 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var14 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var15;
        if (input[2] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var15 = new double[] {0.19803185553413816, 0.030942477427209094, 0.7710256670386527};
                        } else {
                            var15 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var15 = new double[] {0.0, 0.5106245975531231, 0.489375402446877};
                        } else {
                            var15 = new double[] {0.0, 0.6559139784946237, 0.34408602150537637};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var15 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var15 = new double[] {0.0, 0.7806215722120659, 0.2193784277879342};
                        } else {
                            var15 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        }
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    var15 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[4] <= 0.5) {
                        if (input[0] <= 405.0) {
                            var15 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var15 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var15 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var15 = new double[] {0.0, 0.9606299212598426, 0.03937007874015747};
                        } else {
                            var15 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var15 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var15 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        var15 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var15 = new double[] {0.0, 0.1601049868766404, 0.8398950131233596};
                    }
                }
            } else {
                var15 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
            }
        }
        double[] var16;
        if (input[9] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[10] <= 0.5) {
                            var16 = new double[] {0.0959119496855346, 0.0, 0.9040880503144654};
                        } else {
                            var16 = new double[] {0.8951781970649895, 0.0, 0.10482180293501048};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var16 = new double[] {0.2436345481777334, 0.45681477783325014, 0.29955067398901647};
                        } else {
                            var16 = new double[] {0.9461439034898751, 0.0, 0.05385609651012495};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var16 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    } else {
                        if (input[4] <= 0.5) {
                            var16 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var16 = new double[] {0.0, 0.23371647509578547, 0.7662835249042146};
                        }
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    if (input[8] <= 0.5) {
                        var16 = new double[] {0.0, 0.8728139904610493, 0.1271860095389507};
                    } else {
                        var16 = new double[] {0.0, 0.5495495495495496, 0.4504504504504504};
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[2] <= 0.5) {
                            var16 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        } else {
                            var16 = new double[] {0.0, 0.820627802690583, 0.17937219730941706};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var16 = new double[] {0.0, 0.40939597315436244, 0.5906040268456376};
                        } else {
                            var16 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var16 = new double[] {0.0, 1.0, 0.0};
            } else {
                if (input[5] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var16 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    } else {
                        if (input[4] <= 0.5) {
                            var16 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var16 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        var16 = new double[] {0.0, 0.9014778325123152, 0.0985221674876847};
                    } else {
                        if (input[0] <= 285.0) {
                            var16 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var16 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    }
                }
            }
        }
        double[] var17;
        if (input[12] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var17 = new double[] {0.0, 0.4778067885117493, 0.5221932114882507};
                        } else {
                            var17 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var17 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var17 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var17 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                        } else {
                            var17 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                        }
                    } else {
                        var17 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var17 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        if (input[0] <= 285.0) {
                            var17 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var17 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                } else {
                    var17 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[9] <= 0.5) {
                if (input[0] <= 360.0) {
                    if (input[3] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var17 = new double[] {0.30442919525888956, 0.570804741110418, 0.12476606363069244};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var17 = new double[] {0.2890995260663507, 0.0, 0.7109004739336493};
                        } else {
                            var17 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var17 = new double[] {0.181547619047619, 0.0, 0.8184523809523809};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var17 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    var17 = new double[] {0.0, 0.3788819875776398, 0.6211180124223603};
                } else {
                    var17 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                }
            }
        }
        double[] var18;
        if (input[10] <= 0.5) {
            if (input[1] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var18 = new double[] {0.16516245487364628, 0.0, 0.8348375451263537};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var18 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var18 = new double[] {0.33877125997917384, 0.10586601874349184, 0.5553627212773343};
                        } else {
                            var18 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var18 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var18 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var18 = new double[] {0.0, 0.603960396039604, 0.396039603960396};
                        } else {
                            var18 = new double[] {0.0, 0.9437412095639943, 0.05625879043600562};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var18 = new double[] {0.0, 0.35260115606936415, 0.6473988439306358};
                        } else {
                            var18 = new double[] {0.4107744107744108, 0.0, 0.5892255892255892};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var18 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var18 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var18 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var18 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var18 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[2] <= 0.5) {
                    var18 = new double[] {0.8192148760330578, 0.0, 0.18078512396694213};
                } else {
                    var18 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        double[] var19;
        if (input[10] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var19 = new double[] {0.13832199546485258, 0.6916099773242631, 0.17006802721088432};
                        } else {
                            var19 = new double[] {0.0, 0.7093023255813954, 0.2906976744186046};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var19 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        } else {
                            var19 = new double[] {0.0, 0.9014778325123153, 0.0985221674876847};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var19 = new double[] {0.0, 0.9437412095639944, 0.056258790436005617};
                        } else {
                            var19 = new double[] {0.0, 0.9143468950749465, 0.08565310492505354};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var19 = new double[] {0.0, 0.8905109489051095, 0.1094890510948905};
                        } else {
                            var19 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 435.0) {
                        if (input[6] <= 0.5) {
                            var19 = new double[] {0.0, 0.264069264069264, 0.7359307359307359};
                        } else {
                            var19 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var19 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var19 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var19 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[3] <= 0.5) {
                    var19 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var19 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        } else {
                            var19 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var19 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                var19 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
            }
        }
        double[] var20;
        if (input[10] <= 0.5) {
            if (input[0] <= 285.0) {
                if (input[12] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var20 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var20 = new double[] {0.0, 0.9682539682539684, 0.03174603174603174};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var20 = new double[] {0.0, 0.8934753661784288, 0.10652463382157122};
                        } else {
                            var20 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var20 = new double[] {0.2890995260663507, 0.0, 0.7109004739336493};
                    } else {
                        var20 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var20 = new double[] {0.0, 0.0516511430990686, 0.9483488569009314};
                        } else {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var20 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var20 = new double[] {0.0, 0.6466431095406361, 0.35335689045936397};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var20 = new double[] {0.0, 0.7873955960516326, 0.21260440394836752};
                        } else {
                            var20 = new double[] {0.0, 0.33701657458563533, 0.6629834254143646};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var20 = new double[] {0.0, 0.465648854961832, 0.5343511450381679};
                        } else {
                            var20 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        }
                    }
                }
            }
        } else {
            if (input[5] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 360.0) {
                        var20 = new double[] {0.8026315789473685, 0.0, 0.19736842105263158};
                    } else {
                        var20 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var20 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[6] <= 0.5) {
                    var20 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                } else {
                    var20 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var21;
        if (input[0] <= 435.0) {
            if (input[1] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var21 = new double[] {0.6860356138706654, 0.09528272414870352, 0.21868166198063105};
                        } else {
                            var21 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var21 = new double[] {0.21328671328671328, 0.0, 0.7867132867132868};
                        } else {
                            var21 = new double[] {0.0, 0.08232118758434548, 0.9176788124156545};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var21 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        }
                    } else {
                        var21 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    if (input[4] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var21 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var21 = new double[] {0.0, 0.6559139784946237, 0.34408602150537637};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var21 = new double[] {0.0, 0.8206278026905829, 0.17937219730941703};
                        } else {
                            var21 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var21 = new double[] {0.1484184914841849, 0.0, 0.8515815085158152};
                        } else {
                            var21 = new double[] {0.0, 0.19003115264797507, 0.809968847352025};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var21 = new double[] {0.0, 0.582971329278888, 0.41702867072111205};
                        } else {
                            var21 = new double[] {0.0, 0.41577409931840315, 0.584225900681597};
                        }
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    var21 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                } else {
                    var21 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var21 = new double[] {1.0, 0.0, 0.0};
            }
        }
        double[] var22;
        if (input[10] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var22 = new double[] {0.06178779437832362, 0.07723474297290454, 0.8609774626487718};
                        } else {
                            var22 = new double[] {0.09048766920081586, 0.05655479325050992, 0.8529575375486743};
                        }
                    } else {
                        var22 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var22 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        } else {
                            var22 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var22 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var22 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var22 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    if (input[0] <= 285.0) {
                        if (input[8] <= 0.5) {
                            var22 = new double[] {0.0, 0.8786959818043973, 0.1213040181956027};
                        } else {
                            var22 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var22 = new double[] {0.1636851520572451, 0.5456171735241503, 0.29069767441860467};
                        } else {
                            var22 = new double[] {0.0, 0.3096446700507614, 0.6903553299492385};
                        }
                    }
                }
            }
        } else {
            if (input[1] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[5] <= 0.5) {
                        var22 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                    } else {
                        var22 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                } else {
                    var22 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var22 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
            }
        }
        double[] var23;
        if (input[0] <= 435.0) {
            if (input[11] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var23 = new double[] {0.25115800308800823, 0.15697375193000515, 0.5918682449819868};
                        } else {
                            var23 = new double[] {0.07521578298397041, 0.0, 0.9247842170160296};
                        }
                    } else {
                        var23 = new double[] {0.0, 0.7922077922077922, 0.2077922077922078};
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var23 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var23 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var23 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var23 = new double[] {0.0, 0.7055730809674027, 0.29442691903259727};
                        } else {
                            var23 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var23 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        } else {
                            var23 = new double[] {0.0, 0.732977303070761, 0.26702269692923897};
                        }
                    }
                } else {
                    if (input[9] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var23 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var23 = new double[] {0.1913350323465987, 0.2989609880415605, 0.5097039796118409};
                        }
                    } else {
                        var23 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                var23 = new double[] {0.9880895664602192, 0.0, 0.011910433539780848};
            } else {
                if (input[10] <= 0.5) {
                    var23 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                } else {
                    var23 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var24;
        if (input[10] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var24 = new double[] {0.12487205731832139, 0.3121801432958035, 0.5629477993858751};
                        } else {
                            var24 = new double[] {0.0, 0.542566709021601, 0.45743329097839897};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var24 = new double[] {0.0, 0.9143468950749464, 0.08565310492505353};
                        } else {
                            var24 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var24 = new double[] {0.0, 0.16897506925207756, 0.8310249307479225};
                        } else {
                            var24 = new double[] {0.0, 0.5596330275229358, 0.44036697247706424};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            var24 = new double[] {0.0, 0.7743300423131171, 0.22566995768688292};
                        } else {
                            var24 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var24 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[11] <= 0.5) {
                            var24 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                        } else {
                            var24 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var24 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    } else {
                        var24 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    }
                }
            }
        } else {
            if (input[5] <= 0.5) {
                if (input[6] <= 0.5) {
                    var24 = new double[] {0.9618514750762971, 0.0, 0.03814852492370295};
                } else {
                    var24 = new double[] {0.9070631970260223, 0.0, 0.09293680297397769};
                }
            } else {
                if (input[8] <= 0.5) {
                    var24 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                } else {
                    var24 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            }
        }
        double[] var25;
        if (input[4] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[12] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var25 = new double[] {0.4529903195862618, 0.20222782124386685, 0.3447818591698714};
                        } else {
                            var25 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var25 = new double[] {0.0, 0.04995904995904998, 0.9500409500409501};
                        } else {
                            var25 = new double[] {0.3984757757212847, 0.16603157321720194, 0.4354926510615133};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var25 = new double[] {0.9877330716388616, 0.0, 0.01226692836113837};
                    } else {
                        var25 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    if (input[2] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var25 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var25 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var25 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                    }
                } else {
                    if (input[12] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var25 = new double[] {0.6863572433192686, 0.25738396624472576, 0.05625879043600562};
                        } else {
                            var25 = new double[] {0.0, 0.6466431095406361, 0.35335689045936397};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var25 = new double[] {0.2890995260663507, 0.0, 0.7109004739336493};
                        } else {
                            var25 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var25 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var25 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var25 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        }
                    }
                } else {
                    if (input[0] <= 360.0) {
                        if (input[2] <= 0.5) {
                            var25 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var25 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    } else {
                        var25 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
                    }
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[9] <= 0.5) {
                        var25 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    } else {
                        var25 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var25 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var26;
        if (input[8] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var26 = new double[] {0.0, 0.7530864197530863, 0.24691358024691357};
                        } else {
                            var26 = new double[] {0.0, 0.1940615058324496, 0.8059384941675504};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var26 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var26 = new double[] {0.8299319727891156, 0.0, 0.17006802721088432};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var26 = new double[] {0.0729665071770335, 0.0, 0.9270334928229665};
                        } else {
                            var26 = new double[] {0.0, 0.09228441754916791, 0.9077155824508321};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var26 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        } else {
                            var26 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var26 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[0] <= 285.0) {
                        var26 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var26 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var26 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        }
                    }
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[11] <= 0.5) {
                        var26 = new double[] {0.9887438090950023, 0.0, 0.01125619090499775};
                    } else {
                        var26 = new double[] {0.30634023854362835, 0.19146264908976773, 0.5021971123666039};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var26 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        } else {
                            var26 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        }
                    } else {
                        var26 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                    }
                }
            } else {
                var26 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
            }
        }
        double[] var27;
        if (input[11] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[5] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var27 = new double[] {0.0, 0.14489311163895485, 0.8551068883610451};
                        } else {
                            var27 = new double[] {0.384554767533491, 0.048069345941686374, 0.5673758865248227};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var27 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var27 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var27 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var27 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[5] <= 0.5) {
                        var27 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    } else {
                        var27 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                    }
                } else {
                    var27 = new double[] {0.9488334015554646, 0.0, 0.0511665984445354};
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[3] <= 0.5) {
                        var27 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[6] <= 0.5) {
                            var27 = new double[] {0.0, 0.9666388657214346, 0.03336113427856546};
                        } else {
                            var27 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var27 = new double[] {0.0, 0.8591549295774649, 0.14084507042253522};
                        } else {
                            var27 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var27 = new double[] {0.0, 0.49780288763339614, 0.5021971123666039};
                        } else {
                            var27 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    var27 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                } else {
                    var27 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var28;
        if (input[9] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var28 = new double[] {0.26147526343989996, 0.3813180925165208, 0.3572066440435792};
                        } else {
                            var28 = new double[] {0.0, 0.4950405770964833, 0.5049594229035167};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var28 = new double[] {0.0, 0.6039603960396039, 0.3960396039603961};
                        }
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var28 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var28 = new double[] {0.13581964931811855, 0.0848872808238241, 0.7792930698580572};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var28 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var28 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                        }
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[0] <= 405.0) {
                        var28 = new double[] {0.6466431095406361, 0.0, 0.35335689045936397};
                    } else {
                        var28 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var28 = new double[] {0.9794153972828324, 0.0, 0.020584602717167562};
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[4] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var28 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var28 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var28 = new double[] {0.0, 0.9722799722799723, 0.027720027720027716};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var28 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var28 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[0] <= 285.0) {
                        var28 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var28 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var28 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                }
            }
        }
        double[] var29;
        if (input[11] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[5] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var29 = new double[] {0.0, 0.2846034214618973, 0.7153965785381027};
                        } else {
                            var29 = new double[] {0.4226327944572748, 0.0, 0.5773672055427252};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var29 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var29 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        var29 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    } else {
                        var29 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var29 = new double[] {0.986522911051213, 0.0, 0.013477088948787063};
                } else {
                    if (input[12] <= 0.5) {
                        var29 = new double[] {0.9512670565302144, 0.0, 0.04873294346978557};
                    } else {
                        var29 = new double[] {0.3387712599791739, 0.10586601874349186, 0.5553627212773343};
                    }
                }
            }
        } else {
            if (input[0] <= 360.0) {
                if (input[2] <= 0.5) {
                    if (input[1] <= 0.5) {
                        var29 = new double[] {0.30634023854362835, 0.19146264908976773, 0.5021971123666039};
                    } else {
                        if (input[9] <= 0.5) {
                            var29 = new double[] {0.0, 0.580952380952381, 0.41904761904761906};
                        } else {
                            var29 = new double[] {0.0, 0.9384615384615385, 0.06153846153846153};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        if (input[5] <= 0.5) {
                            var29 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var29 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var29 = new double[] {0.0, 0.8840579710144928, 0.11594202898550725};
                        } else {
                            var29 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    var29 = new double[] {0.0, 0.13232104121475052, 0.8676789587852494};
                } else {
                    var29 = new double[] {0.0, 0.3193717277486911, 0.680628272251309};
                }
            }
        }
        double[] var30;
        if (input[10] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var30 = new double[] {0.18166025561484053, 0.7190718451420772, 0.09926789924308226};
                        } else {
                            var30 = new double[] {0.0, 0.37888198757763975, 0.6211180124223603};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var30 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var30 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var30 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var30 = new double[] {0.2957575757575757, 0.07393939393939393, 0.6303030303030304};
                        } else {
                            var30 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var30 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var30 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var30 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var30 = new double[] {0.0, 0.4039735099337749, 0.5960264900662252};
                        } else {
                            var30 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    } else {
                        var30 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[6] <= 0.5) {
                    var30 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                } else {
                    var30 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[0] <= 435.0) {
                        var30 = new double[] {0.9242424242424242, 0.0, 0.07575757575757575};
                    } else {
                        var30 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var30 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var31;
        if (input[10] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[11] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var31 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var31 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var31 = new double[] {0.0, 0.8767967145790555, 0.12320328542094455};
                        } else {
                            var31 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var31 = new double[] {0.2514815769131667, 0.0785879927853646, 0.6699304303014687};
                        } else {
                            var31 = new double[] {0.04686449630269856, 0.14645155094593298, 0.8066839527513684};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var31 = new double[] {0.0, 0.41940412528647825, 0.5805958747135218};
                        } else {
                            var31 = new double[] {0.0, 0.7034596375617792, 0.29654036243822074};
                        }
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var31 = new double[] {0.4914400805639476, 0.3071500503524673, 0.2014098690835851};
                    } else {
                        var31 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[0] <= 285.0) {
                        var31 = new double[] {0.32795698924731187, 0.0, 0.6720430107526882};
                    } else {
                        if (input[4] <= 0.5) {
                            var31 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var31 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        }
                    }
                }
            }
        } else {
            if (input[7] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var31 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var31 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var31 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var31 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                var31 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
            }
        }
        double[] var32;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var32 = new double[] {0.0, 0.8649561107359893, 0.13504388926401079};
                        } else {
                            var32 = new double[] {0.0, 0.4617325483599663, 0.5382674516400338};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var32 = new double[] {0.0, 0.26406926406926406, 0.735930735930736};
                        } else {
                            var32 = new double[] {0.05956304162089591, 0.03722690101305994, 0.9032100573660441};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var32 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        } else {
                            var32 = new double[] {0.21328671328671328, 0.0, 0.7867132867132868};
                        }
                    } else {
                        var32 = new double[] {0.8591549295774648, 0.0, 0.1408450704225352};
                    }
                }
            } else {
                if (input[0] <= 285.0) {
                    if (input[1] <= 0.5) {
                        var32 = new double[] {0.0, 0.7806215722120659, 0.21937842778793418};
                    } else {
                        var32 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var32 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var32 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var32 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var32 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var32 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[6] <= 0.5) {
                    if (input[5] <= 0.5) {
                        var32 = new double[] {0.6192893401015229, 0.0, 0.3807106598984772};
                    } else {
                        var32 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                } else {
                    if (input[0] <= 405.0) {
                        var32 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    } else {
                        var32 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        }
        double[] var33;
        if (input[11] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 405.0) {
                        var33 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    } else {
                        var33 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[0] <= 360.0) {
                        var33 = new double[] {0.9070631970260223, 0.0, 0.0929368029739777};
                    } else {
                        var33 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[7] <= 0.5) {
                            var33 = new double[] {0.2436345481777334, 0.45681477783325014, 0.29955067398901647};
                        } else {
                            var33 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var33 = new double[] {0.10706450197455025, 0.044610209156062605, 0.8483252888693871};
                        } else {
                            var33 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var33 = new double[] {0.0, 0.7806215722120659, 0.21937842778793418};
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[1] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var33 = new double[] {0.0, 0.6703296703296703, 0.32967032967032966};
                    } else {
                        var33 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var33 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[4] <= 0.5) {
                            var33 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var33 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    }
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var33 = new double[] {0.4464775846294602, 0.2790484903934126, 0.2744739249771272};
                        } else {
                            var33 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var33 = new double[] {0.0, 0.8074608904933814, 0.1925391095066185};
                        } else {
                            var33 = new double[] {0.0, 0.41309255079006774, 0.5869074492099323};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var33 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        } else {
                            var33 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var33 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var33 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var34;
        if (input[4] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var34 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[11] <= 0.5) {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var34 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var34 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var34 = new double[] {0.14194299011052938, 0.2957145627302696, 0.562342447159201};
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var34 = new double[] {0.0, 0.6317606444188723, 0.36823935558112775};
                        } else {
                            var34 = new double[] {0.0, 0.8120595144870791, 0.18794048551292092};
                        }
                    }
                } else {
                    if (input[10] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var34 = new double[] {0.7648902821316614, 0.0, 0.23510971786833856};
                        }
                    } else {
                        var34 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[2] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var34 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var34 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var34 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var34 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var34 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var34 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                } else {
                    if (input[9] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var34 = new double[] {0.0, 0.17888563049853376, 0.8211143695014663};
                        } else {
                            var34 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var34 = new double[] {0.0, 0.37888198757763975, 0.6211180124223602};
                    }
                }
            }
        }
        double[] var35;
        if (input[2] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[10] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var35 = new double[] {0.1565105837075048, 0.5869146889031431, 0.25657472738935216};
                        } else {
                            var35 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var35 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var35 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var35 = new double[] {0.1792964085606687, 0.19610544686323136, 0.6245981445761};
                        } else {
                            var35 = new double[] {0.7400346620450606, 0.0, 0.25996533795493937};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            var35 = new double[] {0.0, 0.7365532381997805, 0.2634467618002196};
                        } else {
                            var35 = new double[] {0.0, 0.47780678851174935, 0.5221932114882506};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var35 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var35 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var35 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[4] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var35 = new double[] {0.0, 0.1383219954648526, 0.8616780045351474};
                        } else {
                            var35 = new double[] {0.0, 0.47780678851174935, 0.5221932114882506};
                        }
                    } else {
                        var35 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    var35 = new double[] {0.6703296703296703, 0.0, 0.32967032967032966};
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[0] <= 285.0) {
                        var35 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[7] <= 0.5) {
                            var35 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var35 = new double[] {0.0, 0.9242424242424242, 0.07575757575757575};
                        }
                    }
                } else {
                    var35 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var36;
        if (input[8] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var36 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var36 = new double[] {0.0, 0.8633479746217667, 0.1366520253782333};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var36 = new double[] {0.0, 0.21205098493626884, 0.7879490150637313};
                        } else {
                            var36 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                } else {
                    if (input[7] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var36 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var36 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                        }
                    } else {
                        var36 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var36 = new double[] {0.2890995260663507, 0.0, 0.7109004739336493};
                        } else {
                            var36 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var36 = new double[] {0.0, 0.27601809954751133, 0.7239819004524888};
                        } else {
                            var36 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var36 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    } else {
                        var36 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                    }
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var36 = new double[] {0.0, 0.39524838012958957, 0.6047516198704104};
                    } else {
                        if (input[0] <= 285.0) {
                            var36 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var36 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var36 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    } else {
                        var36 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                }
            } else {
                if (input[1] <= 0.5) {
                    var36 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var36 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var37;
        if (input[3] <= 0.5) {
            if (input[11] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[12] <= 0.5) {
                        var37 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[0] <= 360.0) {
                            var37 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var37 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[4] <= 0.5) {
                        var37 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        var37 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                    }
                }
            } else {
                if (input[6] <= 0.5) {
                    if (input[4] <= 0.5) {
                        var37 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    } else {
                        if (input[9] <= 0.5) {
                            var37 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var37 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var37 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[10] <= 0.5) {
                if (input[6] <= 0.5) {
                    if (input[7] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var37 = new double[] {0.0, 0.8142774230992456, 0.1857225769007545};
                        } else {
                            var37 = new double[] {0.38485804416403785, 0.24053627760252366, 0.37460567823343854};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var37 = new double[] {0.0, 0.32670237184391737, 0.6732976281560827};
                        } else {
                            var37 = new double[] {0.0, 0.3952483801295896, 0.6047516198704104};
                        }
                    }
                } else {
                    if (input[0] <= 435.0) {
                        if (input[0] <= 285.0) {
                            var37 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        } else {
                            var37 = new double[] {0.0, 0.15601023017902815, 0.8439897698209717};
                        }
                    } else {
                        var37 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    var37 = new double[] {0.5111731843575419, 0.0, 0.48882681564245806};
                } else {
                    var37 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var38;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[4] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var38 = new double[] {0.29701765063907487, 0.1856360316494218, 0.5173463177115034};
                        } else {
                            var38 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        }
                    } else {
                        if (input[0] <= 360.0) {
                            var38 = new double[] {0.0, 0.08701854493580598, 0.9129814550641939};
                        } else {
                            var38 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var38 = new double[] {0.0, 0.10499139414802064, 0.8950086058519793};
                        } else {
                            var38 = new double[] {0.0, 0.16010498687664043, 0.8398950131233596};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var38 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var38 = new double[] {0.0, 0.9242424242424243, 0.07575757575757575};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        var38 = new double[] {0.0, 0.603960396039604, 0.39603960396039606};
                    } else {
                        var38 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var38 = new double[] {0.0, 0.5041322314049587, 0.4958677685950413};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var38 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var38 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[5] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var38 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var38 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                        }
                    } else {
                        if (input[0] <= 435.0) {
                            var38 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var38 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var38 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var38 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
            }
        }
        double[] var39;
        if (input[11] <= 0.5) {
            if (input[10] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var39 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var39 = new double[] {0.0, 0.2833443928334439, 0.7166556071665561};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            var39 = new double[] {0.22252621979024167, 0.13907888736890106, 0.6383948928408574};
                        } else {
                            var39 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var39 = new double[] {0.3433395872420263, 0.0, 0.6566604127579738};
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[0] <= 360.0) {
                        var39 = new double[] {0.7093023255813954, 0.0, 0.29069767441860467};
                    } else {
                        var39 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                } else {
                    var39 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[0] <= 285.0) {
                    if (input[8] <= 0.5) {
                        var39 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var39 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var39 = new double[] {0.0, 0.6354166666666667, 0.3645833333333333};
                        } else {
                            var39 = new double[] {0.0, 0.45864661654135336, 0.5413533834586467};
                        }
                    } else {
                        var39 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var39 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var39 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var39 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    if (input[9] <= 0.5) {
                        var39 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                    } else {
                        if (input[4] <= 0.5) {
                            var39 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var39 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        }
        double[] var40;
        if (input[11] <= 0.5) {
            if (input[3] <= 0.5) {
                if (input[12] <= 0.5) {
                    var40 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[2] <= 0.5) {
                        var40 = new double[] {0.1475211608222491, 0.36880290205562277, 0.4836759371221282};
                    } else {
                        if (input[1] <= 0.5) {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var40 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                }
            } else {
                if (input[12] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var40 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                        } else {
                            var40 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var40 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var40 = new double[] {0.11743472506316928, 0.2568884610756828, 0.625676813861148};
                        } else {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var40 = new double[] {0.10409556313993173, 0.0, 0.8959044368600683};
                    }
                }
            }
        } else {
            if (input[9] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var40 = new double[] {0.0, 0.23371647509578544, 0.7662835249042146};
                        } else {
                            var40 = new double[] {0.0, 0.5736677115987461, 0.42633228840125387};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var40 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        } else {
                            var40 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var40 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var40 = new double[] {0.0, 0.9014778325123153, 0.09852216748768472};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var40 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                        } else {
                            var40 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    }
                }
            } else {
                if (input[3] <= 0.5) {
                    var40 = new double[] {0.0, 1.0, 0.0};
                } else {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var40 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var40 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var40 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var40 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var41;
        if (input[11] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[0] <= 435.0) {
                    if (input[0] <= 360.0) {
                        if (input[0] <= 285.0) {
                            var41 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        } else {
                            var41 = new double[] {0.09397265549778545, 0.058732909686115914, 0.8472944348160987};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var41 = new double[] {0.14382552313586794, 0.08989095195991748, 0.7662835249042147};
                        } else {
                            var41 = new double[] {0.6466431095406361, 0.0, 0.35335689045936397};
                        }
                    }
                } else {
                    var41 = new double[] {0.9873545776428932, 0.0, 0.012645422357106728};
                }
            } else {
                if (input[12] <= 0.5) {
                    var41 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[9] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var41 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                        } else {
                            var41 = new double[] {0.08015768725361366, 0.0, 0.9198423127463864};
                        }
                    } else {
                        var41 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            }
        } else {
            if (input[0] <= 285.0) {
                if (input[2] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[9] <= 0.5) {
                            var41 = new double[] {0.0, 0.9014778325123153, 0.09852216748768472};
                        } else {
                            var41 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var41 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                } else {
                    var41 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[7] <= 0.5) {
                    if (input[9] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var41 = new double[] {0.0, 0.44852941176470584, 0.5514705882352942};
                        } else {
                            var41 = new double[] {0.0, 0.20265780730897012, 0.7973421926910299};
                        }
                    } else {
                        if (input[5] <= 0.5) {
                            var41 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        } else {
                            var41 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var41 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[0] <= 360.0) {
                            var41 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                        } else {
                            var41 = new double[] {0.0, 0.3567251461988304, 0.6432748538011696};
                        }
                    }
                }
            }
        }
        double[] var42;
        if (input[0] <= 435.0) {
            if (input[2] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[11] <= 0.5) {
                            var42 = new double[] {0.0, 0.5335276967930029, 0.46647230320699706};
                        } else {
                            var42 = new double[] {0.0, 0.6466431095406361, 0.35335689045936397};
                        }
                    } else {
                        if (input[10] <= 0.5) {
                            var42 = new double[] {0.1285902503293808, 0.11251646903820818, 0.7588932806324109};
                        } else {
                            var42 = new double[] {0.8702983138780804, 0.0, 0.1297016861219196};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var42 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                        } else {
                            var42 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var42 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[0] <= 360.0) {
                    if (input[4] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var42 = new double[] {0.16142904399603042, 0.7062520674826331, 0.13231888852133641};
                        } else {
                            var42 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var42 = new double[] {0.0, 0.9567333693888589, 0.04326663061114114};
                        } else {
                            var42 = new double[] {0.0, 0.7233201581027668, 0.2766798418972332};
                        }
                    }
                } else {
                    if (input[12] <= 0.5) {
                        var42 = new double[] {0.0, 0.3370165745856354, 0.6629834254143647};
                    } else {
                        if (input[8] <= 0.5) {
                            var42 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var42 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            var42 = new double[] {0.953125, 0.0, 0.046875};
        }
        double[] var43;
        if (input[10] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[9] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[0] <= 285.0) {
                            var43 = new double[] {0.0, 0.5495495495495496, 0.45045045045045046};
                        } else {
                            var43 = new double[] {0.0, 0.33701657458563533, 0.6629834254143647};
                        }
                    } else {
                        if (input[8] <= 0.5) {
                            var43 = new double[] {0.0, 0.3034825870646766, 0.6965174129353234};
                        } else {
                            var43 = new double[] {0.6703296703296704, 0.0, 0.3296703296703297};
                        }
                    }
                } else {
                    if (input[11] <= 0.5) {
                        var43 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                    } else {
                        if (input[2] <= 0.5) {
                            var43 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var43 = new double[] {0.0, 0.9096249435155896, 0.09037505648441026};
                        }
                    }
                }
            } else {
                if (input[0] <= 435.0) {
                    if (input[11] <= 0.5) {
                        if (input[3] <= 0.5) {
                            var43 = new double[] {0.3640432674375233, 0.11376352107422603, 0.5221932114882507};
                        } else {
                            var43 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var43 = new double[] {0.0, 0.56656346749226, 0.43343653250774};
                        } else {
                            var43 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                } else {
                    var43 = new double[] {0.5188729399255715, 0.1621477937267411, 0.3189792663476874};
                }
            }
        } else {
            if (input[3] <= 0.5) {
                var43 = new double[] {1.0, 0.0, 0.0};
            } else {
                if (input[0] <= 435.0) {
                    if (input[1] <= 0.5) {
                        if (input[6] <= 0.5) {
                            var43 = new double[] {0.7854077253218884, 0.0, 0.2145922746781116};
                        } else {
                            var43 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    } else {
                        var43 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var43 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        double[] var44;
        if (input[4] <= 0.5) {
            if (input[1] <= 0.5) {
                if (input[2] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var44 = new double[] {0.9545123726346434, 0.0, 0.04548762736535661};
                        } else {
                            var44 = new double[] {0.0, 0.4326241134751773, 0.5673758865248227};
                        }
                    } else {
                        if (input[0] <= 435.0) {
                            var44 = new double[] {0.0, 0.05974534769833495, 0.940254652301665};
                        } else {
                            var44 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        var44 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[11] <= 0.5) {
                            var44 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
                        } else {
                            var44 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var44 = new double[] {0.6703296703296703, 0.0, 0.32967032967032966};
                        } else {
                            var44 = new double[] {0.0, 0.17888563049853373, 0.8211143695014663};
                        }
                    } else {
                        var44 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[0] <= 360.0) {
                        var44 = new double[] {0.0, 0.7365532381997805, 0.2634467618002196};
                    } else {
                        var44 = new double[] {0.0, 0.31389365351629506, 0.6861063464837049};
                    }
                }
            }
        } else {
            if (input[6] <= 0.5) {
                if (input[11] <= 0.5) {
                    if (input[5] <= 0.5) {
                        if (input[2] <= 0.5) {
                            var44 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var44 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var44 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var44 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var44 = new double[] {0.0, 0.820627802690583, 0.17937219730941703};
                        } else {
                            var44 = new double[] {0.0, 0.832109129066107, 0.16789087093389296};
                        }
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    var44 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var44 = new double[] {0.0, 0.13232104121475052, 0.8676789587852495};
                }
            }
        }
        double[] var45;
        if (input[10] <= 0.5) {
            if (input[0] <= 285.0) {
                if (input[9] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var45 = new double[] {0.0, 0.5335276967930029, 0.466472303206997};
                        } else {
                            var45 = new double[] {0.0, 0.9143468950749465, 0.08565310492505353};
                        }
                    } else {
                        var45 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var45 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var45 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var45 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[11] <= 0.5) {
                            var45 = new double[] {0.0, 0.10873440285204991, 0.8912655971479501};
                        } else {
                            var45 = new double[] {0.0, 0.582971329278888, 0.41702867072111205};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var45 = new double[] {0.0, 0.48412698412698413, 0.5158730158730159};
                        } else {
                            var45 = new double[] {0.0, 0.2603129445234709, 0.7396870554765291};
                        }
                    }
                } else {
                    if (input[3] <= 0.5) {
                        var45 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[5] <= 0.5) {
                            var45 = new double[] {0.0, 0.25311203319502074, 0.7468879668049793};
                        } else {
                            var45 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[7] <= 0.5) {
                if (input[1] <= 0.5) {
                    var45 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var45 = new double[] {0.32795698924731187, 0.0, 0.6720430107526882};
                }
            } else {
                var45 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var46;
        if (input[10] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[6] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var46 = new double[] {0.0, 0.1940615058324496, 0.8059384941675504};
                        } else {
                            var46 = new double[] {0.0, 0.56656346749226, 0.43343653250773995};
                        }
                    } else {
                        if (input[0] <= 435.0) {
                            var46 = new double[] {0.10242059605428852, 0.12802574506786063, 0.7695536588778509};
                        } else {
                            var46 = new double[] {0.37596302003081655, 0.46995377503852076, 0.15408320493066255};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var46 = new double[] {0.0, 0.4778067885117494, 0.5221932114882506};
                        } else {
                            var46 = new double[] {0.43455031166518254, 0.09053131493024637, 0.47491837340457105};
                        }
                    } else {
                        var46 = new double[] {0.6192893401015228, 0.0, 0.38071065989847713};
                    }
                }
            } else {
                if (input[4] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var46 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[2] <= 0.5) {
                            var46 = new double[] {0.0, 0.8591549295774648, 0.1408450704225352};
                        } else {
                            var46 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[12] <= 0.5) {
                            var46 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var46 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
                        }
                    } else {
                        if (input[0] <= 285.0) {
                            var46 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var46 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    }
                }
            }
        } else {
            if (input[1] <= 0.5) {
                if (input[0] <= 360.0) {
                    if (input[5] <= 0.5) {
                        var46 = new double[] {0.8026315789473685, 0.0, 0.19736842105263158};
                    } else {
                        var46 = new double[] {0.8299319727891157, 0.0, 0.17006802721088435};
                    }
                } else {
                    var46 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var46 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var47;
        if (input[0] <= 435.0) {
            if (input[11] <= 0.5) {
                if (input[12] <= 0.5) {
                    if (input[0] <= 360.0) {
                        if (input[6] <= 0.5) {
                            var47 = new double[] {0.9242424242424242, 0.0, 0.07575757575757575};
                        } else {
                            var47 = new double[] {0.37888198757763975, 0.0, 0.6211180124223602};
                        }
                    } else {
                        var47 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[4] <= 0.5) {
                        if (input[7] <= 0.5) {
                            var47 = new double[] {0.18834426862215364, 0.07062910073330764, 0.7410266306445387};
                        } else {
                            var47 = new double[] {0.0, 0.13232104121475055, 0.8676789587852495};
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            var47 = new double[] {0.0, 0.2026578073089701, 0.7973421926910299};
                        } else {
                            var47 = new double[] {0.0, 0.4326241134751773, 0.5673758865248226};
                        }
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[1] <= 0.5) {
                        if (input[8] <= 0.5) {
                            var47 = new double[] {0.0, 0.8356164383561644, 0.16438356164383564};
                        } else {
                            var47 = new double[] {0.4278825076720737, 0.13371328364752302, 0.43840420868040336};
                        }
                    } else {
                        if (input[6] <= 0.5) {
                            var47 = new double[] {0.0, 0.6786155747836836, 0.32138442521631644};
                        } else {
                            var47 = new double[] {0.0, 0.5754716981132075, 0.42452830188679247};
                        }
                    }
                } else {
                    if (input[0] <= 285.0) {
                        var47 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var47 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            }
        } else {
            if (input[12] <= 0.5) {
                var47 = new double[] {1.0, 0.0, 0.0};
            } else {
                var47 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
            }
        }
        double[] var48;
        if (input[0] <= 435.0) {
            if (input[12] <= 0.5) {
                if (input[10] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[4] <= 0.5) {
                            var48 = new double[] {0.0, 0.820627802690583, 0.17937219730941706};
                        } else {
                            var48 = new double[] {0.0, 0.9716814159292035, 0.02831858407079646};
                        }
                    } else {
                        if (input[1] <= 0.5) {
                            var48 = new double[] {0.1625041625041625, 0.3046953046953047, 0.5328005328005327};
                        } else {
                            var48 = new double[] {0.0, 0.6302338227297444, 0.36976617727025557};
                        }
                    }
                } else {
                    if (input[6] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var48 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var48 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var48 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                    }
                }
            } else {
                if (input[9] <= 0.5) {
                    if (input[8] <= 0.5) {
                        if (input[5] <= 0.5) {
                            var48 = new double[] {0.0, 0.1689750692520776, 0.8310249307479224};
                        } else {
                            var48 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var48 = new double[] {0.4464775846294602, 0.2790484903934126, 0.2744739249771272};
                        } else {
                            var48 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[1] <= 0.5) {
                            var48 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var48 = new double[] {0.0, 0.6958174904942966, 0.3041825095057034};
                        }
                    } else {
                        var48 = new double[] {0.0, 0.27601809954751133, 0.7239819004524887};
                    }
                }
            }
        } else {
            if (input[11] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[3] <= 0.5) {
                        var48 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var48 = new double[] {0.8798076923076923, 0.0, 0.12019230769230768};
                    }
                } else {
                    var48 = new double[] {0.9838709677419354, 0.0, 0.016129032258064516};
                }
            } else {
                var48 = new double[] {0.0, 0.7530864197530864, 0.24691358024691357};
            }
        }
        double[] var49;
        if (input[10] <= 0.5) {
            if (input[12] <= 0.5) {
                if (input[8] <= 0.5) {
                    if (input[0] <= 285.0) {
                        if (input[2] <= 0.5) {
                            var49 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var49 = new double[] {0.0, 0.9296600234466589, 0.07033997655334114};
                        }
                    } else {
                        if (input[2] <= 0.5) {
                            var49 = new double[] {0.0, 0.5335276967930029, 0.4664723032069971};
                        } else {
                            var49 = new double[] {0.0, 0.7055730809674028, 0.29442691903259727};
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        var49 = new double[] {0.3257676902536716, 0.4072096128170895, 0.267022696929239};
                    } else {
                        var49 = new double[] {0.0, 0.6039603960396039, 0.396039603960396};
                    }
                }
            } else {
                if (input[8] <= 0.5) {
                    if (input[2] <= 0.5) {
                        if (input[4] <= 0.5) {
                            var49 = new double[] {0.04635258358662615, 0.23176291793313078, 0.7218844984802432};
                        } else {
                            var49 = new double[] {0.0, 0.3952483801295896, 0.6047516198704104};
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            var49 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            var49 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[2] <= 0.5) {
                        if (input[0] <= 360.0) {
                            var49 = new double[] {0.7555850475558505, 0.06746295067462953, 0.17695200176952003};
                        } else {
                            var49 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var49 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[2] <= 0.5) {
                if (input[7] <= 0.5) {
                    if (input[6] <= 0.5) {
                        var49 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[0] <= 405.0) {
                            var49 = new double[] {0.5495495495495496, 0.0, 0.45045045045045046};
                        } else {
                            var49 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var49 = new double[] {0.7093023255813953, 0.0, 0.29069767441860467};
                }
            } else {
                var49 = new double[] {0.4485294117647059, 0.0, 0.5514705882352942};
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(var0, var1), var2), var3), var4), var5), var6), var7), var8), var9), var10), var11), var12), var13), var14), var15), var16), var17), var18), var19), var20), var21), var22), var23), var24), var25), var26), var27), var28), var29), var30), var31), var32), var33), var34), var35), var36), var37), var38), var39), var40), var41), var42), var43), var44), var45), var46), var47), var48), var49);
    }
    private static double[] addVectors(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }
    private static double[] mulVectorNumber(double[] v1, double num) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * num;
        }
        return result;
    }
}

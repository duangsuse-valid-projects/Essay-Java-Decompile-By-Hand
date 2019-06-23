package org.duangsuse;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.PrintStream;
import java.util.Random;

public class TryTryTry {
    public static void main(String... args) throws InterruptedException {
        if (args.length <= 0) {
            // @99
            // control flow skip:
        } else {
            String fst = args[0];
            fst = fst.toLowerCase().replaceAll("^-", "");
            int $const_flagbr =0; /*%1*/

            if (fst .equals ("f")) {
                // code route: @49[iconst_1, goto 54] -> @54[istore_1]
                $const_flagbr = 1;
            } else if (! fst .equals ("alwayscontinue")) {
                // code route: @53[iconst_0] -> @54[istore_1]
                $const_flagbr = 0;
            } else {
                // code route: @49[iconst_1, goto 54] -> @54[istore_1]
                $const_flagbr = 1;
            } // — reduction

            //@55
            PrintStream stdout = java.lang.System.out;
            StringBuilder sb = new StringBuilder();
            // new, dup, invokespecial
            sb.append("\"").append(fst /*%2*/).append("\"");
            //@80
            sb.append($const_flagbr==0? "ignored":"accepted");
            // branch reduction [@83, @88] -> @90
            stdout.println(sb.toString());
        }
// if (args.length...) {} else {} 共有后件 @99

        OkHttpClient req = new okhttp3.OkHttpClient.Builder()
                .build(); /*%2*/
// dup

        Random rng = new java.util.Random(); /*%5*/
//%10 = 0
        int $_10 = 0;
        while (true) {
//push long 100000000l
//operator%
//push long 900000000l
//operator+
//%6=$1
            long rand = rng.nextLong() %  100000000l + 900000000l; // %6
            String $_8 = org.apache.commons.lang3.RandomStringUtils.random(10,true,true);
            StringBuilder sb1 = new StringBuilder().append("{\"u\":\"");
            sb1.append(rand);
            sb1.append("\",\"p\":\"");
            sb1.append($_8).append("\"}");

            String $_3 = sb1.toString();

            String $_4 = new String(
                    java.util.Base64.getEncoder().encode($_3.getBytes()));

            Request.Builder job = new okhttp3.Request.Builder();//dup
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://fffniubi888.cn/user.php?token=");
            sb2.append($_4);
            job.url(sb2.toString());
            Request $_11 = job.build();
            final Response resp;
//@236
            try{

                resp = req.newCall($_11).execute();
            } catch (java.net.SocketTimeoutException e/*%12*/) {
// @252
                e.printStackTrace();
// merged to @321
                $_10 += 1;
                continue;
            } catch (java.lang.Exception e1/*%12*/) {
                if (1 ==0) {} else {
                    e1.printStackTrace();
                    // merged to @321
                    $_10 += 1;continue;
                }
            }
// goto @279
            System.out.println(new StringBuilder().append(resp/*won't reach if execute fails*/).append("\t\t").append($_10).toString());
            resp.close();

            java.lang.Thread.sleep(100L);
//@321
            $_10 += 1;
            continue;
// goto @122: loop
        }

/// catch Exception table:
/*from    to  target type
    236   249   252   Class java/net/SocketTimeoutException
    236   249   262   Class java/lang/Exception */
    }
}

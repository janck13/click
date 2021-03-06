package org.nero.click.common.utils.rendom;

import java.util.Random;

/**
 * author： nero
 * email: nerosoft@outlook.com
 * data: 16-10-1
 * time: 下午2:41.
 */
public class RandomString {

    private final String seeds="abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+~";

    public String getRandomString(long length){
        StringBuilder randomString= new StringBuilder("");
        Random random = new Random();
        for(int i = 0; i< length; i++){
            int randomPos = random.nextInt(seeds.length());
            randomString.append(seeds.substring(randomPos,randomPos+1));
        }
        return randomString.toString();
    }
}

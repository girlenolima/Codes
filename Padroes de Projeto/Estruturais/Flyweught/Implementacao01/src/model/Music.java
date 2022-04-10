package model;

import musicFlyweigth.MusicFlyweight;

public class Music {

   /* private String name;
    private String artist;
    private Integer durationInSeconds;*/

    private MusicFlyweight musicFlyweight;
    private Integer playerQty;


    public Music(MusicFlyweight musicFlyweight) {
        this.musicFlyweight = musicFlyweight;
        this.playerQty = 0;
    }

    public void listenning() {
        playerQty++;
    }

    public MusicFlyweight getMusicFlyweight() {
        return musicFlyweight;
    }

    public void setMusicFlyweight(MusicFlyweight musicFlyweight) {
        this.musicFlyweight = musicFlyweight;
    }

    public Integer getPlayerQty() {
        return playerQty;
    }

    public void setPlayerQty(Integer playerQty) {
        this.playerQty = playerQty;
    }
}

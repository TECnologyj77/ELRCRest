package hello;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by Thomas on 1/24/2017.
 */

public class Home {
    private  final long ID;
    private final String NAME;
    private final String DESC;
    private final String EMBEDDED_URL;

    public Home(long id, String name, String desc, String embedded_url) {
        this.NAME = name;
        this.DESC = desc;
        this.ID = id;
        this.EMBEDDED_URL = embedded_url;
    }

    public String getName(){
        return NAME;
    }

    public String getDesc(){
        return  DESC;
    }

    public String getEmbedded_URL(){return EMBEDDED_URL;}

    public long getId(){return  ID;}

}

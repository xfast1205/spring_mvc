package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.model.StackoverflowWebsite;
import springboot.persistence.OverflowRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {

    @Autowired
    private OverflowRepository repository;

    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static {
        items.add(new StackoverflowWebsite( "stackoverflow",
                                            "http://stackoverflow.com",
                                            "http://cdn.static.net/Sites/stackoverflow/img/favicon.ico",
                                            "Stack Overflow (StackExchange)",
                                            "for professional and enthusiast programmers"));
        items.add(new StackoverflowWebsite( "serverfault",
                                            "http://serverfault.com",
                                            "http://cdn.static.net/Sites/serverfault/img/favicon.ico",
                                            "Server Fault (StackExchange)",
                                            "for system and network administrators"));
        items.add(new StackoverflowWebsite( "superuser",
                                            "http://superuser.com",
                                            "http://cdn.static.net/Sites/superuser/img/favicon.ico",
                                            "Super User (StackExchange)",
                                            "for computer enthusiasts and power user "));
        items.add(new StackoverflowWebsite( "askubuntu",
                                            "http://askubuntu.com",
                                            "http://icons.iconarchive.com/icons/dakirby309/simply-styled/32/OS-Ubuntu-icon.png",
                                            "Ask Ubuntu (StackExchange)",
                                            "for Ubuntu users and developers"));
        items.add(new StackoverflowWebsite( "apple",
                                            "http://apple.stackexchange.com",
                                            "http://cdn.static.net/Sites/apple/img/favicon.ico",
                                            "Ask Diffirent (StackExchange)",
                                            "for Ubuntu users and developers"));
        items.add(new StackoverflowWebsite( "android",
                                            "http://android.stackexchange.com",
                                            "http://cdn.static.net/Sites/android/img/favicon.ico",
                                            "Android Enthusiasts (StackExchange)",
                                            "for enthusiasts and power users of the Android operating system"));
        items.add(new StackoverflowWebsite( "ru.stackoverflow",
                                            "http://ru.stackoverflow.com",
                                            "http://cdn.static.net/Sites/ru/img/favicon.ico",
                                            "Stack Overflow на русском (StackExchange)",
                                            "для программистов"));
    }

    @PostConstruct
    public void init(){
        repository.save(items);
    }

    public List<StackoverflowWebsite> findAll() {
        return repository.findAll();
    }
}
package de.springboot.service;

import de.springboot.model.StackOverflowWebsite;
import de.springboot.persistence.StackOverflowWebsiteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackOverflowService {
    @Autowired
    private static StackOverflowWebsiteRepository repository;
    private static List<StackOverflowWebsite> items = new ArrayList<>();
   static  {
        items.add(new StackOverflowWebsite("stackoverflow", "http://stackoverflow.com",
                "http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchange)",
                "for professional and enthusiast programmers"));
        items.add(new StackOverflowWebsite("serverfault", "http://serverfault.com",
                "http://cdn.sstatic.net/Sites/serverfault/img/favicon.ico", "Server Fault (StackExchange)",
                "for system and network administrators"));
        items.add(new StackOverflowWebsite("superuser", "http://superuser.com",
                "http://cdn.sstatic.net/Sites/superuser/img/favicon.ico", "Super User (StackExchange)",
                "for computer enthusiasts and power users"));
        items.add(new StackOverflowWebsite("askubuntu", "http://askubuntu.com",
                "http://cdn.sstatic.net/Sites/askubuntu/img/favicon.ico", "Ask Ubuntu (StackExchange)",
                "for Ubuntu users and developers"));
        items.add(new StackOverflowWebsite("apple", "http://apple.stackexchange.com",
                "http://cdn.sstatic.net/Sites/apple/img/favicon.ico", "Ask Different (StackExchange)",
                "for power users of Apple hardware and software"));
        items.add(new StackOverflowWebsite("android", "http://android.stackexchange.com",
                "http://cdn.sstatic.net/Sites/android/img/favicon.ico", "Android Enthusiasts (StackExchange)",
                "for enthusiasts and power users of the Android operating system"));
        items.add(new StackOverflowWebsite("ru.stackoverflow", "http://ru.stackoverflow.com",
                "http://cdn.sstatic.net/Sites/ru/img/favicon.ico", "Stack Overflow на pуcскOM (StackExchange)",
                "для программистов"));
    }

    public  static List<StackOverflowWebsite> findAll(){
        return repository.findAll();
        
    }
}

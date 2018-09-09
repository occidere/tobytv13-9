package org.occidere.toby139;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
@Slf4j
public class Toby139Application {

//    @GetMapping("/")
//    Mono<String> hello() {
//        return Mono.just("Helo WebFlux");
//    }

//    /* pub -> (pub) -> (sub) */
//    @GetMapping("/")
//    Mono<String> hello() {
//        return Mono.just("Helo WebFlux").log(); // log는 중간 pub
//    }

//    /* pub -> (pub) -> (sub) */
//    @GetMapping("/")
//    Mono<String> hello() {
//        log.info("pos1");
//        Mono<String> m = Mono.just(generateHello())
//                .doOnNext(c-> log.info(c))
//                .log();
//        log.info("pos2");
//        return m;
//    }

//    /* pub -> (pub) -> (sub) */
//    @GetMapping("/")
//    Mono<String> hello() {
//        log.info("pos1");
//        Mono<String> m = Mono.fromSupplier(()-> generateHello())
//                .doOnNext(c-> log.info(c))
//                .log();
//        log.info("pos2");
//        return m;
//    }

//    /* pub -> (pub) -> (sub) */
//    @GetMapping("/")
//    Mono<String> hello() {
//        log.info("pos1");
//        Mono<String> m = Mono.fromSupplier(()-> generateHello())
//                .doOnNext(c-> log.info(c))
//                .log();
//
//        m.subscribe(); // 중간에 subscribe 호출 -> mono에서 생성된 것을 다 소모한다.
//
//        log.info("pos2");
//        return m;
//    }

//    /* pub -> (pub) -> (sub) */
//    @GetMapping("/")
//    Mono<String> hello() {
//        log.info("pos1");
//        String msg = generateHello();
//
//        Mono<String> m = Mono.just(msg)
//                .doOnNext(c-> log.info(c))
//                .log();
//
//        String msg2 = m.block(); // 결과값을 중간에 빼옴
//        log.info("pos2: " + msg2);
//
//        return Mono.just(msg2);
//    }

    private static String generateHello() {
        log.info("method generateHello()");
        return "Hello Mono";
    }

    public static void main(String[] args) {
        SpringApplication.run(Toby139Application.class, args);
    }
}

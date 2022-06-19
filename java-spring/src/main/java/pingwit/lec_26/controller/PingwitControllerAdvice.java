package pingwit.lec_26.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;


@ControllerAdvice
public class PingwitControllerAdvice {

    @ExceptionHandler
// лишняя строка
    public ResponseEntity<String> handle(AccessDeniedException e) {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Izvinite, polomalsya AccessDeniedException");
    }

    @ExceptionHandler
    public ResponseEntity<String> handle(Exception e) {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Izvinite, polomalsya Exception");
    }
}


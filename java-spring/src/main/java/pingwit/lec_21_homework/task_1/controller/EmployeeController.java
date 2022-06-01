package pingwit.lec_21_homework.task_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pingwit.lec_21_homework.task_1.entity.Employee;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping

public class EmployeeController {
    private static final Map<Long, Employee> EMPLOYEE_MAP = new HashMap<>();

    @PostConstruct
    private void init() {
        EMPLOYEE_MAP.put(1L, new Employee(1L, "Paul", 564L));
        EMPLOYEE_MAP.put(2L, new Employee(2L, "John", 563L));
        EMPLOYEE_MAP.put(3L, new Employee(3L, "Ringo", 566L));
        EMPLOYEE_MAP.put(4L, new Employee(4L, "George", 562L));
    }

   @GetMapping("/employee")
    public List<Employee> getAll() {
        return EMPLOYEE_MAP.values().stream()
                .toList();
    }

    }


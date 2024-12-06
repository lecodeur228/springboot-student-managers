package com.school.student_management.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import com.school.student_management.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository fournit déjà des méthodes comme save, findById, findAll, deleteById
}

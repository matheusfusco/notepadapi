package br.com.fiap.rm45401.notepadapi.repository

import br.com.fiap.rm45401.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository : MongoRepository <Nota, String> {
    @Query("{}")
    fun all(): Stream<Nota>

    fun findByTitulo(titulo: String) : Nota
}
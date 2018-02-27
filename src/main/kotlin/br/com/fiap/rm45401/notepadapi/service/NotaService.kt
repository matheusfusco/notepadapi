package br.com.fiap.rm45401.notepadapi.service

import br.com.fiap.rm45401.notepadapi.model.Nota
import br.com.fiap.rm45401.notepadapi.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota) {
        val aux = notaRepository.findByTitulo(nota.titulo!!)
        if (aux != null) {
            nota.id = aux.id
        }
        notaRepository.save(nota)
    }

    fun buscarTodas(): List<Nota> {
        return notaRepository.findAll()
    }

    fun buscar (titulo: String) : Nota {
        return notaRepository.findByTitulo(titulo)
    }
}
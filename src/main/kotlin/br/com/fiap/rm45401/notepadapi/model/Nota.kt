package br.com.fiap.rm45401.notepadapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Nota(@Id var id: String? = null,
                var titulo: String,
                var conteudo: String)
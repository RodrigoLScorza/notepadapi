package br.com.rodrigoscorza.notepadapi.repository

import br.com.rodrigoscorza.notepadapi.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NotaRepository : MongoRepository<Nota, String> {
    @Query("{}")
    fun all(): Stream<Nota>

    //isso é a query por titulo em mongodb
    fun findByTitulo(titulo: String): Nota

    //query para buscar por titulo e conteudo
    fun findByTituloAndConteudo(titulo: String, counteudo: String): Nota

}
create table respostas
(
    id        bigint   not null auto_increment,
    mensagem  text     not null,
    data      datetime not null default current_timestamp,
    autor_id  bigint   not null,
    topico_id bigint   not null,
    primary key (id),
    foreign key (autor_id) references autores (id),
    foreign key (topico_id) references topicos (id)
);
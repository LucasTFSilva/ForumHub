create table topicos
(
    id               bigint      not null auto_increment,
    mensagem         text        not null,
    data             datetime    not null default current_timestamp,
    duvida_resolvida boolean              default false,
    autor_id         bigint      not null,
    curso            varchar(25) not null,
    primary key (id),
    foreign key (autor_id) references autores (id)
);
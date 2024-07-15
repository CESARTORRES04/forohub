create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100),
    mensaje varchar(100),
    fecha_creacion datetime not null,
    usuario_id bigint not null,

    primary key(id),
    constraint fk_topicos_usuario_id foreign key(usuario_id) references usuarios(id)
);
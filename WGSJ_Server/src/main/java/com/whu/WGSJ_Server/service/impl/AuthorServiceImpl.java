package com.whu.WGSJ_Server.service.impl;

import com.whu.WGSJ_Server.domain.Author;
import com.whu.WGSJ_Server.domain.AuthorBook;
import com.whu.WGSJ_Server.domain.Book;
import com.whu.WGSJ_Server.mapper.AuthorMapper;
import com.whu.WGSJ_Server.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AuthorService")
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Integer addAuthor(Author author) {
        return authorMapper.insert(author);
    }

    @Override
    public Integer deleteAuthorById(String authorId) {
        return authorMapper.deleteById(authorId);
    }

    @Override
    public Integer updateAuthor(Author author) {
        return authorMapper.updateById(author);
    }

    @Override
    public Author getAuthorById(String authorId) {
        return authorMapper.selectById(authorId);
    }
}
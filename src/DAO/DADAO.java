/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author nguye
 * @param <EntityType>
 * @param <KeyType>
 */
abstract public class DADAO<EntityType,KeyType> {
  
    abstract public void insert(EntityType entity);
    /*
    cần 1 thực thể để đẩy nó xuống csdl, chưa biết nó là gì 
    nên đưa ra kiểu đại diện entityType(kiểu thực thể)
    */
    abstract public void update(EntityType entity);
    abstract public void delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    /*
    đưa id sẽ trả lại thực thể mà bạn cần tìm
    */
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
    /*
    Đưa 1 câu lệnh sql , danh sách các tham số để đổ vào các dấu chấm hỏi trong sql đó,
    trả về các thực thể tương ứng
    */
    }

package com.scleroidtech.gatepass.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.scleroidtech.gatepass.data.local.model.Visit;

import java.util.List;

/**
 * Copyright (C)
 *
 * @author Ganesh Kaple
 * @since 3/13/18
 */
@Dao
public interface VisitorDao extends BaseDao<Visit>  {
    /**
     * Select all Visitors from the Visit table.
     *
     * @return all Visitors.
     */
    @Query("SELECT * FROM Visit")
    List<Visit> getItems();

    /**
     * Select a Visit by id.
     *
     * @param VisitorId the Visit id.
     * @return the Visit with VisitorId.
     */
    @Query("SELECT * FROM Visit WHERE visitId = :VisitorId")
    Visit getItem(String VisitorId);

    /**
     * Insert a Visit in the database. If the Visit already exists, replace it.
     *
     * @param Visit the Visit to be inserted.
     */
    @Override
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Visit Visit);

    /**
     * Update a Visit.
     *
     * @param Visit Visit to be updated
     * @return the number of Visit updated. This should always be 1.
     */
    @Override
    @Update
    int update(Visit Visit);

    /**
     * Update the complete status of a Visit
     *
     * @param VisitorId id of the Visit
     * @param exitTime  status to be updated
     */
    @Query("UPDATE Visit SET exitTime = :exitTime WHERE visitId = :VisitorId")
    void updateCompleted(String VisitorId, String exitTime);

    /**
     * Delete a Visit by id.
     *
     * @return the number of Visit deleted. This should always be 1.
     */
    @Query("DELETE FROM Visit WHERE visitid = :VisitId")
    int deleteVisitorById(String VisitId);

    /**
     * Delete all Visitors.
     */
    @Query("DELETE FROM Visit")
    void deleteVisitors();

}
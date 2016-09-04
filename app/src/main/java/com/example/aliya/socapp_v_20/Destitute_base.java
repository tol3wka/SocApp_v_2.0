package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Destitute_base
{
  private Integer ID_des;
  private String Gender;
  private String objectId;
  private java.util.Date created;
  private Integer Age;
  private String Name;
  private String ownerId;
  private java.util.Date updated;
  public Integer getID_des()
  {
    return ID_des;
  }

  public void setID_des( Integer ID_des )
  {
    this.ID_des = ID_des;
  }

  public String getGender()
  {
    return Gender;
  }

  public void setGender( String Gender )
  {
    this.Gender = Gender;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public Integer getAge()
  {
    return Age;
  }

  public void setAge( Integer Age )
  {
    this.Age = Age;
  }

  public String getName()
  {
    return Name;
  }

  public void setName( String Name )
  {
    this.Name = Name;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

                                                    
  public Destitute_base save()
  {
    return Backendless.Data.of( Destitute_base.class ).save( this );
  }

  public Future<Destitute_base> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_base> future = new Future<Destitute_base>();
      Backendless.Data.of( Destitute_base.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Destitute_base> callback )
  {
    Backendless.Data.of( Destitute_base.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Destitute_base.class ).remove( this );
  }

  public Future<Long> removeAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Long> future = new Future<Long>();
      Backendless.Data.of( Destitute_base.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Destitute_base.class ).remove( this, callback );
  }

  public static Destitute_base findById( String id )
  {
    return Backendless.Data.of( Destitute_base.class ).findById( id );
  }

  public static Future<Destitute_base> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_base> future = new Future<Destitute_base>();
      Backendless.Data.of( Destitute_base.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Destitute_base> callback )
  {
    Backendless.Data.of( Destitute_base.class ).findById( id, callback );
  }

  public static Destitute_base findFirst()
  {
    return Backendless.Data.of( Destitute_base.class ).findFirst();
  }

  public static Future<Destitute_base> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_base> future = new Future<Destitute_base>();
      Backendless.Data.of( Destitute_base.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Destitute_base> callback )
  {
    Backendless.Data.of( Destitute_base.class ).findFirst( callback );
  }

  public static Destitute_base findLast()
  {
    return Backendless.Data.of( Destitute_base.class ).findLast();
  }

  public static Future<Destitute_base> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_base> future = new Future<Destitute_base>();
      Backendless.Data.of( Destitute_base.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Destitute_base> callback )
  {
    Backendless.Data.of( Destitute_base.class ).findLast( callback );
  }

  public static BackendlessCollection<Destitute_base> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Destitute_base.class ).find( query );
  }

  public static Future<BackendlessCollection<Destitute_base>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Destitute_base>> future = new Future<BackendlessCollection<Destitute_base>>();
      Backendless.Data.of( Destitute_base.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Destitute_base>> callback )
  {
    Backendless.Data.of( Destitute_base.class ).find( query, callback );
  }
}
package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Users_joined_event
{
  private java.util.Date updated;
  private java.util.Date created;
  private String objectId;
  private String ownerId;
  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

                                                    
  public Users_joined_event save()
  {
    return Backendless.Data.of( Users_joined_event.class ).save( this );
  }

  public Future<Users_joined_event> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_joined_event> future = new Future<Users_joined_event>();
      Backendless.Data.of( Users_joined_event.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Users_joined_event> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Users_joined_event.class ).remove( this );
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
      Backendless.Data.of( Users_joined_event.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).remove( this, callback );
  }

  public static Users_joined_event findById( String id )
  {
    return Backendless.Data.of( Users_joined_event.class ).findById( id );
  }

  public static Future<Users_joined_event> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_joined_event> future = new Future<Users_joined_event>();
      Backendless.Data.of( Users_joined_event.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Users_joined_event> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).findById( id, callback );
  }

  public static Users_joined_event findFirst()
  {
    return Backendless.Data.of( Users_joined_event.class ).findFirst();
  }

  public static Future<Users_joined_event> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_joined_event> future = new Future<Users_joined_event>();
      Backendless.Data.of( Users_joined_event.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Users_joined_event> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).findFirst( callback );
  }

  public static Users_joined_event findLast()
  {
    return Backendless.Data.of( Users_joined_event.class ).findLast();
  }

  public static Future<Users_joined_event> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_joined_event> future = new Future<Users_joined_event>();
      Backendless.Data.of( Users_joined_event.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Users_joined_event> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).findLast( callback );
  }

  public static BackendlessCollection<Users_joined_event> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Users_joined_event.class ).find( query );
  }

  public static Future<BackendlessCollection<Users_joined_event>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Users_joined_event>> future = new Future<BackendlessCollection<Users_joined_event>>();
      Backendless.Data.of( Users_joined_event.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Users_joined_event>> callback )
  {
    Backendless.Data.of( Users_joined_event.class ).find( query, callback );
  }
}
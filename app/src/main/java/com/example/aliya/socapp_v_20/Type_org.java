package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Type_org
{
  private String ownerId;
  private java.util.Date created;
  private String objectId;
  private String Type;
  private java.util.Date updated;
  private java.util.List<Destitute_org> ID_type_org;
  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public String getType()
  {
    return Type;
  }

  public void setType( String Type )
  {
    this.Type = Type;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public java.util.List<Destitute_org> getID_type_org()
  {
    return ID_type_org;
  }

  public void setID_type_org( java.util.List<Destitute_org> ID_type_org )
  {
    this.ID_type_org = ID_type_org;
  }

                                                    
  public Type_org save()
  {
    return Backendless.Data.of( Type_org.class ).save( this );
  }

  public Future<Type_org> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Type_org> future = new Future<Type_org>();
      Backendless.Data.of( Type_org.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Type_org> callback )
  {
    Backendless.Data.of( Type_org.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Type_org.class ).remove( this );
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
      Backendless.Data.of( Type_org.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Type_org.class ).remove( this, callback );
  }

  public static Type_org findById( String id )
  {
    return Backendless.Data.of( Type_org.class ).findById( id );
  }

  public static Future<Type_org> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Type_org> future = new Future<Type_org>();
      Backendless.Data.of( Type_org.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Type_org> callback )
  {
    Backendless.Data.of( Type_org.class ).findById( id, callback );
  }

  public static Type_org findFirst()
  {
    return Backendless.Data.of( Type_org.class ).findFirst();
  }

  public static Future<Type_org> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Type_org> future = new Future<Type_org>();
      Backendless.Data.of( Type_org.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Type_org> callback )
  {
    Backendless.Data.of( Type_org.class ).findFirst( callback );
  }

  public static Type_org findLast()
  {
    return Backendless.Data.of( Type_org.class ).findLast();
  }

  public static Future<Type_org> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Type_org> future = new Future<Type_org>();
      Backendless.Data.of( Type_org.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Type_org> callback )
  {
    Backendless.Data.of( Type_org.class ).findLast( callback );
  }

  public static BackendlessCollection<Type_org> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Type_org.class ).find( query );
  }

  public static Future<BackendlessCollection<Type_org>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Type_org>> future = new Future<BackendlessCollection<Type_org>>();
      Backendless.Data.of( Type_org.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Type_org>> callback )
  {
    Backendless.Data.of( Type_org.class ).find( query, callback );
  }
}
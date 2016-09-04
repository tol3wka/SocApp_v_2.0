package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Users_data
{
  private Integer Age;
  private String Photo;
  private String ownerId;
  private String objectId;
  private java.util.Date updated;
  private String Phone_Num;
  private java.util.Date created;
  private String Name;
  private java.util.List<Event> ID_user_ev;
  private java.util.List<Users_joined_event> ID_user_join;
  public Integer getAge()
  {
    return Age;
  }

  public void setAge( Integer Age )
  {
    this.Age = Age;
  }

  public String getPhoto()
  {
    return Photo;
  }

  public void setPhoto( String Photo )
  {
    this.Photo = Photo;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public String getObjectId()
  {
    return objectId;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getPhone_Num()
  {
    return Phone_Num;
  }

  public void setPhone_Num( String Phone_Num )
  {
    this.Phone_Num = Phone_Num;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getName()
  {
    return Name;
  }

  public void setName( String Name )
  {
    this.Name = Name;
  }

  public java.util.List<Event> getID_user_ev()
  {
    return ID_user_ev;
  }

  public void setID_user_ev( java.util.List<Event> ID_user_ev )
  {
    this.ID_user_ev = ID_user_ev;
  }

  public java.util.List<Users_joined_event> getID_user_join()
  {
    return ID_user_join;
  }

  public void setID_user_join( java.util.List<Users_joined_event> ID_user_join )
  {
    this.ID_user_join = ID_user_join;
  }

                                                    
  public Users_data save()
  {
    return Backendless.Data.of( Users_data.class ).save( this );
  }

  public Future<Users_data> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_data> future = new Future<Users_data>();
      Backendless.Data.of( Users_data.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Users_data> callback )
  {
    Backendless.Data.of( Users_data.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Users_data.class ).remove( this );
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
      Backendless.Data.of( Users_data.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Users_data.class ).remove( this, callback );
  }

  public static Users_data findById( String id )
  {
    return Backendless.Data.of( Users_data.class ).findById( id );
  }

  public static Future<Users_data> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_data> future = new Future<Users_data>();
      Backendless.Data.of( Users_data.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Users_data> callback )
  {
    Backendless.Data.of( Users_data.class ).findById( id, callback );
  }

  public static Users_data findFirst()
  {
    return Backendless.Data.of( Users_data.class ).findFirst();
  }

  public static Future<Users_data> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_data> future = new Future<Users_data>();
      Backendless.Data.of( Users_data.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Users_data> callback )
  {
    Backendless.Data.of( Users_data.class ).findFirst( callback );
  }

  public static Users_data findLast()
  {
    return Backendless.Data.of( Users_data.class ).findLast();
  }

  public static Future<Users_data> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Users_data> future = new Future<Users_data>();
      Backendless.Data.of( Users_data.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Users_data> callback )
  {
    Backendless.Data.of( Users_data.class ).findLast( callback );
  }

  public static BackendlessCollection<Users_data> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Users_data.class ).find( query );
  }

  public static Future<BackendlessCollection<Users_data>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Users_data>> future = new Future<BackendlessCollection<Users_data>>();
      Backendless.Data.of( Users_data.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Users_data>> callback )
  {
    Backendless.Data.of( Users_data.class ).find( query, callback );
  }
}
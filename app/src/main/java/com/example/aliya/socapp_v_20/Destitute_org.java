package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Destitute_org
{
  private String objectId;
  private String PhoneNum;
  private java.util.Date created;
  private String Organization;
  private java.util.Date updated;
  private String ownerId;
  private java.util.List<Event> ID_org_event;
  private java.util.List<Destitute_base> ID_org_des;
  public String getObjectId()
  {
    return objectId;
  }

  public String getPhoneNum()
  {
    return PhoneNum;
  }

  public void setPhoneNum( String PhoneNum )
  {
    this.PhoneNum = PhoneNum;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public String getOrganization()
  {
    return Organization;
  }

  public void setOrganization( String Organization )
  {
    this.Organization = Organization;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public java.util.List<Event> getID_org_event()
  {
    return ID_org_event;
  }

  public void setID_org_event( java.util.List<Event> ID_org_event )
  {
    this.ID_org_event = ID_org_event;
  }

  public java.util.List<Destitute_base> getID_org_des()
  {
    return ID_org_des;
  }

  public void setID_org_des( java.util.List<Destitute_base> ID_org_des )
  {
    this.ID_org_des = ID_org_des;
  }

                                                    
  public Destitute_org save()
  {
    return Backendless.Data.of( Destitute_org.class ).save( this );
  }

  public Future<Destitute_org> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_org> future = new Future<Destitute_org>();
      Backendless.Data.of( Destitute_org.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Destitute_org> callback )
  {
    Backendless.Data.of( Destitute_org.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Destitute_org.class ).remove( this );
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
      Backendless.Data.of( Destitute_org.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Destitute_org.class ).remove( this, callback );
  }

  public static Destitute_org findById( String id )
  {
    return Backendless.Data.of( Destitute_org.class ).findById( id );
  }

  public static Future<Destitute_org> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_org> future = new Future<Destitute_org>();
      Backendless.Data.of( Destitute_org.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Destitute_org> callback )
  {
    Backendless.Data.of( Destitute_org.class ).findById( id, callback );
  }

  public static Destitute_org findFirst()
  {
    return Backendless.Data.of( Destitute_org.class ).findFirst();
  }

  public static Future<Destitute_org> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_org> future = new Future<Destitute_org>();
      Backendless.Data.of( Destitute_org.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Destitute_org> callback )
  {
    Backendless.Data.of( Destitute_org.class ).findFirst( callback );
  }

  public static Destitute_org findLast()
  {
    return Backendless.Data.of( Destitute_org.class ).findLast();
  }

  public static Future<Destitute_org> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Destitute_org> future = new Future<Destitute_org>();
      Backendless.Data.of( Destitute_org.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Destitute_org> callback )
  {
    Backendless.Data.of( Destitute_org.class ).findLast( callback );
  }

  public static BackendlessCollection<Destitute_org> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Destitute_org.class ).find( query );
  }

  public static Future<BackendlessCollection<Destitute_org>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Destitute_org>> future = new Future<BackendlessCollection<Destitute_org>>();
      Backendless.Data.of( Destitute_org.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Destitute_org>> callback )
  {
    Backendless.Data.of( Destitute_org.class ).find( query, callback );
  }
}
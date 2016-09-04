package com.example.aliya.socapp_v_20;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.geo.GeoPoint;
import com.backendless.persistence.BackendlessDataQuery;

public class Event
{
  private String objectId;
  private String Location;
  private String Event;
  private java.util.Date updated;
  private String ownerId;
  private String DateTime;
  private java.util.Date created;
  private java.util.List<Users_joined_event> ID_event;
  public String getObjectId()
  {
    return objectId;
  }

  public String getLocation()
  {
    return Location;
  }

  public void setLocation( String Location )
  {
    this.Location = Location;
  }

  public String getEvent()
  {
    return Event;
  }

  public void setEvent( String Event )
  {
    this.Event = Event;
  }

  public java.util.Date getUpdated()
  {
    return updated;
  }

  public String getOwnerId()
  {
    return ownerId;
  }

  public String getDateTime()
  {
    return DateTime;
  }

  public void setDateTime( String DateTime )
  {
    this.DateTime = DateTime;
  }

  public java.util.Date getCreated()
  {
    return created;
  }

  public java.util.List<Users_joined_event> getID_event()
  {
    return ID_event;
  }

  public void setID_event( java.util.List<Users_joined_event> ID_event )
  {
    this.ID_event = ID_event;
  }

                                                    
  public Event save()
  {
    return Backendless.Data.of( Event.class ).save( this );
  }

  public Future<Event> saveAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Event> future = new Future<Event>();
      Backendless.Data.of( Event.class ).save( this, future );

      return future;
    }
  }

  public void saveAsync( AsyncCallback<Event> callback )
  {
    Backendless.Data.of( Event.class ).save( this, callback );
  }

  public Long remove()
  {
    return Backendless.Data.of( Event.class ).remove( this );
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
      Backendless.Data.of( Event.class ).remove( this, future );

      return future;
    }
  }

  public void removeAsync( AsyncCallback<Long> callback )
  {
    Backendless.Data.of( Event.class ).remove( this, callback );
  }

  public static Event findById( String id )
  {
    return Backendless.Data.of( Event.class ).findById( id );
  }

  public static Future<Event> findByIdAsync( String id )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Event> future = new Future<Event>();
      Backendless.Data.of( Event.class ).findById( id, future );

      return future;
    }
  }

  public static void findByIdAsync( String id, AsyncCallback<Event> callback )
  {
    Backendless.Data.of( Event.class ).findById( id, callback );
  }

  public static Event findFirst()
  {
    return Backendless.Data.of( Event.class ).findFirst();
  }

  public static Future<Event> findFirstAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Event> future = new Future<Event>();
      Backendless.Data.of( Event.class ).findFirst( future );

      return future;
    }
  }

  public static void findFirstAsync( AsyncCallback<Event> callback )
  {
    Backendless.Data.of( Event.class ).findFirst( callback );
  }

  public static Event findLast()
  {
    return Backendless.Data.of( Event.class ).findLast();
  }

  public static Future<Event> findLastAsync()
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<Event> future = new Future<Event>();
      Backendless.Data.of( Event.class ).findLast( future );

      return future;
    }
  }

  public static void findLastAsync( AsyncCallback<Event> callback )
  {
    Backendless.Data.of( Event.class ).findLast( callback );
  }

  public static BackendlessCollection<Event> find( BackendlessDataQuery query )
  {
    return Backendless.Data.of( Event.class ).find( query );
  }

  public static Future<BackendlessCollection<Event>> findAsync( BackendlessDataQuery query )
  {
    if( Backendless.isAndroid() )
    {
      throw new UnsupportedOperationException( "Using this method is restricted in Android" );
    }
    else
    {
      Future<BackendlessCollection<Event>> future = new Future<BackendlessCollection<Event>>();
      Backendless.Data.of( Event.class ).find( query, future );

      return future;
    }
  }

  public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Event>> callback )
  {
    Backendless.Data.of( Event.class ).find( query, callback );
  }
}
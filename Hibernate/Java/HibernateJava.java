
package cit360_hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CIT360_Hibernate {

    public static void main(String[] args) {

        // Begin a database session
        Session s=connection.Controller.getSessionFactory().openSession();

        // ADD RECORDS TO THE DATABASE

        // Begin the transaction to add records
        Transaction tr=s.beginTransaction();

        // Save 2 Artist Records to the Database
        pojos.Artist ar1=new pojos.Artist();
        ar1.setName("Bruce Springsteen");
        pojos.Artist ar2=new pojos.Artist();
        ar2.setName("Coldplay");

        s.save(ar1);
        s.save(ar2);

        // Save 2 Song Records to Database
        pojos.Song so1=new pojos.Song();
        so1.setName("Born to Run");
        so1.setAlbum("Born to Run");
        so1.setGenre("Classic Rock");

        pojos.Song so2=new pojos.Song();
        so2.setName("Sky Full of Stars");
        so2.setAlbum("Ghost Stories");
        so2.setGenre("Alternative");

        // Save the Records
        s.save(so1);
        s.save(so2);

        // Commit the transaction
        tr.commit();
        tr = null;

        System.out.println("Add Success...");

        // UPDATE RECORDS IN THE DATABASE

        // Begin the transaction to update records
        tr=s.beginTransaction();

        // Get artist record from database and change name
        pojos.Artist artist1=(pojos.Artist)s.load(pojos.Artist.class,1);

        if("Bruce Springsteen".equals(artist1.getName())) {

            artist1.setName("Bruce Springsteen and the E Street Band");

        } else {

            artist1.setName("Bruce Springsteen");

        }

        s.update(artist1);

        // Get song record from database and change name
        pojos.Song song1=(pojos.Song)s.load(pojos.Song.class,1);

        if("Born to Run".equals(song1.getName())) {

            song1.setName("Dancing in the Dark");
            song1.setAlbum("Born in the USA");
            song1.setGenre("Rock");

        } else {

            song1.setName("Born to Run");
            song1.setAlbum("Born to Run");
            song1.setGenre("Clasic Rock");

        }

        s.update(song1);

        // Commit the transaction
        tr.commit();
        tr = null;

        System.out.println("Update Success...");

        // DELETE RECORDS IN THE DATABASE

        // Begin the transaction to delete records
        tr=s.beginTransaction();

        // Get artist record and delete it from the database
        pojos.Artist delArtist1=(pojos.Artist)s.load(pojos.Artist.class,1);
        s.delete(delArtist1);

        // Get song record from database and change name
        pojos.Song delSong1=(pojos.Song)s.load(pojos.Song.class,1);
        s.delete(delSong1);

        // Commit the transaction
        tr.commit();
        tr = null;

        System.out.println("Delete Success...");

        // LIST RECORDS IN THE DATABASE

        // Get all artist records using HQL
        String HQL = "from Artist";
        Query q = s.createQuery(HQL);

        List<pojos.Artist> alist = q.list();

        for (pojos.Artist artists : alist) {

            System.out.println(artists.getId() + ", " + artists.getName());

        }

        // Get all song records using HQL
        HQL = "from Song";
        q = s.createQuery(HQL);

        List<pojos.Song> slist = q.list();

        for (pojos.Song songs : slist) {

            System.out.println(songs.getId() + ", " + songs.getName() + ", " + songs.getAlbum() + ", " + songs.getGenre());

        }

        // Get a single artist record using HQL
        HQL = "from Artist where id=4";
        q = s.createQuery(HQL);

        pojos.Artist oneArtist=(pojos.Artist)q.uniqueResult();

        System.out.println(oneArtist.getId() + ", " + oneArtist.getName());

        // Get a single song record using HQL
        HQL = "from Song where id=5";

        q = s.createQuery(HQL);

        pojos.Song oneSong=(pojos.Song)q.uniqueResult();

        System.out.println(oneSong.getId() + ", " + oneSong.getName() + ", " + oneSong.getAlbum() + ", " + oneSong.getGenre());

        System.out.println("Get Success...");

        s.close();

    }

}
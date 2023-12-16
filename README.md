We built a standalone API that enables the user to represent simple music and generate accompaniment (chord) and synthetic performance. The user gives a melody and chord names, and the system can generate the accompaniment and the full music. This is a typical use case when the user has a lead sheet and wants to convert it into full music with interpreted chords. The user could specify how the accompaniment is generated, for example, the style (plain, arpeggio, and more) and the rhythm. The target audience is music players who have some experience but don't have a good understanding of chords and how to interpret the chords. The API can help the target audience identify what notes are in a chord and get a taste of interpreting a lead sheet. Given the complexity of representing music pieces (music has vertical and horizontal structure) and the prevalence of music notation software with GUI, we believe that our API needs to provide sufficient power to build a GUI. Given the robustness and completeness of our API in terms of music representation, we believe an application with GUI can be built quickly.

Authors:
[@stevezhang1999](https://github.com/stevezhang1999)
[@zihaoyng](https://github.com/zihaoyng)

1. Use command 
```
mvn install:install-file -Dfile="./jfugue-5.0.9.jar" -DgroupId="org.jfugue" -DartifactId=jfugue -Dversion=5.0.9 -Dpackaging=jar -DgeneratePom=true
```
to install jFugue to enable mvn operations. 
Then, to run the demo, use
```
mvn exec:exec
``` 

2. API Documentation: Clone and uncompress API JavaDoc.zip. Then open index.html

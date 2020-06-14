package Model;

/**
 *
 * @author david
 */
public class Identifier
{
  String id;

  public Identifier() {
    this.generate();
  }

  private void generate() {
    this.id = java.util.UUID.randomUUID().toString();
  }

  public String getID() {
    return id;
  }

  public void setID(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return this.id;
  }
}
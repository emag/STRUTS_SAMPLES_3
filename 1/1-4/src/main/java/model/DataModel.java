package model;

/**
 * データを表すクラス
 *
 * @author tanabe
 */
public class DataModel {

  private String name;
  private String value;

  public DataModel() {}

  public DataModel(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DataModel model = (DataModel) o;

    if (!name.equals(model.name)) return false;
    if (!value.equals(model.value)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + value.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "DataModel{" +
      "name='" + name + '\'' +
      ", value='" + value + '\'' +
      '}';
  }

}



/**
04
 * @author ashraf
05
 *
06
 */

public class Student {

    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    /**
15
     * @param id
16
     * @param firstName
17
     * @param lastName
18
     * @param gender
19
     * @param age
20
     */

    public Student(long id, String firstName, String lastName, String gender,

            int age) {

        super();

        this.id = id;

        this.firstName = firstName;

        this.lastName = lastName;

        this.gender = gender;

      this.age = age;
    }

    /**
31
     * @return the id
32
     */

    public long getId() {

        return id;

    }
    /**
37
     * @param id the id to set
38
     */

   /* public void setId(long id) {

        this.id = id;

    }*/

    /**
43
     * @return the firstName
44
     */

    public String getFirstName() {

        return firstName;

    }

    /**
49
     * @param firstName the firstName to set
50
     */

  /*  public void setFirstName(String firstName) {

        this.firstName = firstName;

    } */

    /**
55
     * @return the lastName
56
     */

    public String getLastName() {

        return lastName;

    }

    /**
61
     * @param lastName the lastName to set
62
     */

  /*  public void setLastName(String lastName) {

        this.lastName = lastName;

    }*/

    /**
67
     * @return the gender
68
     */

    public String getGender() {

        return gender;

    }

    /**
73
     * @param gender the gender to set
74
     */
    /*public void setGender(String gender) {
        this.gender = gender;
    }

	*/
    /**
79
     * @return the age
80
     */

    public int getAge() {
        return age;
    }
    /**
85
     * @param age the age to set
86
     */

   /* public void setAge(int age) {

       this.age = age;

    } */

     

    @Override

    public String toString() {

        return "Student [id=" + id + ", firstName=" + firstName

                + ", lastName=" + lastName + ", gender=" + gender + ", age="

                + age + "]";

    }

}

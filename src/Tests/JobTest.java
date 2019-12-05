package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobs(){
        test_job1 = new Job();
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testSettingJobId() {
    assertFalse(test_job1.getId() == test_job2.getId() && test_job2.getId() == test_job1.getId() - 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
    assertEquals(test_job3.getName(), "Product tester");
    assertEquals(test_job3.getEmployer().getValue(), "ACME");
    assertEquals(test_job3.getLocation().getValue(), "Desert");
    assertEquals(test_job3.getPositionType().getValue(), "Quality control");
    assertEquals(test_job3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
    assertFalse(test_job2.equals(test_job3));
    }

    @Test
    public void testToString() {
        String testingString = "ID=" + "2" + "\n" +
                "Name:" + "Product tester" + "\n" +
                "Employer:" + "ACME" + "\n" +
                "Location:" + "Desert" + "\n" +
                "Position Type:" + "Quality control" + "\n" +
                "Core Competency:" + "Persistence" + "\n";
        assertEquals(test_job2.toString(), testingString);
    }


}

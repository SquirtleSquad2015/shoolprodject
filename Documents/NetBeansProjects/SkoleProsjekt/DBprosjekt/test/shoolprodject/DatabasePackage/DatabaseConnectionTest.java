/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoolprodject.DatabasePackage;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haldor
 */
public class DatabaseConnectionTest extends DatabaseConnection{
    
    public DatabaseConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            
            openConnection();
        } catch (Exception ex) {
            Logger.getLogger(DatabaseConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @After
    public void tearDown() {
        try {
           
            closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(DatabaseConnectionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of openConnection method, of class DatabaseConnection.
     */
    @Test
    public void testOpenConnection() throws Exception {
        System.out.println("openConnection");
        DatabaseConnection instance = new DatabaseConnection();
        instance.openConnection();
       
    }

    /**
     * Test of closeConnection method, of class DatabaseConnection.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        DatabaseConnection instance = new DatabaseConnection();
        closeConnection();
        
    }

    /**
     * Test of checkDB method, of class DatabaseConnection.
     */
    @Test
    public void testCheckDB() throws Exception {
        System.out.println("checkDB");
        boolean expResult = false;
        boolean result = checkDB();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of newCenter method, of class DatabaseConnection.
     */
    @Test
    public void testNewCenter() {
        System.out.println("newCenter");
        String na = "DummyCenter";
        String mu = "DummyMunicipality";
        String tu = "22";
        String sh = "1";
        String sq = "1000";
        String ad = "DummyAddress";
        String tl = "48292211";
        String ma = "dumy@center.no";
        String ca = "y";
        String de = "Dumt center";
        int expResult = 1;
        int result = newCenter(na, mu, tu, sh, sq, ad, tl, ma, ca, de);
        assertEquals(expResult, result);

    }
    /**
     * Test of regNewStore method, of class DatabaseConnection.
     */
    @Test
    public void testRegNewStore() {
        System.out.println("regNewStore");
        String storeName = "DummyStore";
        String centerName = "DummyCenter";
        String trade = "Elektronikk";
        String location = "DummyLocation";
        String floor = "2";
        String openingHrs = "dummyOpeninghrs";
        String openingHrsWeekends = "EvenDumberOpeninghrs";
        String description = "DummyStore";
        int expResult = 1;
        int result = regNewStore(storeName, centerName, trade, location, floor, openingHrs, openingHrsWeekends, description);
        assertEquals(expResult, result);

    }
    /**
     * Test of getCenters method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenters() {
        System.out.println("getCenters");
        String centername = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getCenters(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStore method, of class DatabaseConnection.
     */
    @Test
    public void testGetStore() {
        System.out.println("getStore");
        String centerName = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getStore(centerName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStoreAndTrade method, of class DatabaseConnection.
     */
    @Test
    public void testGetStoreAndTrade() {
        System.out.println("getStoreAndTrade");
        String centerName = "DummyCenter";
        String trade = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getStoreAndTrade(centerName, trade);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMuncipality method, of class DatabaseConnection.
     */
    @Test
    public void testGetMuncipality() {
        System.out.println("getMuncipality");
        String kommun = "DummyMunicipality";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getMuncipality(kommun);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCenterMunicipality method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterMunicipality() {
        System.out.println("getCenterMunicipality");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getCenterMunicipality(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTurnoverStore method, of class DatabaseConnection.
     */
    @Test
    public void testGetTurnoverStore() {
        System.out.println("getTurnoverStore");
        String centername = "DummyCenter";
        String storename = "DummyStore";
        Integer expResult = -1;
        Integer result = getTurnoverStore(centername, storename);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTradeStore method, of class DatabaseConnection.
     */
    @Test
    public void testGetTradeStore() {
        System.out.println("getTradeStore");
        String Storename = "DummyStore";
        String expResult = "No trades found in store";
        String result = getTradeStore(Storename);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTradeCenter method, of class DatabaseConnection.
     */
    @Test
    public void testGetTradeCenter() {
        System.out.println("getTradeCenter");
        String Centername = "DummyCenter";
        String expResult = "No trades found in center";
        String result = getTradeCenter(Centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getParking method, of class DatabaseConnection.
     */
    @Test
    public void testGetParking() {
        System.out.println("getParking");
        String centername = "DummyCenter";
        String expResult = "No parking information found";
        String result = getParking(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAddress method, of class DatabaseConnection.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String centername = "DummyCenter";
        String expResult = "No address found";
        String result = getAddress(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCenterManager method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterManager() {
        System.out.println("getCenterManager");
        String centername = "DummyCenter";
        String expResult = "No center manager found";
        String result = getCenterManager(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStoreManager method, of class DatabaseConnection.
     */
    @Test
    public void testGetStoreManager() {
        System.out.println("getStoreManager");
        String centername = "DummyCenter";
        String storename = "DummyStore";
        String expResult = "No store manager found";
        String result = getStoreManager(centername, storename);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPersonName method, of class DatabaseConnection.
     */
    @Test
    public void testGetPersonName() {
        System.out.println("getPersonName");
        String username = "";
        String expResult = "No name found";
        String result = getPersonName(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getLocation method, of class DatabaseConnection.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        String Storename = "";
        String expResult = "No location found";
        String result = getLocation(Storename);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOpenings method, of class DatabaseConnection.
     */
    @Test
    public void testGetOpenings() {
        System.out.println("getOpenings");
        String centerName = "";
        String Storename = "";
        String expResult = "No opening hours found";
        String result = getOpenings(centerName, Storename);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of RegisterCustomerQuestion method, of class DatabaseConnection.
     */
    @Test
    public void testRegisterCustomerQuestion() {
        System.out.println("RegisterCustomerQuestion");
        String center = "DummyCenter";
        String subject = "";
        String question = "";
        boolean expResult = false;
        boolean result = RegisterCustomerQuestion(center, subject, question);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHighestCustomerCaseIndex method, of class DatabaseConnection.
     */
    @Test
    public void testGetHighestCustomerCaseIndex() {
        System.out.println("getHighestCustomerCaseIndex");
        int expResult = -1;
        int result = getHighestCustomerCaseIndex();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of checkUsername method, of class DatabaseConnection.
     */
    @Test
    public void testCheckUsername() throws Exception {
        System.out.println("checkUsername");
        String userName = "";
        boolean expResult = false;
        boolean result = checkUsername(userName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of regNewCenterUser method, of class DatabaseConnection.
     */
    @Test
    public void testRegNewCenterUser() {
        System.out.println("regNewCenterUser");
        String userName = "";
        String telephone = "";
        char[] password = null;
        String centerName = "";
        String realName = "";
        String mail = "";
        int userLevel = 0;
        String title = "";
        int expResult = 0;
        int result = regNewCenterUser(userName, telephone, password, centerName, realName, mail, userLevel, title);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkLogIn method, of class DatabaseConnection.
     */
    @Test
    public void testCheckLogIn() {
        System.out.println("checkLogIn");
        String username = "";
        String password = "";
        int expResult = 0;
        int result = checkLogIn(username, password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of customerServiceGetTitle method, of class DatabaseConnection.
     */
    @Test
    public void testCustomerServiceGetTitle() {
        System.out.println("customerServiceGetTitle");
        String title = "";
        String center_name = "";
        char solved = ' ';
        ArrayList<String> expResult = null;
        ArrayList<String> result = customerServiceGetTitle(title, center_name, solved);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomerAnswer method, of class DatabaseConnection.
     */
    @Test
    public void testGetCustomerAnswer() {
        System.out.println("getCustomerAnswer");
        int caseID = 0;
        String expResult = "";
        String result = getCustomerAnswer(caseID);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCenter method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        String username = "";
        String expResult = "";
        String result = getCenter(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNoOfShops method, of class DatabaseConnection.
     */
    @Test
    public void testGetNoOfShops() {
        System.out.println("getNoOfShops");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getNoOfShops(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSQM method, of class DatabaseConnection.
     */
    @Test
    public void testGetSQM() {
        System.out.println("getSQM");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getSQM(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCenterTelephone method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterTelephone() {
        System.out.println("getCenterTelephone");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getCenterTelephone(centername);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCenterMail method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterMail() {
        System.out.println("getCenterMail");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getCenterMail(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCenterParking method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterParking() {
        System.out.println("getCenterParking");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getCenterParking(centername);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getCenterDescription method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterDescription() {
        System.out.println("getCenterDescription");
        String centername = "DummyCenter";
        String expResult = "";
        String result = getCenterDescription(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomerCaseID method, of class DatabaseConnection.
     */
    @Test
    public void testGetCustomerCaseID() {
        System.out.println("getCustomerCaseID");
        String title = "";
        String center_name = "DummyCenter";
        char solved = ' ';
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = getCustomerCaseID(title, center_name, solved);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescription method, of class DatabaseConnection.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        int caseID = 0;
        String expResult = "";
        String result = getDescription(caseID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAnswer method, of class DatabaseConnection.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String answer = "";
        int caseID = 0;
        int expResult = 0;
        int result = setAnswer(answer, caseID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteCustomerCase method, of class DatabaseConnection.
     */
    @Test
    public void testDeleteCustomerCase() {
        System.out.println("deleteCustomerCase");
        int caseID = 0;
        int expResult = 0;
        int result = deleteCustomerCase(caseID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEmail method, of class DatabaseConnection.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String username = "";
        String expResult = "";
        String result = getEmail(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPhoneNumber method, of class DatabaseConnection.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        String username = "";
        String expResult = "";
        String result = getPhoneNumber(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEmail method, of class DatabaseConnection.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "TestMailen";
        String username = "Admin";
        int expResult = 1;
        int result = setEmail(email, username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPhoneNumber method, of class DatabaseConnection.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        String username = "";
        int expResult = 0;
        int result = setPhoneNumber(phoneNumber, username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCenterMail method, of class DatabaseConnection.
     */
    @Test
    public void testSetCenterMail() {
        System.out.println("setCenterMail");
        String newMail = "";
        String centerName = "";
        int expResult = 0;
        int result = setCenterMail(newMail, centerName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCenterPhoneNumber method, of class DatabaseConnection.
     */
    @Test
    public void testSetCenterPhoneNumber() {
        System.out.println("setCenterPhoneNumber");
        String newPhoneNumber = "";
        String centerName = "";
        int expResult = 0;
        int result = setCenterPhoneNumber(newPhoneNumber, centerName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopName method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopName() {
        System.out.println("getShopName");
        String username = "";
        String expResult = "";
        String result = getShopName(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopTrade method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopTrade() {
        System.out.println("getShopTrade");
        String username = "";
        String expResult = "";
        String result = getShopTrade(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopLocation method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopLocation() {
        System.out.println("getShopLocation");
        String username = "";
        String expResult = "";
        String result = getShopLocation(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopFloor method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopFloor() {
        System.out.println("getShopFloor");
        String username = "";
        String expResult = "";
        String result = getShopFloor(username);
        assertEquals(expResult, result);
        
       
    }

    /**
     * Test of getShopOpeningHrs method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopOpeningHrs() {
        System.out.println("getShopOpeningHrs");
        String username = "";
        String expResult = "";
        String result = getShopOpeningHrs(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopOpeningHrsWeekends method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopOpeningHrsWeekends() {
        System.out.println("getShopOpeningHrsWeekends");
        String username = "";
        String expResult = "";
        String result = getShopOpeningHrsWeekends(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getShopTurnover method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopTurnover() {
        System.out.println("getShopTurnover");
        String username = "";
        String expResult = "";
        String result = getShopTurnover(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getShopDescription method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopDescription_String_String() {
        System.out.println("getShopDescription");
        String centerName = "DummyCenter";
        String storeName = "DummyStore";
        String expResult = "";
        String result = getShopDescription(centerName, storeName);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStoreName method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreName() {
        System.out.println("setStoreName");
        String username = "";
        String newStoreName = "";
        int expResult = 0;
        int result = setStoreName(username, newStoreName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStoreLocation method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreLocation() {
        System.out.println("setStoreLocation");
        String username = "";
        String newStoreLocation = "";

        int expResult = 0;
        int result = setStoreLocation(username, newStoreLocation);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStoreFloor method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreFloor() {
        System.out.println("setStoreFloor");
        String username = "";
        int newFloor = 0;

        int expResult = 0;
        int result = setStoreFloor(username, newFloor);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStoreOpeningHrs method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreOpeningHrs() {
        System.out.println("setStoreOpeningHrs");
        String username = "";
        String newOpeningHrs = "";
        int expResult = 0;
        int result = setStoreOpeningHrs(username, newOpeningHrs);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStoreOpeningHrsWeekends method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreOpeningHrsWeekends() {
        System.out.println("setStoreOpeningHrsWeekends");
        String username = "";
        String newOpeningHrsWeekends = "";
        int expResult = 0;
        int result = setStoreOpeningHrsWeekends(username, newOpeningHrsWeekends);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTrades method, of class DatabaseConnection.
     */
    @Test
    public void testGetTrades() {
        System.out.println("getTrades");
        ArrayList<String> expResult = null;
        ArrayList<String> result = getTrades();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCenterFromTrade method, of class DatabaseConnection.
     */
    @Test
    public void testGetCenterFromTrade() {
        System.out.println("getCenterFromTrade");
        String trade = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getCenterFromTrade(trade);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTradeDescription method, of class DatabaseConnection.
     */
    @Test
    public void testGetTradeDescription() {
        System.out.println("getTradeDescription");
        String trade = "";
        String expResult = "";
        String result = getTradeDescription(trade);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setTrade method, of class DatabaseConnection.
     */
    @Test
    public void testSetTrade() {
        System.out.println("setTrade");
        String username = "";
        String trade = "";
        int expResult = 0;
        int result = setTrade(username, trade);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getShopDescription method, of class DatabaseConnection.
     */
    @Test
    public void testGetShopDescription_String() {
        System.out.println("getShopDescription");
        String username = "";
        String expResult = "";
        String result = getShopDescription(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStoreDescription method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreDescription() {
        System.out.println("setStoreDescription");
        String username = "";
        String description = "";
        int expResult = 0;
        int result = setStoreDescription(username, description);
        assertEquals(expResult, result);
        
    }




    /**
     * Test of setCenterSqm method, of class DatabaseConnection.
     */
    @Test
    public void testSetCenterSqm() {
        System.out.println("setCenterSqm");
        String newSqm = "";
        String centerName = "DummyCenter";
        int expResult = 0;
        int result = setCenterSqm(newSqm, centerName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCenterCarPark method, of class DatabaseConnection.
     */
    @Test
    public void testSetCenterCarPark() {
        System.out.println("setCenterCarPark");
        char carPark = ' ';
        String centerName = "DumyCenter";
        int expResult = 0;
        int result = setCenterCarPark(carPark, centerName);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCenterDescription method, of class DatabaseConnection.
     */
    @Test
    public void testSetCenterDescription() {
        System.out.println("setCenterDescription");
        String newDescription = "";
        String centerName = "DummyCenter";
        int expResult = 0;
        int result = setCenterDescription(newDescription, centerName);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getUsers method, of class DatabaseConnection.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        ArrayList<String> expResult = null;
        ArrayList<String> result = getUsers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUserAccess method, of class DatabaseConnection.
     */
    @Test
    public void testGetUserAccess() {
        System.out.println("getUserAccess");
        String username = "";
        int expResult = -1;
        int result = getUserAccess(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUserActiv method, of class DatabaseConnection.
     */
    @Test
    public void testGetUserActiv() {
        System.out.println("getUserActiv");
        String username = "";
        String expResult = "";
        String result = getUserActiv(username);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getUserTitle method, of class DatabaseConnection.
     */
    @Test
    public void testGetUserTitle() {
        System.out.println("getUserTitle");
        String username = "";
        String expResult = "";
        String result = getUserTitle(username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserActiv method, of class DatabaseConnection.
     */
    @Test
    public void testSetUserActiv() {
        System.out.println("setUserActiv");
        String activ = "";
        String username = "";
        int expResult = 0;
        int result = setUserActiv(activ, username);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStoreUsername method, of class DatabaseConnection.
     */
    @Test
    public void testGetStoreUsername() {
        System.out.println("getStoreUsername");
        String centerName = "";
        String storename = "";
        String expResult = "";
        String result = getStoreUsername(centerName, storename);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNewPassword method, of class DatabaseConnection.
     */
    @Test
    public void testSetNewPassword() {
        System.out.println("setNewPassword");
        String username = "";
        String newPassword = "";
        int expResult = 0;
        int result = setNewPassword(username, newPassword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getUsersCenterManager method, of class DatabaseConnection.
     */
    @Test
    public void testGetUsersCenterManager() {
        System.out.println("getUsersCenterManager");
        String centername = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getUsersCenterManager(centername);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getStoresWithoutUser method, of class DatabaseConnection.
     */
    @Test
    public void testGetStoresWithoutUser() {
        System.out.println("getStoresWithoutUser");
        String centername = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getStoresWithoutUser(centername);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getUsersWithoutStore method, of class DatabaseConnection.
     */
    @Test
    public void testGetUsersWithoutStore() {
        System.out.println("getUsersWithoutStore");
        String centername = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getUsersWithoutStore(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getUsersNotActiv method, of class DatabaseConnection.
     */
    @Test
    public void testGetUsersNotActiv() {
        System.out.println("getUsersNotActiv");
        String centername = "DummyCenter";
        ArrayList<String> expResult = null;
        ArrayList<String> result = getUsersNotActiv(centername);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStoreUser method, of class DatabaseConnection.
     */
    @Test
    public void testSetStoreUser() {
        System.out.println("setStoreUser");
        String username = "";
        String storename = "DummyStore";
        String centername = "DummyCenter";
        int expResult = 0;
        int result = setStoreUser(username, storename, centername);
        assertEquals(expResult, result);
        
    }
    
}

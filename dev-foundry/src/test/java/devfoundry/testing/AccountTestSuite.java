package devfoundry.testing;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;


class AccountTestSuite {

    @Test
    void newlyCreatedAccountShouldNotBeActive() {
        //given
        Account newAccount = new Account();
        //then
        assertFalse(newAccount.isActive());
        assertThat(newAccount.isActive(), equalTo(false));
        assertThat(newAccount.isActive(), is(false));

    }

    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddressSet(){
        //given
        Account account = new Account();

        //when
        Address address = account.getDefaultDeliveryAddress();

        //then
        assertNull(address);
        assertThat(address, nullValue());
    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet(){
        //given
        Address address = new Address("Krakowska", "67c");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address);
     //or bez tworzenia oddzielnego obiektu:    account.setDefaultDeliveryAddress(new Address("bbb", "125"));

        //when
        Address defaultAddress = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(defaultAddress);
        assertThat(defaultAddress, is(notNullValue()));

    }


@RepeatedTest(4)
    void newAccountWithNotNullAddressShouldBeActive(){
        //given
    Address address = new Address("Pulawska", "46/6");

    //when
    Account account = new Account(address);

    //then
    assumingThat(address != null, ()-> {
        assertTrue(account.isActive());
    });
}
}
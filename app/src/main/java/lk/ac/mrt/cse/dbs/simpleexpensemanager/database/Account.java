package lk.ac.mrt.cse.dbs.simpleexpensemanager.database;

import android.provider.BaseColumns;

public final class Account{
    /* Inner class that defines the table contents */
    public class AccountEntry implements BaseColumns {
        public static final String TABLE_NAME = "account";
        public static final String ACCOUNT_NO = "accountno";
        public static final String EXPENSE_TYPE = "type";
        public static final String AMOUNT = "amount";
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + AccountEntry.TABLE_NAME + " (" +
                    AccountEntry._ID + " INTEGER PRIMARY KEY," +
                    AccountEntry.ACCOUNT_NO + " TEXT," +
                    AccountEntry.EXPENSE_TYPE + " TEXT ," +
                    AccountEntry.AMOUNT + " REAL)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + AccountEntry.TABLE_NAME;

}
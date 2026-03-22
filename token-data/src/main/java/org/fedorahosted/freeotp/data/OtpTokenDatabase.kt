package org.fedorahosted.freeotp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import org.fedorahosted.freeotp.data.util.Converters

@Database(entities = [OtpToken::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class OtpTokenDatabase : RoomDatabase() {
    abstract fun otpTokenDao(): OtpTokenDao
}
package company.project.gather.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/*Room Database*/

@Database(entities = arrayOf(Schedule::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    val DATABASE_NAME = "GatherApp.db"

    private fun buildDatabase(context: Context) : AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
    }
}
package seedu.address.commons.events.model;

import seedu.address.commons.events.BaseEvent;
import seedu.address.model.ReadOnlyAddressBook;

import java.nio.file.Path;

/** Indicates the AddressBook in the model has changed*/
public class AddressBookLocalBackupEvent extends BaseEvent {

    public final ReadOnlyAddressBook data;
    public final Path filePath;

    public AddressBookLocalBackupEvent(ReadOnlyAddressBook data, Path filePath) {
        this.data = data;
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Creating local backup at " + filePath.toString();
    }
}

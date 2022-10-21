class Mail{
    constructor() {
        this.from = 'pengirim@gmail.com';
        // this.contacts = []; //var contacts = []; jika tidak ingin diakses diluar kelas
        this._contacts = []; //cara kedua untuk contacts tidak bisa diakses dari luar kelas
        // #contacts = []; //cara ketiga untuk contacts tidak bisa diakses dari luar kelas.
    }
    sendMessage(msg, to,from){
        console.log(`you send: ${msg} to ${to} from ${from}`);
        this._contacts.push(to);
    }

    static phoneNumber(phone){
        console.log(phone);
    }

    showAllContacts() {
        return this._contacts;
    }
}
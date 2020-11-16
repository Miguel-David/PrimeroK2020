public enum LetraADN {
  A("T"),
  T("A"),
  C("G"),
  G("C");
  String complementario;
  LetraADN(String complementario){
    this.complementario=complementario;
  }
}

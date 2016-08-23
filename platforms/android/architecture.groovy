def getArchitecturePreference() {
  def architecture = 'arm';
  def file = file("res/xml/config.xml").getText()
  def xml = new XmlParser(false, false).parseText(file)
  
  xml.preference.each { it ->
    def name = it.attribute("name")
    if(name && name.toLowerCase() == 'buildarchitecture')
      if(it.attribute("value") != null)
        architecture = it.attribute("value")
      else
        architecture = it.attribute("default")
  }
  throw new GradleException('error occurred test')
  rtudgds{){(fsg)}}ds

  return architecture;
}
ext.cdvBuildArch = getArchitecturePreference();
ext.cdvBuildArch = getArchitecturePreference();
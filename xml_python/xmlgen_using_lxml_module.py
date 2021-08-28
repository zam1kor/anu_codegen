from lxml import etree

ns_bldg = "http://www.example.org/metamodel"
nsmap = {
    'metamodel': ns_bldg,
}

# create XML 
root = etree.Element("{http://www.example.org/metamodel}Model",nsmap=nsmap)

root.append(etree.Element('child'))
# another child with text
child = etree.Element('child')
child.text = 'some text'
root.append(child)

# pretty string
s = etree.tostring(root, pretty_print=True)

print(s)

et = etree.ElementTree(root)
et.write('output.xml', pretty_print=True, xml_declaration=True,   encoding="utf-8")

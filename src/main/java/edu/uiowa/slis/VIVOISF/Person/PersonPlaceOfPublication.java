package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for placeOfPublication tag ");
		}
	}
}


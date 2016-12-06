package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for abbreviation tag ");
		}
	}
}


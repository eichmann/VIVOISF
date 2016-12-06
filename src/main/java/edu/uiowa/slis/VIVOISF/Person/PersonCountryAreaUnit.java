package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCountryAreaUnitIterator thePerson = (PersonCountryAreaUnitIterator)findAncestorWithClass(this, PersonCountryAreaUnitIterator.class);
			pageContext.getOut().print(thePerson.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


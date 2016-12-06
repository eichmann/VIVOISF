package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCountryAreaYearIterator thePerson = (PersonCountryAreaYearIterator)findAncestorWithClass(this, PersonCountryAreaYearIterator.class);
			pageContext.getOut().print(thePerson.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}


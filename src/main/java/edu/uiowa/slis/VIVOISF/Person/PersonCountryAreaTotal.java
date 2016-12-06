package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCountryAreaTotalIterator thePerson = (PersonCountryAreaTotalIterator)findAncestorWithClass(this, PersonCountryAreaTotalIterator.class);
			pageContext.getOut().print(thePerson.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


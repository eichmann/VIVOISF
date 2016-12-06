package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLandAreaYearIterator thePerson = (PersonLandAreaYearIterator)findAncestorWithClass(this, PersonLandAreaYearIterator.class);
			pageContext.getOut().print(thePerson.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}


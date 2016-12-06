package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHasMinLongitudeIterator thePerson = (PersonHasMinLongitudeIterator)findAncestorWithClass(this, PersonHasMinLongitudeIterator.class);
			pageContext.getOut().print(thePerson.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}


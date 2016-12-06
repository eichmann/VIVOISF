package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHasMaxLongitudeIterator thePerson = (PersonHasMaxLongitudeIterator)findAncestorWithClass(this, PersonHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thePerson.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}


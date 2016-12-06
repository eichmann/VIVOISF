package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHasMaxLatitudeIterator thePerson = (PersonHasMaxLatitudeIterator)findAncestorWithClass(this, PersonHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thePerson.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}


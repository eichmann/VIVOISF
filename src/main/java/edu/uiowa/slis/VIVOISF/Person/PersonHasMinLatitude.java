package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHasMinLatitudeIterator thePerson = (PersonHasMinLatitudeIterator)findAncestorWithClass(this, PersonHasMinLatitudeIterator.class);
			pageContext.getOut().print(thePerson.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}


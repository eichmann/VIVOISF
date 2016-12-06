package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLandAreaTotalIterator thePerson = (PersonLandAreaTotalIterator)findAncestorWithClass(this, PersonLandAreaTotalIterator.class);
			pageContext.getOut().print(thePerson.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


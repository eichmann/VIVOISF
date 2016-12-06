package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLandAreaUnitIterator thePerson = (PersonLandAreaUnitIterator)findAncestorWithClass(this, PersonLandAreaUnitIterator.class);
			pageContext.getOut().print(thePerson.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


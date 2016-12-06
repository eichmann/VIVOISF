package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonGDPUnitIterator thePerson = (PersonGDPUnitIterator)findAncestorWithClass(this, PersonGDPUnitIterator.class);
			pageContext.getOut().print(thePerson.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHDITotalIterator thePerson = (PersonHDITotalIterator)findAncestorWithClass(this, PersonHDITotalIterator.class);
			pageContext.getOut().print(thePerson.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}


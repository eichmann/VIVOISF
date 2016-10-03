package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonDirectorInverseIterator thePersonDirectorInverseIterator = (PersonDirectorInverseIterator)findAncestorWithClass(this, PersonDirectorInverseIterator.class);
			pageContext.getOut().print(thePersonDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for director tag ");
		}
		return SKIP_BODY;
	}
}


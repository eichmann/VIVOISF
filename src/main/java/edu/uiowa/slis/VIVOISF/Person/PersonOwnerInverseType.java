package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonOwnerInverseIterator thePersonOwnerInverseIterator = (PersonOwnerInverseIterator)findAncestorWithClass(this, PersonOwnerInverseIterator.class);
			pageContext.getOut().print(thePersonOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for owner tag ");
		}
		return SKIP_BODY;
	}
}


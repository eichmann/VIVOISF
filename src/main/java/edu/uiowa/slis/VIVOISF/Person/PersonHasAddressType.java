package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasAddressIterator thePersonHasAddressIterator = (PersonHasAddressIterator)findAncestorWithClass(this, PersonHasAddressIterator.class);
			pageContext.getOut().print(thePersonHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}


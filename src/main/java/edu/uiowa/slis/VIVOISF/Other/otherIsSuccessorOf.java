package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(otherIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherIsSuccessorOfIterator theotherIsSuccessorOfIterator = (otherIsSuccessorOfIterator)findAncestorWithClass(this, otherIsSuccessorOfIterator.class);
			pageContext.getOut().print(theotherIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing other for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}


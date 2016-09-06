package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherIsSuccessorOfIterator theotherIsSuccessorOfIterator = (otherIsSuccessorOfIterator)findAncestorWithClass(this, otherIsSuccessorOfIterator.class);
			pageContext.getOut().print(theotherIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}


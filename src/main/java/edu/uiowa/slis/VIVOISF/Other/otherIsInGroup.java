package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherIsInGroup extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherIsInGroup currentInstance = null;
	private static final Log log = LogFactory.getLog(otherIsInGroup.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherIsInGroupIterator theotherIsInGroupIterator = (otherIsInGroupIterator)findAncestorWithClass(this, otherIsInGroupIterator.class);
			pageContext.getOut().print(theotherIsInGroupIterator.getIsInGroup());
		} catch (Exception e) {
			log.error("Can't find enclosing other for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}


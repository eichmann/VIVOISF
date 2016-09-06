package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherIsInGroupType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherIsInGroupType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherIsInGroupType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherIsInGroupIterator theotherIsInGroupIterator = (otherIsInGroupIterator)findAncestorWithClass(this, otherIsInGroupIterator.class);
			pageContext.getOut().print(theotherIsInGroupIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}


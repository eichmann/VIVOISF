package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasBorderWith extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasBorderWith currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasBorderWith.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherHasBorderWithIterator theotherHasBorderWithIterator = (otherHasBorderWithIterator)findAncestorWithClass(this, otherHasBorderWithIterator.class);
			pageContext.getOut().print(theotherHasBorderWithIterator.getHasBorderWith());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}


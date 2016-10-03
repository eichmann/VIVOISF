package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedHasBorderWith extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedHasBorderWith currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedHasBorderWith.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedHasBorderWithIterator thedisputedHasBorderWithIterator = (disputedHasBorderWithIterator)findAncestorWithClass(this, disputedHasBorderWithIterator.class);
			pageContext.getOut().print(thedisputedHasBorderWithIterator.getHasBorderWith());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}


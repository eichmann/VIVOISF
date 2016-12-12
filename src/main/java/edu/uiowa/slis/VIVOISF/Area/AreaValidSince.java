package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaValidSinceIterator theArea = (AreaValidSinceIterator)findAncestorWithClass(this, AreaValidSinceIterator.class);
			pageContext.getOut().print(theArea.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for validSince tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameListESIterator theother = (otherNameListESIterator)findAncestorWithClass(this, otherNameListESIterator.class);
			pageContext.getOut().print(theother.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameListES tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(otherNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherNameShortESIterator theother = (otherNameShortESIterator)findAncestorWithClass(this, otherNameShortESIterator.class);
			pageContext.getOut().print(theother.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing other for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}


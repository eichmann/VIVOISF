package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(otherHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherHasCodeIterator theother = (otherHasCodeIterator)findAncestorWithClass(this, otherHasCodeIterator.class);
			pageContext.getOut().print(theother.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing other for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for hasCode tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherSameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(otherSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherSameAsIterator theother = (otherSameAsIterator)findAncestorWithClass(this, otherSameAsIterator.class);
			pageContext.getOut().print(theother.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing other for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for sameAs tag ");
		}
		return SKIP_BODY;
	}
}


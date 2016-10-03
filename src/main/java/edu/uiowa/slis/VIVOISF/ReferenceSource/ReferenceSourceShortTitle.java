package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceShortTitleIterator theReferenceSource = (ReferenceSourceShortTitleIterator)findAncestorWithClass(this, ReferenceSourceShortTitleIterator.class);
			pageContext.getOut().print(theReferenceSource.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}


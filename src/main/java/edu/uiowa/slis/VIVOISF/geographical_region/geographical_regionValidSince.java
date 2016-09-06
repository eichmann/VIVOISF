package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionValidSinceIterator thegeographical_region = (geographical_regionValidSinceIterator)findAncestorWithClass(this, geographical_regionValidSinceIterator.class);
			pageContext.getOut().print(thegeographical_region.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for validSince tag ");
		}
		return SKIP_BODY;
	}
}


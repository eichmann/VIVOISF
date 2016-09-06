package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionValidUntilIterator thegeographical_region = (geographical_regionValidUntilIterator)findAncestorWithClass(this, geographical_regionValidUntilIterator.class);
			pageContext.getOut().print(thegeographical_region.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for validUntil tag ");
		}
		return SKIP_BODY;
	}
}


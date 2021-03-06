package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionValidSinceIterator theGeographical_region = (Geographical_regionValidSinceIterator)findAncestorWithClass(this, Geographical_regionValidSinceIterator.class);
			pageContext.getOut().print(theGeographical_region.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for validSince tag ");
		}
		return SKIP_BODY;
	}
}


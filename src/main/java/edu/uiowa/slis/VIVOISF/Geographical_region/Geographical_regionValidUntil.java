package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionValidUntilIterator theGeographical_region = (Geographical_regionValidUntilIterator)findAncestorWithClass(this, Geographical_regionValidUntilIterator.class);
			pageContext.getOut().print(theGeographical_region.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for validUntil tag ");
		}
		return SKIP_BODY;
	}
}


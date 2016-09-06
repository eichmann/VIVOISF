package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefReproducesIterator theBriefReproducesIterator = (BriefReproducesIterator)findAncestorWithClass(this, BriefReproducesIterator.class);
			pageContext.getOut().print(theBriefReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefReproducedInIterator theBriefReproducedInIterator = (BriefReproducedInIterator)findAncestorWithClass(this, BriefReproducedInIterator.class);
			pageContext.getOut().print(theBriefReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


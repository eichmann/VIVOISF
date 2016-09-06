package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefReproducesIterator theBriefReproducesIterator = (BriefReproducesIterator)findAncestorWithClass(this, BriefReproducesIterator.class);
			pageContext.getOut().print(theBriefReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


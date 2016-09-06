package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteReproducesIterator theStatuteReproducesIterator = (StatuteReproducesIterator)findAncestorWithClass(this, StatuteReproducesIterator.class);
			pageContext.getOut().print(theStatuteReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


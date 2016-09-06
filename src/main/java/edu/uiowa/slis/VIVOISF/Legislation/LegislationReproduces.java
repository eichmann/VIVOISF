package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationReproducesIterator theLegislationReproducesIterator = (LegislationReproducesIterator)findAncestorWithClass(this, LegislationReproducesIterator.class);
			pageContext.getOut().print(theLegislationReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsReproducesIterator theProceedingsReproducesIterator = (ProceedingsReproducesIterator)findAncestorWithClass(this, ProceedingsReproducesIterator.class);
			pageContext.getOut().print(theProceedingsReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


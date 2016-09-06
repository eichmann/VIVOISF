package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Reproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Reproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Reproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ReproducesIterator theOBI_0000272ReproducesIterator = (OBI_0000272ReproducesIterator)findAncestorWithClass(this, OBI_0000272ReproducesIterator.class);
			pageContext.getOut().print(theOBI_0000272ReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


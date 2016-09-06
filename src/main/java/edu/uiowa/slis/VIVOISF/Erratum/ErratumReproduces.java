package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumReproducesIterator theErratumReproducesIterator = (ErratumReproducesIterator)findAncestorWithClass(this, ErratumReproducesIterator.class);
			pageContext.getOut().print(theErratumReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


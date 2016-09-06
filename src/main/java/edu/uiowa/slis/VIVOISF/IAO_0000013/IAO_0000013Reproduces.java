package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013Reproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013Reproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013Reproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013ReproducesIterator theIAO_0000013ReproducesIterator = (IAO_0000013ReproducesIterator)findAncestorWithClass(this, IAO_0000013ReproducesIterator.class);
			pageContext.getOut().print(theIAO_0000013ReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272ReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272ReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272ReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272ReproducedInIterator theOBI_0000272ReproducedInIterator = (OBI_0000272ReproducedInIterator)findAncestorWithClass(this, OBI_0000272ReproducedInIterator.class);
			pageContext.getOut().print(theOBI_0000272ReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


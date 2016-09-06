package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumReproducedInIterator theErratumReproducedInIterator = (ErratumReproducedInIterator)findAncestorWithClass(this, ErratumReproducedInIterator.class);
			pageContext.getOut().print(theErratumReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


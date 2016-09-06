package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsReproducedInIterator theProceedingsReproducedInIterator = (ProceedingsReproducedInIterator)findAncestorWithClass(this, ProceedingsReproducedInIterator.class);
			pageContext.getOut().print(theProceedingsReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


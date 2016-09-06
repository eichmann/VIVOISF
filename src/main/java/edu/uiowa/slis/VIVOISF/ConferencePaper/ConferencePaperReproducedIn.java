package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperReproducedInIterator theConferencePaperReproducedInIterator = (ConferencePaperReproducedInIterator)findAncestorWithClass(this, ConferencePaperReproducedInIterator.class);
			pageContext.getOut().print(theConferencePaperReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


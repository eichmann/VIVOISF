package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentReproducedInIterator theCollectedDocumentReproducedInIterator = (CollectedDocumentReproducedInIterator)findAncestorWithClass(this, CollectedDocumentReproducedInIterator.class);
			pageContext.getOut().print(theCollectedDocumentReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


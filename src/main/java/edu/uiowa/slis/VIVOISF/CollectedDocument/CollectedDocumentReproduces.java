package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentReproducesIterator theCollectedDocumentReproducesIterator = (CollectedDocumentReproducesIterator)findAncestorWithClass(this, CollectedDocumentReproducesIterator.class);
			pageContext.getOut().print(theCollectedDocumentReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for reproduces tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentReproducedInIterator theCollectedDocumentReproducedInIterator = (CollectedDocumentReproducedInIterator)findAncestorWithClass(this, CollectedDocumentReproducedInIterator.class);
			pageContext.getOut().print(theCollectedDocumentReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}


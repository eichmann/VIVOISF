package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentCitedByIterator theCollectedDocumentCitedByIterator = (CollectedDocumentCitedByIterator)findAncestorWithClass(this, CollectedDocumentCitedByIterator.class);
			pageContext.getOut().print(theCollectedDocumentCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}


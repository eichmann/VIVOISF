package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentCites currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentCitesIterator theCollectedDocumentCitesIterator = (CollectedDocumentCitesIterator)findAncestorWithClass(this, CollectedDocumentCitesIterator.class);
			pageContext.getOut().print(theCollectedDocumentCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for cites tag ");
		}
		return SKIP_BODY;
	}
}


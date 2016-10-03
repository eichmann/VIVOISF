package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentEditionIterator theCollectedDocument = (CollectedDocumentEditionIterator)findAncestorWithClass(this, CollectedDocumentEditionIterator.class);
			pageContext.getOut().print(theCollectedDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}


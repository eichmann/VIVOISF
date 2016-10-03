package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentNumberIterator theCollectedDocument = (CollectedDocumentNumberIterator)findAncestorWithClass(this, CollectedDocumentNumberIterator.class);
			pageContext.getOut().print(theCollectedDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for number tag ");
		}
		return SKIP_BODY;
	}
}


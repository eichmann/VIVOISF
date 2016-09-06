package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentDoiIterator theCollectedDocument = (CollectedDocumentDoiIterator)findAncestorWithClass(this, CollectedDocumentDoiIterator.class);
			pageContext.getOut().print(theCollectedDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}


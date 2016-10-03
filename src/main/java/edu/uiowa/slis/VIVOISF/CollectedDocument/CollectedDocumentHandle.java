package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentHandleIterator theCollectedDocument = (CollectedDocumentHandleIterator)findAncestorWithClass(this, CollectedDocumentHandleIterator.class);
			pageContext.getOut().print(theCollectedDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for handle tag ");
		}
		return SKIP_BODY;
	}
}


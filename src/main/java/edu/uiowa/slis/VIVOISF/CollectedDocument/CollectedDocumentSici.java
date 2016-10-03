package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentSiciIterator theCollectedDocument = (CollectedDocumentSiciIterator)findAncestorWithClass(this, CollectedDocumentSiciIterator.class);
			pageContext.getOut().print(theCollectedDocument.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for sici tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentStatusIterator theCollectedDocumentStatusIterator = (CollectedDocumentStatusIterator)findAncestorWithClass(this, CollectedDocumentStatusIterator.class);
			pageContext.getOut().print(theCollectedDocumentStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for status tag ");
		}
		return SKIP_BODY;
	}
}


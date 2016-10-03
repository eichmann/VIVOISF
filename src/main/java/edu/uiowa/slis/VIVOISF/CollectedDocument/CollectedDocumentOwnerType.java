package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentOwnerIterator theCollectedDocumentOwnerIterator = (CollectedDocumentOwnerIterator)findAncestorWithClass(this, CollectedDocumentOwnerIterator.class);
			pageContext.getOut().print(theCollectedDocumentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}


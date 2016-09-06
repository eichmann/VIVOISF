package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentDocumentationForIterator theCollectedDocumentDocumentationForIterator = (CollectedDocumentDocumentationForIterator)findAncestorWithClass(this, CollectedDocumentDocumentationForIterator.class);
			pageContext.getOut().print(theCollectedDocumentDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


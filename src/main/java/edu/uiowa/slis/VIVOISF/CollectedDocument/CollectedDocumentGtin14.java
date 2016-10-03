package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentGtin14Iterator theCollectedDocument = (CollectedDocumentGtin14Iterator)findAncestorWithClass(this, CollectedDocumentGtin14Iterator.class);
			pageContext.getOut().print(theCollectedDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}


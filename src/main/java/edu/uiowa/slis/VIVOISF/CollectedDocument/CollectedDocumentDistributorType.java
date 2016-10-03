package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentDistributorIterator theCollectedDocumentDistributorIterator = (CollectedDocumentDistributorIterator)findAncestorWithClass(this, CollectedDocumentDistributorIterator.class);
			pageContext.getOut().print(theCollectedDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}


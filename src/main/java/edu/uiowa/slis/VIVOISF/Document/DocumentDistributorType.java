package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentDistributorIterator theDocumentDistributorIterator = (DocumentDistributorIterator)findAncestorWithClass(this, DocumentDistributorIterator.class);
			pageContext.getOut().print(theDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for distributor tag ");
		}
		return SKIP_BODY;
	}
}


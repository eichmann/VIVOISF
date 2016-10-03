package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDistributorIterator theDocumentPartDistributorIterator = (DocumentPartDistributorIterator)findAncestorWithClass(this, DocumentPartDistributorIterator.class);
			pageContext.getOut().print(theDocumentPartDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for distributor tag ");
		}
		return SKIP_BODY;
	}
}


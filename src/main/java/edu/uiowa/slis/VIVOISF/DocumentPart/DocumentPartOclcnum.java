package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartOclcnumIterator theDocumentPart = (DocumentPartOclcnumIterator)findAncestorWithClass(this, DocumentPartOclcnumIterator.class);
			pageContext.getOut().print(theDocumentPart.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}


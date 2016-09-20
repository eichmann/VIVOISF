package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusStatusInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusStatusInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusStatusInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentStatusStatusInverseIterator theDocumentStatusStatusInverseIterator = (DocumentStatusStatusInverseIterator)findAncestorWithClass(this, DocumentStatusStatusInverseIterator.class);
			pageContext.getOut().print(theDocumentStatusStatusInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for status tag ");
		}
		return SKIP_BODY;
	}
}


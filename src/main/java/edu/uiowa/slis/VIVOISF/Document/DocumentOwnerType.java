package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentOwnerIterator theDocumentOwnerIterator = (DocumentOwnerIterator)findAncestorWithClass(this, DocumentOwnerIterator.class);
			pageContext.getOut().print(theDocumentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for owner tag ");
		}
		return SKIP_BODY;
	}
}


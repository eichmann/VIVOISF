package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasURLIterator theDocumentHasURLIterator = (DocumentHasURLIterator)findAncestorWithClass(this, DocumentHasURLIterator.class);
			pageContext.getOut().print(theDocumentHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasURL tag ");
		}
		return SKIP_BODY;
	}
}


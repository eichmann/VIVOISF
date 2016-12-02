package edu.uiowa.slis.VIVOISF.DocumentStatus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentStatusIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentStatusIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentStatusIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentStatusIAO_0000115Iterator theDocumentStatus = (DocumentStatusIAO_0000115Iterator)findAncestorWithClass(this, DocumentStatusIAO_0000115Iterator.class);
			pageContext.getOut().print(theDocumentStatus.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentStatus for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentStatus for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}


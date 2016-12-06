package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRO_0001015Iterator theDocumentRO_0001015Iterator = (DocumentRO_0001015Iterator)findAncestorWithClass(this, DocumentRO_0001015Iterator.class);
			pageContext.getOut().print(theDocumentRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentRO_0000056Iterator theDocumentRO_0000056Iterator = (DocumentRO_0000056Iterator)findAncestorWithClass(this, DocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theDocumentRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}


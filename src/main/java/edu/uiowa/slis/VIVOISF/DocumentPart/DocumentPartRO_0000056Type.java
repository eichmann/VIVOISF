package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRO_0000056Iterator theDocumentPartRO_0000056Iterator = (DocumentPartRO_0000056Iterator)findAncestorWithClass(this, DocumentPartRO_0000056Iterator.class);
			pageContext.getOut().print(theDocumentPartRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}


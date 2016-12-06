package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRO_0001015Iterator theDocumentPartRO_0001015Iterator = (DocumentPartRO_0001015Iterator)findAncestorWithClass(this, DocumentPartRO_0001015Iterator.class);
			pageContext.getOut().print(theDocumentPartRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}


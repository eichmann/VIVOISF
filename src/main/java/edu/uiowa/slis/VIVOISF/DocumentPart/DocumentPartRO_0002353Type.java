package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRO_0002353Iterator theDocumentPartRO_0002353Iterator = (DocumentPartRO_0002353Iterator)findAncestorWithClass(this, DocumentPartRO_0002353Iterator.class);
			pageContext.getOut().print(theDocumentPartRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeISO2Iterator theDocumentPart = (DocumentPartCodeISO2Iterator)findAncestorWithClass(this, DocumentPartCodeISO2Iterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}


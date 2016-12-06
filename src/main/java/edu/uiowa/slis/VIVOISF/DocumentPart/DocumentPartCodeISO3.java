package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeISO3Iterator theDocumentPart = (DocumentPartCodeISO3Iterator)findAncestorWithClass(this, DocumentPartCodeISO3Iterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}


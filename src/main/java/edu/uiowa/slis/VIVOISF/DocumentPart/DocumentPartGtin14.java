package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGtin14Iterator theDocumentPart = (DocumentPartGtin14Iterator)findAncestorWithClass(this, DocumentPartGtin14Iterator.class);
			pageContext.getOut().print(theDocumentPart.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}


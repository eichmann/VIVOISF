package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeUNDPIterator theDocumentPart = (DocumentPartCodeUNDPIterator)findAncestorWithClass(this, DocumentPartCodeUNDPIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}


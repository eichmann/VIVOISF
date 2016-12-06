package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeFAOSTATIterator theDocumentPart = (DocumentPartCodeFAOSTATIterator)findAncestorWithClass(this, DocumentPartCodeFAOSTATIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


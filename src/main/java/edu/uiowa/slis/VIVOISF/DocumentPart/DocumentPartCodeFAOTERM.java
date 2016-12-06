package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartCodeFAOTERMIterator theDocumentPart = (DocumentPartCodeFAOTERMIterator)findAncestorWithClass(this, DocumentPartCodeFAOTERMIterator.class);
			pageContext.getOut().print(theDocumentPart.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


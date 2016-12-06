package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListITIterator theDocumentPart = (DocumentPartNameListITIterator)findAncestorWithClass(this, DocumentPartNameListITIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}


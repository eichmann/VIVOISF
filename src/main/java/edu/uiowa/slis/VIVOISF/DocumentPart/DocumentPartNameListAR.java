package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListARIterator theDocumentPart = (DocumentPartNameListARIterator)findAncestorWithClass(this, DocumentPartNameListARIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}


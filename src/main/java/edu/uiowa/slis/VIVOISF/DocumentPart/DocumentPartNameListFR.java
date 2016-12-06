package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameListFRIterator theDocumentPart = (DocumentPartNameListFRIterator)findAncestorWithClass(this, DocumentPartNameListFRIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}


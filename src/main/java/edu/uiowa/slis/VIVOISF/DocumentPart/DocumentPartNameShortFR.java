package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortFRIterator theDocumentPart = (DocumentPartNameShortFRIterator)findAncestorWithClass(this, DocumentPartNameShortFRIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}


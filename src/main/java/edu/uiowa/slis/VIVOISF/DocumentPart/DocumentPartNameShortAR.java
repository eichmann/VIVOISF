package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortARIterator theDocumentPart = (DocumentPartNameShortARIterator)findAncestorWithClass(this, DocumentPartNameShortARIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortZHIterator theDocumentPart = (DocumentPartNameShortZHIterator)findAncestorWithClass(this, DocumentPartNameShortZHIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}


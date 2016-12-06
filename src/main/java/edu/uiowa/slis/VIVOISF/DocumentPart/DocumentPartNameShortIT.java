package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartNameShortITIterator theDocumentPart = (DocumentPartNameShortITIterator)findAncestorWithClass(this, DocumentPartNameShortITIterator.class);
			pageContext.getOut().print(theDocumentPart.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}


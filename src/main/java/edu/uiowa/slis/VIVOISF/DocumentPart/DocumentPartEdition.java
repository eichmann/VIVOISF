package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartEditionIterator theDocumentPart = (DocumentPartEditionIterator)findAncestorWithClass(this, DocumentPartEditionIterator.class);
			pageContext.getOut().print(theDocumentPart.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for edition tag ");
		}
		return SKIP_BODY;
	}
}


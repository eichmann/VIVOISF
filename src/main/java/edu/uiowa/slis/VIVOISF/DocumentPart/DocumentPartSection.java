package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartSection currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartSectionIterator theDocumentPart = (DocumentPartSectionIterator)findAncestorWithClass(this, DocumentPartSectionIterator.class);
			pageContext.getOut().print(theDocumentPart.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for section tag ");
		}
		return SKIP_BODY;
	}
}


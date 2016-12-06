package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHDITotalIterator theDocumentPart = (DocumentPartHDITotalIterator)findAncestorWithClass(this, DocumentPartHDITotalIterator.class);
			pageContext.getOut().print(theDocumentPart.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}


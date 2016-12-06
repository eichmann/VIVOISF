package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAgriculturalAreaTotalIterator theDocumentPart = (DocumentPartAgriculturalAreaTotalIterator)findAncestorWithClass(this, DocumentPartAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theDocumentPart.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


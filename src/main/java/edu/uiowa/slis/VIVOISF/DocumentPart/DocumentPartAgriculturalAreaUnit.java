package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartAgriculturalAreaUnitIterator theDocumentPart = (DocumentPartAgriculturalAreaUnitIterator)findAncestorWithClass(this, DocumentPartAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theDocumentPart.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


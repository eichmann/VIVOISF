package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentAgriculturalAreaUnitIterator theDocument = (DocumentAgriculturalAreaUnitIterator)findAncestorWithClass(this, DocumentAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theDocument.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


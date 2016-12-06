package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentAgriculturalAreaTotalIterator theDocument = (DocumentAgriculturalAreaTotalIterator)findAncestorWithClass(this, DocumentAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theDocument.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


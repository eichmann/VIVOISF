package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartLandAreaUnitIterator theDocumentPart = (DocumentPartLandAreaUnitIterator)findAncestorWithClass(this, DocumentPartLandAreaUnitIterator.class);
			pageContext.getOut().print(theDocumentPart.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


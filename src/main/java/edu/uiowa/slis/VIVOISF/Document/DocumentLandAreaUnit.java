package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLandAreaUnitIterator theDocument = (DocumentLandAreaUnitIterator)findAncestorWithClass(this, DocumentLandAreaUnitIterator.class);
			pageContext.getOut().print(theDocument.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLandAreaTotalIterator theDocument = (DocumentLandAreaTotalIterator)findAncestorWithClass(this, DocumentLandAreaTotalIterator.class);
			pageContext.getOut().print(theDocument.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


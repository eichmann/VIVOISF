package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartLandAreaTotalIterator theDocumentPart = (DocumentPartLandAreaTotalIterator)findAncestorWithClass(this, DocumentPartLandAreaTotalIterator.class);
			pageContext.getOut().print(theDocumentPart.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}


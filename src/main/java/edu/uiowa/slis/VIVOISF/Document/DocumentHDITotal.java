package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHDITotalIterator theDocument = (DocumentHDITotalIterator)findAncestorWithClass(this, DocumentHDITotalIterator.class);
			pageContext.getOut().print(theDocument.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}


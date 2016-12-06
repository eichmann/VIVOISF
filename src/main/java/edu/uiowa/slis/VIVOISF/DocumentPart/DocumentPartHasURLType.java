package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasURLIterator theDocumentPartHasURLIterator = (DocumentPartHasURLIterator)findAncestorWithClass(this, DocumentPartHasURLIterator.class);
			pageContext.getOut().print(theDocumentPartHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasURL tag ");
		}
		return SKIP_BODY;
	}
}


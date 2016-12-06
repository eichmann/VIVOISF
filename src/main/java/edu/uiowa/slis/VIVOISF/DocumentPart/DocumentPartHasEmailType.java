package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasEmailIterator theDocumentPartHasEmailIterator = (DocumentPartHasEmailIterator)findAncestorWithClass(this, DocumentPartHasEmailIterator.class);
			pageContext.getOut().print(theDocumentPartHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}


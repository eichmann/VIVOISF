package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartStatusIterator theDocumentPartStatusIterator = (DocumentPartStatusIterator)findAncestorWithClass(this, DocumentPartStatusIterator.class);
			pageContext.getOut().print(theDocumentPartStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for status tag ");
		}
		return SKIP_BODY;
	}
}


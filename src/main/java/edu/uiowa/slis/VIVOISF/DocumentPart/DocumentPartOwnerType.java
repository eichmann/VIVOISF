package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartOwnerIterator theDocumentPartOwnerIterator = (DocumentPartOwnerIterator)findAncestorWithClass(this, DocumentPartOwnerIterator.class);
			pageContext.getOut().print(theDocumentPartOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for owner tag ");
		}
		return SKIP_BODY;
	}
}


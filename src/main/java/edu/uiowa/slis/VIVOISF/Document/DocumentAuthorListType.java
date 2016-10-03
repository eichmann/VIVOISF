package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentAuthorListIterator theDocumentAuthorListIterator = (DocumentAuthorListIterator)findAncestorWithClass(this, DocumentAuthorListIterator.class);
			pageContext.getOut().print(theDocumentAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for authorList tag ");
		}
		return SKIP_BODY;
	}
}


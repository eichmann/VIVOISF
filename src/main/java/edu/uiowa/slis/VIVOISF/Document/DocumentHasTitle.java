package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHasTitleIterator theDocumentHasTitleIterator = (DocumentHasTitleIterator)findAncestorWithClass(this, DocumentHasTitleIterator.class);
			pageContext.getOut().print(theDocumentHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}


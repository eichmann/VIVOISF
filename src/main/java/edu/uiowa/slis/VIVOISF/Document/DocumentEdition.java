package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentEditionIterator theDocument = (DocumentEditionIterator)findAncestorWithClass(this, DocumentEditionIterator.class);
			pageContext.getOut().print(theDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for edition tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListITIterator theDocument = (DocumentNameListITIterator)findAncestorWithClass(this, DocumentNameListITIterator.class);
			pageContext.getOut().print(theDocument.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}


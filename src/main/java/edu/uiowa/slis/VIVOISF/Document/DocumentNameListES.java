package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListESIterator theDocument = (DocumentNameListESIterator)findAncestorWithClass(this, DocumentNameListESIterator.class);
			pageContext.getOut().print(theDocument.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListES tag ");
		}
		return SKIP_BODY;
	}
}


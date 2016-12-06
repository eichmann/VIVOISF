package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListARIterator theDocument = (DocumentNameListARIterator)findAncestorWithClass(this, DocumentNameListARIterator.class);
			pageContext.getOut().print(theDocument.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameListFRIterator theDocument = (DocumentNameListFRIterator)findAncestorWithClass(this, DocumentNameListFRIterator.class);
			pageContext.getOut().print(theDocument.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}


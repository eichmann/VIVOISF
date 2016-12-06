package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortFRIterator theDocument = (DocumentNameShortFRIterator)findAncestorWithClass(this, DocumentNameShortFRIterator.class);
			pageContext.getOut().print(theDocument.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortARIterator theDocument = (DocumentNameShortARIterator)findAncestorWithClass(this, DocumentNameShortARIterator.class);
			pageContext.getOut().print(theDocument.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}


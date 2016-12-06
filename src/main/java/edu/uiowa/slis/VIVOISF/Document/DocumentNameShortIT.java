package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortITIterator theDocument = (DocumentNameShortITIterator)findAncestorWithClass(this, DocumentNameShortITIterator.class);
			pageContext.getOut().print(theDocument.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}


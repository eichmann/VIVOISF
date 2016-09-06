package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPmidIterator theDocument = (DocumentPmidIterator)findAncestorWithClass(this, DocumentPmidIterator.class);
			pageContext.getOut().print(theDocument.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for pmid tag ");
		}
		return SKIP_BODY;
	}
}


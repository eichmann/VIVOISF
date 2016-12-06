package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentDateTimeIntervalIterator theDocumentDateTimeIntervalIterator = (DocumentDateTimeIntervalIterator)findAncestorWithClass(this, DocumentDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDocumentDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentDateTimeIntervalIterator theDocumentDateTimeIntervalIterator = (DocumentDateTimeIntervalIterator)findAncestorWithClass(this, DocumentDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDocumentDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}


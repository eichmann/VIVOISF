package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentDateTimeValueIterator theDocumentDateTimeValueIterator = (DocumentDateTimeValueIterator)findAncestorWithClass(this, DocumentDateTimeValueIterator.class);
			pageContext.getOut().print(theDocumentDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}


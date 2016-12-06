package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDateTimeIntervalIterator theDocumentPartDateTimeIntervalIterator = (DocumentPartDateTimeIntervalIterator)findAncestorWithClass(this, DocumentPartDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDocumentPartDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}


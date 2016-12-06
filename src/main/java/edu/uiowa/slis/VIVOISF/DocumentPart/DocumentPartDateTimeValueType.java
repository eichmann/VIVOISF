package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartDateTimeValueIterator theDocumentPartDateTimeValueIterator = (DocumentPartDateTimeValueIterator)findAncestorWithClass(this, DocumentPartDateTimeValueIterator.class);
			pageContext.getOut().print(theDocumentPartDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}


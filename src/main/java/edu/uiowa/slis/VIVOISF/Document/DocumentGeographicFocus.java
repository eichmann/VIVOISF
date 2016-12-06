package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentGeographicFocusIterator theDocumentGeographicFocusIterator = (DocumentGeographicFocusIterator)findAncestorWithClass(this, DocumentGeographicFocusIterator.class);
			pageContext.getOut().print(theDocumentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}


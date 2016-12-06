package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGeographicFocusIterator theDocumentPartGeographicFocusIterator = (DocumentPartGeographicFocusIterator)findAncestorWithClass(this, DocumentPartGeographicFocusIterator.class);
			pageContext.getOut().print(theDocumentPartGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}


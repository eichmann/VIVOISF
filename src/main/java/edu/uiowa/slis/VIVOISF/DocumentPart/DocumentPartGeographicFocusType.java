package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartGeographicFocusIterator theDocumentPartGeographicFocusIterator = (DocumentPartGeographicFocusIterator)findAncestorWithClass(this, DocumentPartGeographicFocusIterator.class);
			pageContext.getOut().print(theDocumentPartGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}


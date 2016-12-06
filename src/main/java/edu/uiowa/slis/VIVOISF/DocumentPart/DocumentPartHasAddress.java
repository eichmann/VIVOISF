package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartHasAddressIterator theDocumentPartHasAddressIterator = (DocumentPartHasAddressIterator)findAncestorWithClass(this, DocumentPartHasAddressIterator.class);
			pageContext.getOut().print(theDocumentPartHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

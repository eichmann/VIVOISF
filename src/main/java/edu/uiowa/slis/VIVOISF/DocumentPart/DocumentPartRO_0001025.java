package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartRO_0001025Iterator theDocumentPartRO_0001025Iterator = (DocumentPartRO_0001025Iterator)findAncestorWithClass(this, DocumentPartRO_0001025Iterator.class);
			pageContext.getOut().print(theDocumentPartRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}


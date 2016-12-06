package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartBFO_0000050Iterator theDocumentPartBFO_0000050Iterator = (DocumentPartBFO_0000050Iterator)findAncestorWithClass(this, DocumentPartBFO_0000050Iterator.class);
			pageContext.getOut().print(theDocumentPartBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}


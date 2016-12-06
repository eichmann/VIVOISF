package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartBFO_0000051Iterator theDocumentPartBFO_0000051Iterator = (DocumentPartBFO_0000051Iterator)findAncestorWithClass(this, DocumentPartBFO_0000051Iterator.class);
			pageContext.getOut().print(theDocumentPartBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}


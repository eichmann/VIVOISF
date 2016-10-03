package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartEanucc13Iterator theDocumentPart = (DocumentPartEanucc13Iterator)findAncestorWithClass(this, DocumentPartEanucc13Iterator.class);
			pageContext.getOut().print(theDocumentPart.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}


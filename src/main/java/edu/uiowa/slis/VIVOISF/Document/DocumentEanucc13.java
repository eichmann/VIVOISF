package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentEanucc13Iterator theDocument = (DocumentEanucc13Iterator)findAncestorWithClass(this, DocumentEanucc13Iterator.class);
			pageContext.getOut().print(theDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentGtin14Iterator theDocument = (DocumentGtin14Iterator)findAncestorWithClass(this, DocumentGtin14Iterator.class);
			pageContext.getOut().print(theDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}


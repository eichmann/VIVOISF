package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeISO3Iterator theDocument = (DocumentCodeISO3Iterator)findAncestorWithClass(this, DocumentCodeISO3Iterator.class);
			pageContext.getOut().print(theDocument.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}


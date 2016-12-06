package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeISO2Iterator theDocument = (DocumentCodeISO2Iterator)findAncestorWithClass(this, DocumentCodeISO2Iterator.class);
			pageContext.getOut().print(theDocument.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}


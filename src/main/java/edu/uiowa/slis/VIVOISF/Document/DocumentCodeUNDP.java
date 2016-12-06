package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentCodeUNDPIterator theDocument = (DocumentCodeUNDPIterator)findAncestorWithClass(this, DocumentCodeUNDPIterator.class);
			pageContext.getOut().print(theDocument.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}


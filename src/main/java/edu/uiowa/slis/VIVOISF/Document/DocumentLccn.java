package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentLccnIterator theDocument = (DocumentLccnIterator)findAncestorWithClass(this, DocumentLccnIterator.class);
			pageContext.getOut().print(theDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for lccn tag ");
		}
		return SKIP_BODY;
	}
}


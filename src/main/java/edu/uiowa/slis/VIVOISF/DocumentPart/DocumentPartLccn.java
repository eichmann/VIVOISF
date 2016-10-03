package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPartLccnIterator theDocumentPart = (DocumentPartLccnIterator)findAncestorWithClass(this, DocumentPartLccnIterator.class);
			pageContext.getOut().print(theDocumentPart.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for lccn tag ");
		}
		return SKIP_BODY;
	}
}


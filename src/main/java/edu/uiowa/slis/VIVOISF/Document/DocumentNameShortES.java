package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentNameShortESIterator theDocument = (DocumentNameShortESIterator)findAncestorWithClass(this, DocumentNameShortESIterator.class);
			pageContext.getOut().print(theDocument.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}


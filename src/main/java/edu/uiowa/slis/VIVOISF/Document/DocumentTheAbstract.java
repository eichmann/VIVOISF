package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentTheAbstractIterator theDocument = (DocumentTheAbstractIterator)findAncestorWithClass(this, DocumentTheAbstractIterator.class);
			pageContext.getOut().print(theDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentHandleIterator theDocument = (DocumentHandleIterator)findAncestorWithClass(this, DocumentHandleIterator.class);
			pageContext.getOut().print(theDocument.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for handle tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentTheAbstractIterator theCollectedDocument = (CollectedDocumentTheAbstractIterator)findAncestorWithClass(this, CollectedDocumentTheAbstractIterator.class);
			pageContext.getOut().print(theCollectedDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}


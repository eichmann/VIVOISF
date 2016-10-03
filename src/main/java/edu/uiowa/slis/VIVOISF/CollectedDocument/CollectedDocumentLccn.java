package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentLccnIterator theCollectedDocument = (CollectedDocumentLccnIterator)findAncestorWithClass(this, CollectedDocumentLccnIterator.class);
			pageContext.getOut().print(theCollectedDocument.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for lccn tag ");
		}
		return SKIP_BODY;
	}
}


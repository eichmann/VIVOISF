package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentEanucc13Iterator theCollectedDocument = (CollectedDocumentEanucc13Iterator)findAncestorWithClass(this, CollectedDocumentEanucc13Iterator.class);
			pageContext.getOut().print(theCollectedDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentERO_0000045Iterator theCollectedDocument = (CollectedDocumentERO_0000045Iterator)findAncestorWithClass(this, CollectedDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(theCollectedDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}


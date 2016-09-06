package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefDocumentationForIterator theBriefDocumentationForIterator = (BriefDocumentationForIterator)findAncestorWithClass(this, BriefDocumentationForIterator.class);
			pageContext.getOut().print(theBriefDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


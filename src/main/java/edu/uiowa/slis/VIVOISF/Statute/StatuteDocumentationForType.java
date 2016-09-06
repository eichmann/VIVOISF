package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteDocumentationForIterator theStatuteDocumentationForIterator = (StatuteDocumentationForIterator)findAncestorWithClass(this, StatuteDocumentationForIterator.class);
			pageContext.getOut().print(theStatuteDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


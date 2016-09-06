package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayDocumentationForIterator theScreenplayDocumentationForIterator = (ScreenplayDocumentationForIterator)findAncestorWithClass(this, ScreenplayDocumentationForIterator.class);
			pageContext.getOut().print(theScreenplayDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


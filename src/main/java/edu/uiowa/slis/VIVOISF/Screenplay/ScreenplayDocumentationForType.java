package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayDocumentationForIterator theScreenplayDocumentationForIterator = (ScreenplayDocumentationForIterator)findAncestorWithClass(this, ScreenplayDocumentationForIterator.class);
			pageContext.getOut().print(theScreenplayDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


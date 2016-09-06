package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentDocumentationForIterator thePatentDocumentationForIterator = (PatentDocumentationForIterator)findAncestorWithClass(this, PatentDocumentationForIterator.class);
			pageContext.getOut().print(thePatentDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptDocumentationForIterator theManuscriptDocumentationForIterator = (ManuscriptDocumentationForIterator)findAncestorWithClass(this, ManuscriptDocumentationForIterator.class);
			pageContext.getOut().print(theManuscriptDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}


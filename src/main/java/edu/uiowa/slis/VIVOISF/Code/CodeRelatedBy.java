package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeRelatedByIterator theCodeRelatedByIterator = (CodeRelatedByIterator)findAncestorWithClass(this, CodeRelatedByIterator.class);
			pageContext.getOut().print(theCodeRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}


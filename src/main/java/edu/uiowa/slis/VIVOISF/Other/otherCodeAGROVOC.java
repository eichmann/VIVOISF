package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(otherCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			otherCodeAGROVOCIterator theother = (otherCodeAGROVOCIterator)findAncestorWithClass(this, otherCodeAGROVOCIterator.class);
			pageContext.getOut().print(theother.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing other for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}


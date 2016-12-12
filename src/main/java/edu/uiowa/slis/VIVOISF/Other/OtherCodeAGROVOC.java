package edu.uiowa.slis.VIVOISF.Other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OtherCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OtherCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(OtherCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OtherCodeAGROVOCIterator theOther = (OtherCodeAGROVOCIterator)findAncestorWithClass(this, OtherCodeAGROVOCIterator.class);
			pageContext.getOut().print(theOther.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Other for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Other for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}


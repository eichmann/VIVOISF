package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeDoiIterator theCode = (CodeDoiIterator)findAncestorWithClass(this, CodeDoiIterator.class);
			pageContext.getOut().print(theCode.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for doi tag ");
		}
		return SKIP_BODY;
	}
}


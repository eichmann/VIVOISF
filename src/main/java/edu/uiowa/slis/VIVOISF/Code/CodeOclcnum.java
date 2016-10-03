package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeOclcnumIterator theCode = (CodeOclcnumIterator)findAncestorWithClass(this, CodeOclcnumIterator.class);
			pageContext.getOut().print(theCode.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeEissnIterator theCode = (CodeEissnIterator)findAncestorWithClass(this, CodeEissnIterator.class);
			pageContext.getOut().print(theCode.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for eissn tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeIssnIterator theCode = (CodeIssnIterator)findAncestorWithClass(this, CodeIssnIterator.class);
			pageContext.getOut().print(theCode.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for issn tag ");
		}
		return SKIP_BODY;
	}
}


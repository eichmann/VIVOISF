package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeEanucc13Iterator theCode = (CodeEanucc13Iterator)findAncestorWithClass(this, CodeEanucc13Iterator.class);
			pageContext.getOut().print(theCode.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}


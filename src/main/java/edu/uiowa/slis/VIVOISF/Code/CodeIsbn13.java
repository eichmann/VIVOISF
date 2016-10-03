package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeIsbn13Iterator theCode = (CodeIsbn13Iterator)findAncestorWithClass(this, CodeIsbn13Iterator.class);
			pageContext.getOut().print(theCode.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}


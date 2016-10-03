package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeIsbn10Iterator theCode = (CodeIsbn10Iterator)findAncestorWithClass(this, CodeIsbn10Iterator.class);
			pageContext.getOut().print(theCode.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}


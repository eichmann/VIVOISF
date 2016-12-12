package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeISO3Iterator theSelf_governing = (Self_governingCodeISO3Iterator)findAncestorWithClass(this, Self_governingCodeISO3Iterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}


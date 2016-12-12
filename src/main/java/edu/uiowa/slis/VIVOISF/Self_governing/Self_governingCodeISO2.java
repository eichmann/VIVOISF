package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeISO2Iterator theSelf_governing = (Self_governingCodeISO2Iterator)findAncestorWithClass(this, Self_governingCodeISO2Iterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}


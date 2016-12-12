package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeFAOSTATIterator theSelf_governing = (Self_governingCodeFAOSTATIterator)findAncestorWithClass(this, Self_governingCodeFAOSTATIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


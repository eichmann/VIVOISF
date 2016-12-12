package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeUNDPIterator theSelf_governing = (Self_governingCodeUNDPIterator)findAncestorWithClass(this, Self_governingCodeUNDPIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}


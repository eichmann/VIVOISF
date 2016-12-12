package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeUNIterator theSelf_governing = (Self_governingCodeUNIterator)findAncestorWithClass(this, Self_governingCodeUNIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeUN tag ");
		}
		return SKIP_BODY;
	}
}


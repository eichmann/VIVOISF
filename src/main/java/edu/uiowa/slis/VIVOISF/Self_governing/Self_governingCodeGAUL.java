package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeGAULIterator theSelf_governing = (Self_governingCodeGAULIterator)findAncestorWithClass(this, Self_governingCodeGAULIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}


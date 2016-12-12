package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeAGROVOCIterator theSelf_governing = (Self_governingCodeAGROVOCIterator)findAncestorWithClass(this, Self_governingCodeAGROVOCIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}


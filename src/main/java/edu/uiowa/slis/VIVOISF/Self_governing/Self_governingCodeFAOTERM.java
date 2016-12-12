package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingCodeFAOTERMIterator theSelf_governing = (Self_governingCodeFAOTERMIterator)findAncestorWithClass(this, Self_governingCodeFAOTERMIterator.class);
			pageContext.getOut().print(theSelf_governing.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


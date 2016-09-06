package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeFAOSTATIterator theself_governing = (self_governingCodeFAOSTATIterator)findAncestorWithClass(this, self_governingCodeFAOSTATIterator.class);
			pageContext.getOut().print(theself_governing.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


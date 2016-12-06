package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008CodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008CodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008CodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008CodeFAOSTATIterator theBFO_0000008 = (BFO_0000008CodeFAOSTATIterator)findAncestorWithClass(this, BFO_0000008CodeFAOSTATIterator.class);
			pageContext.getOut().print(theBFO_0000008.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


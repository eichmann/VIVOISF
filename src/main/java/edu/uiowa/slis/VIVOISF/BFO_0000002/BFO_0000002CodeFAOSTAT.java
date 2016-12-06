package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002CodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002CodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002CodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002CodeFAOSTATIterator theBFO_0000002 = (BFO_0000002CodeFAOSTATIterator)findAncestorWithClass(this, BFO_0000002CodeFAOSTATIterator.class);
			pageContext.getOut().print(theBFO_0000002.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379CodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379CodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379CodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379CodeFAOSTATIterator theARG_2000379 = (ARG_2000379CodeFAOSTATIterator)findAncestorWithClass(this, ARG_2000379CodeFAOSTATIterator.class);
			pageContext.getOut().print(theARG_2000379.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


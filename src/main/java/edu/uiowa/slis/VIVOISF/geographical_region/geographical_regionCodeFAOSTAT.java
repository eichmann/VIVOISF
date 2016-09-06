package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeFAOSTATIterator thegeographical_region = (geographical_regionCodeFAOSTATIterator)findAncestorWithClass(this, geographical_regionCodeFAOSTATIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionCodeFAOSTATIterator theGeographical_region = (Geographical_regionCodeFAOSTATIterator)findAncestorWithClass(this, Geographical_regionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theGeographical_region.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}


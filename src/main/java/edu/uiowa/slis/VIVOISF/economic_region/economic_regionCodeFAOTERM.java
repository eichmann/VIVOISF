package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeFAOTERMIterator theeconomic_region = (economic_regionCodeFAOTERMIterator)findAncestorWithClass(this, economic_regionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionCodeFAOTERMIterator thegeographical_region = (geographical_regionCodeFAOTERMIterator)findAncestorWithClass(this, geographical_regionCodeFAOTERMIterator.class);
			pageContext.getOut().print(thegeographical_region.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


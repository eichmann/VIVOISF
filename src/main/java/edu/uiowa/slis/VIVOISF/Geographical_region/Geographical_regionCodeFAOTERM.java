package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionCodeFAOTERMIterator theGeographical_region = (Geographical_regionCodeFAOTERMIterator)findAncestorWithClass(this, Geographical_regionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGeographical_region.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


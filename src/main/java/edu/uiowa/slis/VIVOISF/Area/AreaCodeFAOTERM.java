package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaCodeFAOTERMIterator theArea = (AreaCodeFAOTERMIterator)findAncestorWithClass(this, AreaCodeFAOTERMIterator.class);
			pageContext.getOut().print(theArea.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


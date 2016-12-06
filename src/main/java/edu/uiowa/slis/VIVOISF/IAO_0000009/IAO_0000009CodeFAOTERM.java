package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009CodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009CodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009CodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009CodeFAOTERMIterator theIAO_0000009 = (IAO_0000009CodeFAOTERMIterator)findAncestorWithClass(this, IAO_0000009CodeFAOTERMIterator.class);
			pageContext.getOut().print(theIAO_0000009.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


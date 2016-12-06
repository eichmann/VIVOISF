package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionCodeFAOTERMIterator thePrimaryPosition = (PrimaryPositionCodeFAOTERMIterator)findAncestorWithClass(this, PrimaryPositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


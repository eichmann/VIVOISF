package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionCodeFAOTERMIterator thePosition = (PositionCodeFAOTERMIterator)findAncestorWithClass(this, PositionCodeFAOTERMIterator.class);
			pageContext.getOut().print(thePosition.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}


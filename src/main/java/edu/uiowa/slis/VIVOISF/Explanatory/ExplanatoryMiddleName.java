package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryMiddleNameIterator theExplanatory = (ExplanatoryMiddleNameIterator)findAncestorWithClass(this, ExplanatoryMiddleNameIterator.class);
			pageContext.getOut().print(theExplanatory.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for middleName tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionPerformerInverseIterator theDivisionPerformerInverseIterator = (DivisionPerformerInverseIterator)findAncestorWithClass(this, DivisionPerformerInverseIterator.class);
			pageContext.getOut().print(theDivisionPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for performer tag ");
		}
		return SKIP_BODY;
	}
}


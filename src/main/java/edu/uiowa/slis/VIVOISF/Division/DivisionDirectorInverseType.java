package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionDirectorInverseIterator theDivisionDirectorInverseIterator = (DivisionDirectorInverseIterator)findAncestorWithClass(this, DivisionDirectorInverseIterator.class);
			pageContext.getOut().print(theDivisionDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for director tag ");
		}
		return SKIP_BODY;
	}
}


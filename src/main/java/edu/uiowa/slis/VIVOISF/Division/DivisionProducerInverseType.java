package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionProducerInverseIterator theDivisionProducerInverseIterator = (DivisionProducerInverseIterator)findAncestorWithClass(this, DivisionProducerInverseIterator.class);
			pageContext.getOut().print(theDivisionProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for producer tag ");
		}
		return SKIP_BODY;
	}
}


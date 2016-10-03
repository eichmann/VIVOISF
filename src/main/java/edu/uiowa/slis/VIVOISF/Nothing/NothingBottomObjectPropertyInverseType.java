package edu.uiowa.slis.VIVOISF.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingBottomObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NothingBottomObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingBottomObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingBottomObjectPropertyInverseIterator theNothingBottomObjectPropertyInverseIterator = (NothingBottomObjectPropertyInverseIterator)findAncestorWithClass(this, NothingBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theNothingBottomObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}


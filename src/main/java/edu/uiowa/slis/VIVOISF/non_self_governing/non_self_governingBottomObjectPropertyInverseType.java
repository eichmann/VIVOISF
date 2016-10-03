package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingBottomObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingBottomObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingBottomObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingBottomObjectPropertyInverseIterator thenon_self_governingBottomObjectPropertyInverseIterator = (non_self_governingBottomObjectPropertyInverseIterator)findAncestorWithClass(this, non_self_governingBottomObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thenon_self_governingBottomObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}


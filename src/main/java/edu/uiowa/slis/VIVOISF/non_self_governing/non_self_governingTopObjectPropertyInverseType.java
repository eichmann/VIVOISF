package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingTopObjectPropertyInverseIterator thenon_self_governingTopObjectPropertyInverseIterator = (non_self_governingTopObjectPropertyInverseIterator)findAncestorWithClass(this, non_self_governingTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(thenon_self_governingTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

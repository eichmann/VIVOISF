package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingTopObjectPropertyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingTopObjectPropertyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingTopObjectPropertyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingTopObjectPropertyInverseIterator theself_governingTopObjectPropertyInverseIterator = (self_governingTopObjectPropertyInverseIterator)findAncestorWithClass(this, self_governingTopObjectPropertyInverseIterator.class);
			pageContext.getOut().print(theself_governingTopObjectPropertyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingTopObjectPropertyType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingTopObjectPropertyType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingTopObjectPropertyType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingTopObjectPropertyIterator theself_governingTopObjectPropertyIterator = (self_governingTopObjectPropertyIterator)findAncestorWithClass(this, self_governingTopObjectPropertyIterator.class);
			pageContext.getOut().print(theself_governingTopObjectPropertyIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}


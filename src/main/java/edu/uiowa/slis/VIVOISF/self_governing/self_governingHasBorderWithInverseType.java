package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasBorderWithInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasBorderWithInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasBorderWithInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasBorderWithInverseIterator theself_governingHasBorderWithInverseIterator = (self_governingHasBorderWithInverseIterator)findAncestorWithClass(this, self_governingHasBorderWithInverseIterator.class);
			pageContext.getOut().print(theself_governingHasBorderWithInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}


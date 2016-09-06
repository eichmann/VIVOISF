package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasBorderWithType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasBorderWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasBorderWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasBorderWithIterator theself_governingHasBorderWithIterator = (self_governingHasBorderWithIterator)findAncestorWithClass(this, self_governingHasBorderWithIterator.class);
			pageContext.getOut().print(theself_governingHasBorderWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}


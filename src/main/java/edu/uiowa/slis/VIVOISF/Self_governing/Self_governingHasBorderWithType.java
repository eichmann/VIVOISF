package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHasBorderWithType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHasBorderWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHasBorderWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingHasBorderWithIterator theSelf_governingHasBorderWithIterator = (Self_governingHasBorderWithIterator)findAncestorWithClass(this, Self_governingHasBorderWithIterator.class);
			pageContext.getOut().print(theSelf_governingHasBorderWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}


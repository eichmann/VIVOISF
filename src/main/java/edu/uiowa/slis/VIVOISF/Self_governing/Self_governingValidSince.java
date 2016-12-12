package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingValidSinceIterator theSelf_governing = (Self_governingValidSinceIterator)findAncestorWithClass(this, Self_governingValidSinceIterator.class);
			pageContext.getOut().print(theSelf_governing.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for validSince tag ");
		}
		return SKIP_BODY;
	}
}


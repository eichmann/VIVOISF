package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortZHIterator theSelf_governing = (Self_governingNameShortZHIterator)findAncestorWithClass(this, Self_governingNameShortZHIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}


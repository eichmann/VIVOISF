package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHDIYearIterator theSelf_governing = (Self_governingHDIYearIterator)findAncestorWithClass(this, Self_governingHDIYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}


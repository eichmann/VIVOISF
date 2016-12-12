package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingGDPYearIterator theSelf_governing = (Self_governingGDPYearIterator)findAncestorWithClass(this, Self_governingGDPYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}


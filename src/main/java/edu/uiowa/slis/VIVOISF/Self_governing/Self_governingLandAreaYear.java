package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingLandAreaYearIterator theSelf_governing = (Self_governingLandAreaYearIterator)findAncestorWithClass(this, Self_governingLandAreaYearIterator.class);
			pageContext.getOut().print(theSelf_governing.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}


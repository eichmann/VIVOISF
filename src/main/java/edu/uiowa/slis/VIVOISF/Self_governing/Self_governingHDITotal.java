package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingHDITotalIterator theSelf_governing = (Self_governingHDITotalIterator)findAncestorWithClass(this, Self_governingHDITotalIterator.class);
			pageContext.getOut().print(theSelf_governing.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

